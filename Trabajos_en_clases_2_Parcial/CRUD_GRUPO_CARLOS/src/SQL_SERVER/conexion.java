/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL_SERVER;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author raulr
 */
public class conexion {
    public static Connection connection(){
        Connection conn=null;
        String servidor="138.0.228.212";
        String bd="uthprueba";
        String usuario="uthcarlos";
        String password="987";
        String url="jdbc:sqlserver://"+servidor+":1433;"
                +"databaseName="+bd+";"
                +"encrypt=true;"
                +"trustServerCertificate=true;";
        try{
          conn=DriverManager.getConnection(url,usuario,password);
          System.out.println("conexion exitosa");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error de conexion: "+e.getMessage());
        }
            
                    
        return conn;
    }
}
