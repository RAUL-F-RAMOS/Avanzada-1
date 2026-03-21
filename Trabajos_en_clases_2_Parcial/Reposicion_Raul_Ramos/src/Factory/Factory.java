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
    //tabla_t_libro
    DAO conn = new DAO("examen_tabla2");
    Statement st=null;
    ResultSet rs=null;
    Connection c;
    
    public Entity search(int id){
        Entity entity= new Entity();
      
//getId_libro
//getTitulo
//getAutor
//getEdit
//getAnio

//setId_libro
//setTitulo
//setAutor
//setEdit
//setAnio            
        
        try{
            c = conn.getConn();
            st = c.createStatement();
            rs = st.executeQuery("SELECT * FROM tabla_t_libro WHERE id_libro="+id+"");
            
            while(rs.next()){
                entity.setId_libro(rs.getInt("id_lirbo"));
                entity.setTitulo(rs.getString("titulo"));
                entity.setAutor(rs.getString("autor"));
                entity.setEdit(rs.getInt("edit"));
                entity.setAnio(rs.getInt("anio"));
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
 //getId_libro
//getTitulo
//getAutor
//getEdit
//getAnio

//setId_libro
//setTitulo
//setAutor
//setEdit
//setAnio         
        try{
            c = conn.getConn();
            st = c.createStatement();
            query +="INSERT INTO tabla_t_libro(id_lirbo,titulo,autor,edit,anio) VALUES(";
            query +=""+entity.getId_libro()+", ";
            query +="'"+entity.getTitulo()+"', ";
            query +=" "+entity.getAutor()+", ";
            query +=" "+entity.getEdit()+" ";
            query +=" "+entity.getAnio()+" ";
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
    //getId_libro
//getTitulo
//getAutor
//getEdit
//getAnio
     
        try{
            c = conn.getConn();
            st = c.createStatement();
            query +="UPDATE tabla_t_productos SET ";
            query +="id_libro= "+entity.getId_libro()+", ";
            query +="titulo='"+entity.getTitulo()+"', ";
            query +="autor='"+entity.getAutor()+"', ";    
            query +="edit= "+entity.getEdit()+" ";
            query +="anio= "+entity.getAnio()+" ";
            query +="WHERE id_producto= "+entity.getId_libro()+"";
            st.execute(query);         
            success = true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "+ex);
        }
        
        return success;
    }
    
    public boolean delete(int id_libro){
        boolean success=false;
        String query="";
        
        try{
            c = conn.getConn();
            st = c.createStatement();
            query +="DELETE FROM tabla_t_lirbo WHERE id_libro= "+id_libro+" ";
           
            st.execute(query);         
            success = true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "+ex);
        }
        
        return success;
    }
}
