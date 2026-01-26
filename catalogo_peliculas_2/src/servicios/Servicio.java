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
    public static void main(String[] args){
        //objetos
        var pelicula1=new Pelicula("Oso ted");
        var pelicula2=new Pelicula("Son como niños 2");
        var pelicula3=new Pelicula("Megalodon");
        var pelicula4=new Pelicula("It");
        var pelicula5=new Pelicula("AVATAR");
        //creamos servicio
        Iservicio_peliculas servicioPeliculas=new Servicio();

        servicioPeliculas.agregar_pelicula(pelicula1);
        servicioPeliculas.agregar_pelicula(pelicula2);
        servicioPeliculas.agregar_pelicula(pelicula3);
        servicioPeliculas.agregar_pelicula(pelicula4);
        servicioPeliculas.agregar_pelicula(pelicula5);
        //listamos
        servicioPeliculas.listar_peliculas();
        //buscar
        servicioPeliculas.buscar_pelicula(new Pelicula("AVATAR"));

    }
}
