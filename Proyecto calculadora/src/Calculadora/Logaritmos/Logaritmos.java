package Calculadora.Logaritmos;

import javax.swing.*;

public class Logaritmos {
    public void logaritmos(){
        System.out.println("---Operaciones Logaritmos---");
        System.out.println("1.Logaritmo base 10");
        System.out.println("2.Logaritmo natural");
        System.out.println("3.salir");
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea: "));

        switch (opcion){
            case 1:
                double n=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
                LogBase10 log10=new LogBase10(n);
                log10.resultado();
                break;
            case 2:
                double N=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero: "));
                LogNatural logNatural=new LogNatural(N);
                logNatural.resultado();
                break;
            case 3:
                System.out.println("Ha salido del menu");
                break;

            default:
                System.out.println("Opcion invalida");
        }
    }

}
