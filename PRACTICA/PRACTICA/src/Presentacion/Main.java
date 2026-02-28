package Presentacion;

import dominio.Mascota;
import servicio.Servicio_veterinaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mascota mascota=new Mascota("Paco","Gato"); //instancia
        Servicio_veterinaria servicio=new Servicio_veterinaria();
        Scanner sc=new Scanner(System.in);
        //declaramos las variables
        String nombre, especie;
        Double salario;
        int opcion;
        var salir=false;
        while (!salir){

            System.out.println("Opcion 1 agregar");
            System.out.println("Opcion 2 mostrar listado");
            System.out.println("Opcion 3 calcular bono");
            System.out.println("Opcion 4 eliminar mascota");
            System.out.println("Opcion 5 salir");
            System.out.println("Elija la opcion: ");
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    sc.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    nombre=sc.nextLine();
                    System.out.println("Ingrese la especia: ");
                    especie=sc.nextLine();
                    servicio.agregar_mascota(nombre,especie);
                    System.out.println("Lista actualizada");
                    break;
                case 2:
                    System.out.println("Mostrar lista");
                    servicio.listar();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Calcular bono");
                    System.out.println("Ingrese el salario: ");
                    salario=sc.nextDouble();
                    servicio.calcular_bono(salario,10.0);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Eliminar mascota");
                    System.out.println("Ingrese el nombre de la mascota a eliminar: ");
                    nombre=sc.nextLine();
                    servicio.eliminar(nombre);
                    break;
                case 5:
                    System.out.println("Ha salido del programa");
                    salir=true;
                    break;
            }
        }



//        Servicio_veterinaria servicio=new Servicio_veterinaria();
//        Scanner sc=new Scanner(System.in);
//        String nombre,especie;
//        Double salario;
//        int opcion;
//        var salir=false;
//        while (!salir){
//            System.out.println("Sistema veterinario");
//            System.out.println("1-Agregar mascota");
//            System.out.println("2-ver listado");
//            System.out.println("3-calcular bono");
//            System.out.println("4-ELiminar mascota");
//            System.out.println("5.salir");
//            System.out.println("Elija una opcion");
//            opcion=sc.nextInt();
//
//            switch (opcion){
//                case 1:
//                    sc.nextLine();
//                    System.out.print("Ingrese el nombre: ");
//                    nombre=sc.nextLine();
//                    System.out.print("Ingrese la especie: ");
//                    especie=sc.nextLine();
//                    servicio.agregar_mascota(nombre,especie);
//                    System.out.println("Lista actualizada");
//                    break;
//                case 2:
//                    System.out.println("Listado de mascotas");
//                    servicio.listar();
//                    break;
//                case 3:
//                    sc.nextLine();
//                    System.out.println("Calcular bono");
//                    System.out.println("Ingrese el salario: ");
//                    salario=sc.nextDouble();
//                    servicio.calcular_bono(salario,10.0);
//                    break;
//                case 4:
//                    sc.nextLine();
//                    System.out.println("Apartado para eliminar mascota");
//                    System.out.println("Ingrese el nombre de la mascota a eliminar");
//                    nombre=sc.nextLine();
//                    servicio.eliminar(nombre);
//                    break;
//                case 5:
//                    System.out.println("Ha salido del programa");
//                    salir=true;
//                }
//            }








//
//            System.out.println("Ingrese el nombre: ");
//            nombre=sc.nextLine();
//            if (nombre.equalsIgnoreCase("0")){
//                break;
//            }
//            System.out.println("Ingrese la especie: ");
//            especie=sc.nextLine();
//            servicio.agregar_mascota(nombre,especie);
//            System.out.println("La lista se ha actualizado");
//            servicio.listar();
//        }
//        System.out.println("Ingrese el salario: ");
//        salario=sc.nextDouble();
//        servicio.calcular_bono(salario,10.0);

//        Servicio_veterinaria servicio= new Servicio_veterinaria();
//        Scanner sc=new Scanner(System.in);
//        String nombre,especie;
//        Double salario;
//        //servicio.agregar_mascota("Paco","Gato");
//        while (true){
//            System.out.println("Ingrese el nombre (0 para salir): ");
//            nombre=sc.nextLine();
//            if (nombre.equalsIgnoreCase("0")){
//                break;
//            }
//            System.out.println("Ingrese la especie: ");
//            especie=sc.nextLine();
//            servicio.agregar_mascota(nombre,especie);
//            System.out.println("Se a actualizado la lista de mascotas: ");
//            servicio.listar();
//
//        }
//        System.out.println("Ingrese el salario: ");
//        salario=sc.nextDouble();
//        servicio.calcular_bono(salario,10.0);

        //servicio.listar();
        //servicio.eliminar("Paco");
        //servicio.listar();
        //Calculararea(15.1);
    }
    //public static void Calculararea(Double radio){
        //double area=3.14*(radio*radio);
        //System.out.println("El area es: "+area);
    //}
}