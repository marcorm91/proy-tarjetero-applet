package Modelo;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author marco
 */
public class MComercial {

    private final Connection conexion;
    
    public MComercial(Connection conexion) {
        this.conexion = conexion;
    }

    /**
     * Registro de comercial en la tabla comercial de la BD.
     * @param codComercial      Código comercial.
     * @param nombreComercial   Nombre comercial.
     * @param nifComercial      NIF comercial.
     * @param dirComercial      Dirección comercial.
     * @param tlfComercial      Teléfono comercial.
     * @param correoComercial   Correo comercial.
     * @param empresa           Empresa a la que pertenece el comercial.
     * @return Devuelve true si el registro fue insertado correctamente en la tabla.
     */
    public boolean registraComercial(String codComercial, String nombreComercial, String nifComercial, String dirComercial, String tlfComercial, String correoComercial, String empresa) {
        String registraEmpresa = "insert into comercial"
                               + " (codcomercial, codempresa, nombre, nif, direccion, tlf, correo) values(?,?,?,?,?,?,?);";
        
        boolean insertado = false;
              
        try{
     
            PreparedStatement sentencia = conexion.prepareStatement(registraEmpresa);
            
                sentencia.setString(1, codComercial);
                sentencia.setString(2, empresa);
                sentencia.setString(3, nombreComercial);
                sentencia.setString(4, nifComercial);
                sentencia.setString(5, dirComercial);
                sentencia.setString(6, tlfComercial);
                sentencia.setString(7, correoComercial);

                sentencia.executeUpdate();
                
                insertado = true;
                
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return insertado;
    }

    
    /**
     * Recoge los datos del comercial seleccionado por código de comercial.
     * Tras la búsqueda del comercial por su código nos devolverá en un array de String todos sus datos
     * para que posteriormente sean implementados en cada campo.
     * @param id    Se le pasa como parámetro el código de comercial. 
     * @return 
     */
    public Object[] recogeDatos(String id) {
        //Número de elementos a devolver en el array de objetos.
        Object datos[] = new Object[9];

        //Consulta a aplicar.
        String selectEmpresa = "select * from comercial co join empresa em on em.codempresa = co.codempresa where co.codcomercial = ?;";
           
        try{
            PreparedStatement sentencia = conexion.prepareStatement(selectEmpresa);
            sentencia.setString(1, id);
            ResultSet rs = sentencia.executeQuery();
            
            BufferedImage imagen = null;
            byte[] imagenBytes = null;
            
            while(rs.next()){
                datos[0] = rs.getString("codcomercial");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("nif");
                datos[3] = rs.getString("direccion");
                datos[4] = rs.getString("tlf");
                datos[5] = rs.getString("correo");
                datos[6] = rs.getString("codempresa");
                datos[7] = rs.getString(9);
                imagenBytes = rs.getBytes(15);
            }
            
            //Pasa la imagen a array de bytes.
            try{
                imagen = ImageIO.read(new ByteArrayInputStream(imagenBytes));
            }catch(Exception e){
                System.out.println(e);
            }
                //Posteriormente, ese array de bytes es pasado a la posición última del array de objetos
                //que devolverá para que posteriormente sea mostrada la imagen por pantalla.
                datos[8] = imagen;
  
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return datos;
    }

    
    /**
     * Actualización de comercial en la tabla comercial de la BD.
     * @param codComercial      Código comercial.
     * @param nombreComercial   Nombre comercial.
     * @param nifComercial      NIF comercial.
     * @param dirComercial      Dirección comercial.
     * @param tlfComercial      Teléfono comercial.
     * @param correoComercial   Correo comercial.
     * @param empresa           Empresa a la que pertenece el comercial.
     * @return Devuelve true si el registro fue actualizado correctamente en la tabla.
     */
    public boolean actualizaComercial(String codComercial, String nombreComercial, String nifComercial, String dirComercial, String tlfComercial, String correoComercial, String empresa) {
        
        String modificaComercial = "update comercial set codcomercial = ?, codempresa = ?, nombre = ?, nif = ?, "
                                 + "direccion = ?, tlf = ?, correo = ? where codcomercial = ?;";
        
        boolean modificado = false;
              
        try{
     
            PreparedStatement sentencia = conexion.prepareStatement(modificaComercial);
            
                sentencia.setString(1, codComercial);
                sentencia.setString(2, empresa);
                sentencia.setString(3, nombreComercial);
                sentencia.setString(4, nifComercial);
                sentencia.setString(5, dirComercial);
                sentencia.setString(6, tlfComercial);
                sentencia.setString(7, correoComercial);
                sentencia.setString(8, codComercial);

                sentencia.executeUpdate();
                                
                modificado = true;
                
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return modificado;
        
    }

    
    /**
     * Realizamos una busqueda completa de todas las empresas existentes en la tabla empresa.
     * Devuelve un ArrayList al controlador para que posteriormente sea mostrado por pantalla.
     * @return Devuelve una lista con el código, nombre y empresa de los comerciales.
     */
     public ArrayList selectComercial() {
        ArrayList lista = new ArrayList();
        String codigo, nombre, codempresa = null;
       
        String selectComercial = "select * from comercial co join empresa em on em.codempresa = co.codempresa order by co.codcomercial;";
        
        try{
            PreparedStatement sentencia = conexion.prepareStatement(selectComercial);
            ResultSet rs = sentencia.executeQuery();
            
                while(rs.next()){
                    codigo = rs.getString("codcomercial");
                    nombre = rs.getString("nombre");
                    codempresa = rs.getString(9);
                    lista.add("[" + codigo + "] - " + nombre + "  //  " + codempresa);
                }
     
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return lista;
    }

     
    /**
     * Elimina un comercial de la tabla comercial de la BD.
     * @param comercial     Se le pasa por parámetro el comercial a eliminar (Código comercial).
     * @return  Devuelve true si la eliminación se hizo correctamente.
     */
    public boolean eliminaComercial(String comercial) {
        String eliminaComercial = "delete from comercial where codcomercial = ?;";
        
        boolean eliminado = false;
              
        try{     
            PreparedStatement sentencia = conexion.prepareStatement(eliminaComercial);
            
                sentencia.setString(1, comercial);

                sentencia.executeUpdate();

                eliminado = true;              
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return eliminado;
    }

}
