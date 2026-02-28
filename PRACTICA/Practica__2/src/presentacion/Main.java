package presentacion;

import servicio.Servicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Servicio servicio=new Servicio();
        Scanner sc=new Scanner(System.in);

        String nombre;
        int edad,opcion;
        var salir=false;

        while (!salir){
            System.out.println("1.Agregar");
            System.out.println("2,listar ");
            System.out.println("3.eliminar ");
            System.out.println("4.salir ");
            System.out.println("ingrese la opcion deseada:  ");
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    sc.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    nombre=sc.nextLine();
                    System.out.println("Ingrese la edad: ");
                    edad=sc.nextInt();
                    servicio.agregar(nombre,edad);
                    System.out.println("la lista ha sido actualizada");
                    break;

                case 2:
                    System.out.println("LiSTAOD DE NOMBRES");
                    servicio.listar();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Ingrese el nombre a eliminar: ");
                    nombre=sc.nextLine();
                    servicio.eliminar(nombre);
                    break;
                case 4:
                    System.out.println("Ha salido del programa");
                    salir=true;
                    break;

            }
        }

    }

}