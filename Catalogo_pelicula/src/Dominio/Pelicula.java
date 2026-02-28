package Dominio;

public class Pelicula {
    private String nombre;
    //contructor
    public Pelicula(){ }
    public Pelicula(String nombre){this.nombre=nombre;}
    public String getNombre(){return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
