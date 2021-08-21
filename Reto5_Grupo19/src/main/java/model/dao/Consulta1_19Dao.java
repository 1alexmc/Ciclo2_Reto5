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

public class Consulta1_19Dao {
    public ArrayList<Consulta1VO_19> consulta1DAO() throws SQLException {

        ArrayList <Consulta1VO_19> requerimiento1 = new ArrayList <Consulta1VO_19> ();

        Connection conexion = null;

        try {

            conexion =  JDBCUtilities.getConnection();

            String seleccion1 = "SELECT ID_Proyecto, "+
                                      "Fecha_Inicio,"+
                                      "Constructora, " +
                                      "Serial " +
                                "FROM Proyecto p " +
                                "WHERE p.ID_Proyecto < 15";


            PreparedStatement statement = conexion.prepareStatement(seleccion1);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                Consulta1VO_19 solucion1 = new Consulta1VO_19();
                solucion1.setIdProyecto(resultSet.getInt("ID_Proyecto"));
                solucion1.setFechaInicio(resultSet.getString("Fecha_Inicio"));
                solucion1.setConstrutora(resultSet.getString("Constructora"));
                solucion1.setSerial(resultSet.getString("Serial"));

                requerimiento1.add(solucion1);

            }

            resultSet.close();
            statement.close();

        }catch (SQLException e){

        }finally {
            if (conexion != null){
                conexion.close();
            }
        }

        
         return requerimiento1;   

    }  

}
