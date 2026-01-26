package dominio;

import java.util.Objects;

public class Pelicula {
    private String nombre;

    public Pelicula(){}
    public Pelicula(String nombre){
        this.nombre=nombre;
    }
        //setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //equals hascode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(nombre, pelicula.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
//    public static void main(String[] args){
//        var pelicula1=new Pelicula("Mama soy raul");
//        var pelicula2=new Pelicula("La aventuras magicas");
//        System.out.println(pelicula1);
//        System.out.println(pelicula2);
//    }

}
