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
    DAO conn = new DAO("examen_tabla");
    Statement st=null;
    ResultSet rs=null;
    Connection c;
    
    public Entity search(int id){
        Entity entity= new Entity();
        
        try{
            c = conn.getConn();
            st = c.createStatement();
            rs = st.executeQuery("SELECT * FROM tabla_t_productos WHERE id_producto="+id+"");
            
            while(rs.next()){
                entity.setId_producto(rs.getInt("id_producto"));
                entity.setNombre(rs.getString("Nombre"));
                entity.setPrecio(rs.getDouble("Precio"));
                entity.setCantidad(rs.getInt("Cantidad"));
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
            query +="INSERT INTO tabla_t_productos(id_producto,Nombre,Precio,Cantidad) VALUES(";
            query +=""+entity.getId_producto()+", ";
            query +="'"+entity.getNombre()+"', ";
            query +=" "+entity.getPrecio()+", ";
            query +=" "+entity.getCantidad()+" ";
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
            query +="UPDATE tabla_t_productos SET ";
            query +="id_producto= "+entity.getId_producto()+", ";
            query +="Nombre='"+entity.getNombre()+"', ";
            query +="Precio= "+entity.getPrecio()+", ";
            query +="Cantidad= "+entity.getCantidad()+" ";
            query +="WHERE id_producto= "+entity.getId_producto()+"";
            st.execute(query);         
            success = true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "+ex);
        }
        
        return success;
    }
    
    public boolean delete(int id_producto){
        boolean success=false;
        String query="";
        
        try{
            c = conn.getConn();
            st = c.createStatement();
            query +="DELETE FROM tabla_t_productos WHERE id_producto= "+id_producto+" ";
           
            st.execute(query);         
            success = true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "+ex);
        }
        
        return success;
    }
}
