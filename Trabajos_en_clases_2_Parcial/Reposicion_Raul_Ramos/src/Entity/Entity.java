/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author raulr
 */
public class Entity extends Parameters
{  
    private int id_libro;
    private String titulo;
    private String autor;
    private int edit;
    private int anio;
    
  

    public Entity(int id_libro, String titulo, String autor, int edit, int anio)
    {
        this.id_libro=id_libro;
        this.titulo=titulo;
        this.autor=autor;
        this.edit=edit;
        this.anio=anio;
        
        this.setItExists(false);
        this.setMessage("");
    }

    public Entity()
    {
        this.setItExists(false);
        this.setMessage("");
    }

    public Entity(int id, String titulo, String autor, String edit, String anio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }
//getId_libro
//setId_libro
//getTitulo
//setTitulo
//getAutor
//setAutor
//getEdit
//setEdit
//getAnio
//setAnio    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdit() {
        return edit;
    }

    public void setEdit(int edit) {
        this.edit = edit;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

  
    
}
