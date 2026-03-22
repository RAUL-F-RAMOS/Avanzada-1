/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;

/**
 *
 * @author aleja
 */
public class DAO 
{
    Connection conn;
    
    public DAO(String dbName)
    {
        try
        {
            String Driver = "com.mysql.cj.jdbc.Driver";
            System.out.println("=> Cargando Driver");
            Class.forName(Driver);
            System.out.println("=> Driver OK");
            String url ="jdbc:mysql://localhost/"+dbName;
            String user="root";
            String Password="";
            System.out.println("=> Conectando a la DB.");
            conn = DriverManager.getConnection(url, user, Password);
            System.out.println("=> Conectado a la DB.");
        }
        catch(Exception ex)
        {
            System.out.println("Error al conectar con la DB: " +ex.toString());
        }
    }
    
    public Connection getConn()
    {
        return conn;
    }
}
