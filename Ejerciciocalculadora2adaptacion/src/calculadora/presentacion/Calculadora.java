package calculadora.presentacion;

import calculadora.servicio.Formulas_logaritmos;
import calculadora.servicio.Formulas_operaciones_aritmeticas;
import calculadora.servicio.Formulas_trigonometria;
import calculadora.servicio.ICalculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        var salir=false;
        var consola=new Scanner(System.in);

        ArrayList<ICalculadora> formulas=new ArrayList<ICalculadora>();
        formulas.add(new Formulas_operaciones_aritmeticas());
        formulas.add(new Formulas_logaritmos());
        formulas.add(new Formulas_trigonometria());

        while(!salir){
            try{
                mostrar_menu();
                salir=ejecutar_formula(consola,formulas);
                System.out.println("...");
            }catch (Exception e){
                System.out.println("Ocurrio un error "+e.getMessage());
            }
        }


    }
    private static void mostrar_menu(){


        System.out.println("---Opciones---");
        System.out.println("1-Operaciones aritmeticas");
        System.out.println("2-Logaritmos");
        System.out.println("3-Trigonometria");
        System.out.println("4-Salir");

    }
    private static boolean ejecutar_formula(Scanner consola,ArrayList<ICalculadora> formulas){
        System.out.println("---Opcion---");
        var opcion=consola.nextInt();
        var indice=opcion-1;
        var salir=false;
        switch (opcion){
            case 1:
            case 2:
            case 3:
                formulas.get(indice).subMenuOpciones(consola);
                formulas.get(indice).ejecutarFormula(consola);
                formulas.get(indice).calcularResultado();
                break;
            case 4:
                System.out.println("Ha salido del programa");
                salir=true;
                break;
            default:
                System.out.println("Opcion invalida");
        }
        return salir;
    }
}