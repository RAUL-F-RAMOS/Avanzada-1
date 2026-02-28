package Calculadora;

import Calculadora.Logaritmos.Logaritmos;
import Calculadora.Operaciones_aritmeticax.Operaciones_aritmeticas;
import Calculadora.trigonometria.Trigonometria;

import javax.swing.*;

public class Calculadora {
    public void bucle(){
    int opcion;
    do {
        menu();
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operacion que desea realizar: "));
        switch (opcion){
            case 1:

                Logaritmos op= new Logaritmos();
                op.logaritmos();
                break;
            case 2:
                Operaciones_aritmeticas op2=new Operaciones_aritmeticas();
                op2.operaciones_aritmeticas();
                break;

            case 3:
                Trigonometria op3= new Trigonometria();
                op3.trigonometria();
                break;
            case 4:

                break;
            default:
                System.out.println("Opcion no valida");
        }
    }while(opcion!=4);

    }
    public void menu(){
        System.out.println("---Calculadora---");
        System.out.println("1-Logaritmos");
        System.out.println("2-Operaciones aritmeticas");
        System.out.println("3-Trigonometria");
        System.out.println("4-Salir");


    }
}
