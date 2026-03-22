/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author aleja
 */
public class Entity extends Parameters
{
    private String dni;
    private String nombre;
    private int edad;

    public Entity(String dni, String nombre, int edad)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        
        this.setItExists(false);
        this.setMessage("");
    }

    public Entity()
    {
        this.setItExists(false);
        this.setMessage("");
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
