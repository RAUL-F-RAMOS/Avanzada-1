package presentacion;

import dominio.Pelicula;
import servicios.Iservicio_peliculas;
import servicios.Servicio;

import java.util.Scanner;

public class Catalogo_peliculas {
    public static void main(String[] args) {
    //declaracion de variables
    var salir=false;
    var consola=new Scanner(System.in);

    //Agregamos l
        Iservicio_peliculas servicioPeliculas=new Servicio();

    //menu
    while (!salir){
        try{
            mostrar_menu();
            salir=ejecutar_opciones(consola,servicioPeliculas);
        }catch (Exception e){
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
    }
    }
    private static void mostrar_menu(){

        System.out.println("""
            ***Catalogo de peliculas***
            1.Agregar peliculas
            2.listado pelicuals
            3.Buscar peliculas
            4.salir
            """);
    }//mostrar menu
    private static boolean ejecutar_opciones(Scanner consola,
                                             Iservicio_peliculas servicioPeliculas){
        System.out.println("...");
        mostrar_menu();
        var opciones=Integer.parseInt(consola.next());
        var salir=false;

        switch (opciones){
            case 1->{
                System.out.println("Ingrese el nombre de la pelicula: ");
                var nombre_Pelicula=consola.next();
                servicioPeliculas.agregar_pelicula(new Pelicula(nombre_Pelicula));
            }//case 1
            case 2-> {
                servicioPeliculas.listar_peliculas();
            }
            case 3->{
                System.out.println("Ingres el nombre de la pelicula ha buscar: ");
                var buscar=consola.nextLine();
                servicioPeliculas.buscar_pelicula(new Pelicula(buscar));
            }
            case 4->{
                System.out.println("Ha salido");
                salir=true;
            }
            default -> {
                System.out.println("Es del 1 al 4 semejante homosapiens");
            }
        }//mostrar
        return salir;
    }

}
