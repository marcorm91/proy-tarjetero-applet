package Modelo;

import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.imageio.ImageIO;

/**
 *
 * @author marco
 */
public class MEmpresa {
    
    private final Connection conexion;
    
    public MEmpresa(Connection conexion){
        this.conexion = conexion;
    }

    /**
     * Registra una empresa en la tabla empresa de la BD.
     * @param codEmpresa        Código de la empresa.
     * @param nombreEmpresa     Nombre de la empresa.
     * @param cifEmpresa        CIF de la empresa.
     * @param dirEmpresa        Dirección de la empresa.
     * @param tlf1Empresa       Teléfono 1 de la empresa.
     * @param tlf2Empresa       Teléfono 2 de la empresa.
     * @param etiquetas         Etiquetas de la empresa.
     * @param rutaLogo          Ruta del logo insertado.
     * @return Devolverá un booleano para comprobar que el registro fue insertado correctamente en la BD.
     */
    public boolean registraEmpresa(String codEmpresa, String nombreEmpresa, String cifEmpresa, String dirEmpresa, String tlf1Empresa, String tlf2Empresa, String etiquetas, String rutaLogo) {
              
        String registraEmpresa = "insert into empresa values(?,?,?,?,?,?,?,?);";
                
        boolean insertado = false;
        
            File archivo = new File(rutaLogo);
            FileInputStream fis = null;
            
            try {
                fis = new FileInputStream(archivo);
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            }               

            try{

                PreparedStatement sentencia = conexion.prepareStatement(registraEmpresa);

                    sentencia.setString(1, codEmpresa);
                    sentencia.setString(2, nombreEmpresa);
                    sentencia.setString(3, cifEmpresa);
                    sentencia.setString(4, dirEmpresa);
                    sentencia.setString(5, tlf1Empresa);
                    sentencia.setString(6, tlf2Empresa);
                    sentencia.setString(7, etiquetas);
                    sentencia.setBinaryStream(8, fis, (int)archivo.length());

                    sentencia.executeUpdate();

                    insertado = true;

            }catch(SQLException e){
                System.out.println(e);
            }

        return insertado;
        
    }
    
    /**
     * Realizamos una busqueda completa de todas las empresas existentes en la tabla empresa. 
     * @return Devuelve un ArrayList al controlador para que posteriormente sea mostrado por pantalla.
     */
     public ArrayList selectEmpresa() {
        ArrayList lista = new ArrayList();
        String codigo, nombre = null;
       
        String selectEmpresas = "select * from empresa order by codempresa;";
        
        try{
            PreparedStatement sentencia = conexion.prepareStatement(selectEmpresas);
            ResultSet rs = sentencia.executeQuery();
            
                while(rs.next()){
                    codigo = rs.getString("codempresa");
                    nombre = rs.getString("nombre");
                    lista.add("[" + codigo + "] - " + nombre);
                }
     
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return lista;
    }

     /**
      * Método que recoge todos los datos de la empresa según código pasado.
      * @param id   Se le pasa por parámetro el código de la empresa.
      * @return Devuelve en un array de String todos los datos de cada columna del código dado.
      */
    public Object[] recogeDatos(String id) {
        
        Object datos[] = new Object[8];

        String selectEmpresa = "select * from empresa where codempresa = ?;";
           
        try{
            PreparedStatement sentencia = conexion.prepareStatement(selectEmpresa);
            sentencia.setString(1, id);
            ResultSet rs = sentencia.executeQuery();
            
            BufferedImage imagen = null;
            byte[] imagenBytes = null;
            
            while(rs.next()){
                datos[0] = rs.getString("codempresa");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("cif");
                datos[3] = rs.getString("direccion");
                datos[4] = rs.getString("tlf1");
                datos[5] = rs.getString("tlf2");
                datos[6] = rs.getString("etiquetas");
                imagenBytes = rs.getBytes("logo");
            }
            
            try{
                imagen = ImageIO.read(new ByteArrayInputStream(imagenBytes));
            }catch(IOException e){
                System.out.println(e);
            }
            
                datos[7] = imagen;

        }catch(Exception e){
            System.out.println(e);
        }
        
        return datos;
    }

    
    /**
     * Método que actualiza la empresa que fue consultada previamente.
     * @param codEmpresa        Código de la empresa.
     * @param nombreEmpresa     Nombre de la empresa.
     * @param cifEmpresa        CIF de la empresa.
     * @param dirEmpresa        Dirección de la empresa.
     * @param tlf1Empresa       Teléfono 1 de la empresa.
     * @param tlf2Empresa       Teléfono 2 de la empresa.
     * @param etiquetas         Etiquetas de la empresa.
     * @param rutaLogo          Ruta del logo insertado.
     * @return  Devuelve true si la empresa se actualizó correctamente.
     */
    public boolean actualizaEmpresa(String codEmpresa, String nombreEmpresa, String cifEmpresa, String dirEmpresa, String tlf1Empresa, String tlf2Empresa, String etiquetas, String rutaLogo) {
        
        boolean modificado = false;
        File archivo = new File(rutaLogo);
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream(archivo);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        //Si la ruta de la imagen no está vacía hace una actualización de la empresa con todos los campos.
        if(!rutaLogo.equalsIgnoreCase("")){

            String modificaEmpresa = "update empresa set codempresa = ?, nombre = ?, cif = ?, "
                                   + "direccion = ?, tlf1 = ?, tlf2 = ?, etiquetas = ?, logo = ? where codempresa like ?;";

            try{
                PreparedStatement sentencia = conexion.prepareStatement(modificaEmpresa);

                BufferedImage imagen = null;
                byte[] imagenBytes = null;

                    sentencia.setString(1, codEmpresa);
                    sentencia.setString(2, nombreEmpresa);
                    sentencia.setString(3, cifEmpresa);
                    sentencia.setString(4, dirEmpresa);
                    sentencia.setString(5, tlf1Empresa);
                    sentencia.setString(6, tlf2Empresa);
                    sentencia.setString(7, etiquetas);
                    sentencia.setBinaryStream(8, fis, (int)archivo.length());
                    sentencia.setString(9, codEmpresa);

                    sentencia.executeUpdate();

                    modificado = true;

            }catch(SQLException e){
                System.out.println(e);
            }

        //Sino, quiere decir que la ruta del logo está vacía (el usuario quiere cambiar cualquier dato menos la imagen) y no actualiza el campo logo.
        }else{
            String modificaEmpresa = "update empresa set codempresa = ?, nombre = ?, cif = ?, "
                                   + "direccion = ?, tlf1 = ?, tlf2 = ?, etiquetas = ? where codempresa like ?;";

            try{
                PreparedStatement sentencia = conexion.prepareStatement(modificaEmpresa);

                    sentencia.setString(1, codEmpresa);
                    sentencia.setString(2, nombreEmpresa);
                    sentencia.setString(3, cifEmpresa);
                    sentencia.setString(4, dirEmpresa);
                    sentencia.setString(5, tlf1Empresa);
                    sentencia.setString(6, tlf2Empresa);
                    sentencia.setString(7, etiquetas);
                    sentencia.setString(8, codEmpresa);

                    sentencia.executeUpdate();

                    modificado = true;

            }catch(SQLException e){
                System.out.println(e);
            }
        }
        
        return modificado;
        
    }

    
    /**
     * Elimina la empresa seleccionada de la tabla empresa.
     * @param empresa   Se le pasa por parámetro el código de la empresa.
     * @return Devolverá true si la empresa se eliminó correctamente.
     */
    public boolean eliminaEmpresa(String empresa) {
        String eliminaEmpresa = "delete from empresa where codempresa = ?;";
        
        boolean eliminado = false;
              
        try{     
            PreparedStatement sentencia = conexion.prepareStatement(eliminaEmpresa);
            
                sentencia.setString(1, empresa);

                sentencia.executeUpdate();

                eliminado = true;              
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return eliminado;
    }

    
}
