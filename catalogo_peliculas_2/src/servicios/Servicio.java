package servicios;

import dominio.Pelicula;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Servicio implements Iservicio_peliculas
{
    ArrayList<Pelicula>peliculas=new ArrayList();

    @Override
    public void listar_peliculas() {
        System.out.println("Listado de peliculas ha disposicion");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void agregar_pelicula(Pelicula nombre) {
        peliculas.add(nombre);
        System.out.println("La pelicula "+nombre+" Ha sido agregada");
    }

    @Override
    public void buscar_pelicula(Pelicula pelicula) {
        var indice=peliculas.indexOf(pelicula);
        if(indice>=0){
        System.out.println("Pelicula encontrado en indice ["+indice+" ]");

        }else{
            System.out.println("Pelicula no encontrada...");
        }


    }

    @Override
    public void eliminar_pelicula(Pelicula nombre) {
// Usamos removeIf para buscar y borrar la película que coincida con el nombre
        boolean eliminado = peliculas.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre.getNombre()));

        if (eliminado) {
            System.out.println("La pelicula " + nombre.getNombre() + " ha sido eliminada de la lista");
            // Registro en tu nueva auditoría profesional
            auditoria.Auditoria_log.registrar("user", "ELIMINO PELICULA DE MEMORIA: " + nombre.getNombre());
        } else {
            System.out.println("Pelicula no encontrada en la lista...");
        }
    }

}
