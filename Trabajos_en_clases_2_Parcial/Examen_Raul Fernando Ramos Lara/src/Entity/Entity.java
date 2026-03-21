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
 
    private int id_producto;
    private String nombre;
    private double precio;
    private int cantidad;

    public Entity(int id_producto,String nombre,double precio,int cantidad)
    {
        this.id_producto=id_producto;
        this.cantidad=cantidad;
        this.nombre=nombre;
        this.precio=precio;
        
        this.setItExists(false);
        this.setMessage("");
    }

    public Entity()
    {
        this.setItExists(false);
        this.setMessage("");
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

  
    
}
