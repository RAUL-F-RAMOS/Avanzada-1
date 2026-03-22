/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import DAO.DAO;
import Entity.Entity;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Factory 
{
    DAO conn = new DAO("prueba2");
    Statement st=null;
    ResultSet rs=null;
    Connection c;
    
    public Entity search(String dni){
        Entity entity= new Entity();
        
        try{
            c = conn.getConn();
            st = c.createStatement();
            rs = st.executeQuery("SELECT * FROM persona WHERE dni='"+dni+"'");
            
            while(rs.next()){
                entity.setDni(rs.getString("dni"));
                entity.setNombre(rs.getString("nombre"));
                entity.setEdad(rs.getInt("edad"));
                entity.setItExists(true);
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "+ex);
        }
        
        return entity;
    }
    
    public boolean insert(Entity entity){
        boolean success=false;
        String query="";
        
        try{
            c = conn.getConn();
            st = c.createStatement();
            query +="INSERT INTO persona(dni,nombre,edad) VALUES(";
            query +="'"+entity.getDni()+"', ";
            query +="'"+entity.getNombre()+"', ";
            query +=" "+entity.getEdad()+" ";
            query +=")";
            st.execute(query);         
            success = true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "+ex);
        }
        
        return success;
    }
    
    public boolean update(Entity entity){
        boolean success=false;
        String query="";
        
        try{
            c = conn.getConn();
            st = c.createStatement();
            query +="UPDATE persona SET ";
            query +="dni='"+entity.getDni()+"', ";
            query +="Nombre='"+entity.getNombre()+"', ";
            query +="Edad='"+entity.getEdad()+"' ";
            query +="WHERE dni='"+entity.getDni()+"'";
            st.execute(query);         
            success = true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "+ex);
        }
        
        return success;
    }
    
    public boolean delete(String dni){
        boolean success=false;
        String query="";
        
        try{
            c = conn.getConn();
            st = c.createStatement();
            query +="DELETE FROM persona WHERE dni='"+dni+"'";
           
            st.execute(query);         
            success = true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "+ex);
        }
        
        return success;
    }
}
