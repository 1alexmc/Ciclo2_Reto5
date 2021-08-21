package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta3_19Dao {
    public ArrayList<Consulta3VO_19> consulta3DAO() throws SQLException {

        ArrayList <Consulta3VO_19> requerimiento3 = new ArrayList <Consulta3VO_19> ();

        Connection conexion = null;

        try {

            conexion =  JDBCUtilities.getConnection();

            String seleccion3 = "SELECT ID_Proyecto, Nombre || ' ' || Primer_Apellido as nombreapellido " + 
                                "From Proyecto p " +
                                "JOIN Lider l " +
                                "USING (ID_Lider) " +
                                "WHERE p.Banco_Vinculado = 'Bancolombia'";
            
        
            PreparedStatement statement = conexion.prepareStatement(seleccion3);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                Consulta3VO_19 solucion3  = new Consulta3VO_19();
                solucion3.setIdProyecto(resultSet.getInt("ID_Proyecto"));
                solucion3.setNombreApellido(resultSet.getString("nombreapellido"));;
                requerimiento3.add(solucion3);

            }

            resultSet.close();
            statement.close();

        }catch (SQLException e){

        }finally {
            if (conexion != null){
                conexion.close();
            }
        }

        
         return requerimiento3;   
       
    }  
}
