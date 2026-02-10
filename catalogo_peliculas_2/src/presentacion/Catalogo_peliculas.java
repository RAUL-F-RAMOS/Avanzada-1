package presentacion;

import auditoria.Auditoria_log;
import dominio.Pelicula;
import servicios.Iservicio_peliculas;
import servicios.Servicio;
import servicios.Servicio_pelicula_archivo;

import java.util.Scanner;

public class Catalogo_peliculas {
    public static void main(String[] args) {
    //declaracion de variables
    var salir=false;
    var consola=new Scanner(System.in);

    //Agregamos l
       // Iservicio_peliculas servicioPeliculas=new Servicio();
        Iservicio_peliculas servicioPeliculas=new Servicio_pelicula_archivo();

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
            2.listado peliculas
            3.Buscar peliculas
            4.Eliminar pelicula
            5.salir
            """);
    }//mostrar menu
    private static boolean ejecutar_opciones(Scanner consola,
                                             Iservicio_peliculas servicioPeliculas){
        System.out.println("...");
        var opciones=Integer.parseInt(consola.nextLine());
        var salir=false;

        switch (opciones){
            case 1->{
                System.out.println("Ingrese el nombre de la pelicula: ");
                var nombre_Pelicula=consola.nextLine();
                servicioPeliculas.agregar_pelicula(new Pelicula(nombre_Pelicula));
                // Línea 50 actual: servicioPeliculas.agregar_pelicula(...);

                Auditoria_log.registrar("User","Escogio la opcion de agregar peliculas");
            }//case 1

            case 2-> {
                servicioPeliculas.listar_peliculas();
                // Línea 53 actual: servicioPeliculas.listar_peliculas();

                Auditoria_log.registrar("User","Escogio la opcion de listar peliculas");
            }
            case 3->{
                System.out.println("Ingres el nombre de la pelicula ha buscar: ");
                var buscar=consola.nextLine();
                servicioPeliculas.buscar_pelicula(new Pelicula(buscar));

                Auditoria_log.registrar("User","Escogio la opcion de buscar pelicula");

            }
            case 4->{
                System.out.println("Ingrese el nombre a eliminar: ");
                var eliminar=consola.nextLine();
                servicioPeliculas.eliminar_pelicula(new Pelicula(eliminar));
                Auditoria_log.registrar("User","Escogio la opcion de eliminar peliculas");

            }
            case 5->{
                System.out.println("Ha salido");
                salir=true;

                Auditoria_log.registrar("User","Escogio la opcion de salir");

            }
            default -> {
                System.out.println("Es del 1 al 4 semejante homosapiens");
            }
        }//mostrar
        return salir;
    }

}
