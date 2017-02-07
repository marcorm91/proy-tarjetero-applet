package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class MEtiquetas {

    private final Connection conexion;
    
    public MEtiquetas(Connection conexion) {
        this.conexion = conexion;
    }
    
    /**
     * Registra etiqueta en la tabla etiquetas de la base de datos.
     * @param etiqueta Se le pasa por parámetro el nombre de la etiqueta para ser insertado en la tabla.
     * @return Devolverá true si el registro fue insertado correctamente.
     */    
    public boolean registraEtiqueta(String etiqueta){
        
        String registraEtiqueta = "insert into etiquetas values(?);";
        boolean insertado = false;
        
        try{
            PreparedStatement sentencia = conexion.prepareStatement(registraEtiqueta);
            
                sentencia.setString(1, etiqueta);
                sentencia.executeUpdate();
                
                insertado = true;
        }catch(SQLException e){
            System.out.println(e);

        }
        
        return insertado;
    }

    
    /**
     * Método que devolverá en orden alfabético todas las etiquetas registradas en la tabla etiquetas.
     * @return Devuelve un arrayList de todas las etiquetas registradas hasta el momento.
     */
    public ArrayList selectEtiquetas(){
        
        ArrayList lista = new ArrayList();
        String etiqueta = null;
       
        String selectEtiquetas = "select * from etiquetas order by etiqueta;";
        
        try{
            PreparedStatement sentencia = conexion.prepareStatement(selectEtiquetas);
            ResultSet rs = sentencia.executeQuery();
            
                while(rs.next()){
                    etiqueta = rs.getString("etiqueta");
                    lista.add(etiqueta);
                }
     
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return lista;
    }
    
}
