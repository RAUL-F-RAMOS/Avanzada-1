package Calculadora.Operaciones_aritmeticax;

import javax.swing.*;

public class Operaciones_aritmeticas {
    public void operaciones_aritmeticas(){
        System.out.println("---Operaciones aritmeticas---");
        System.out.println("1.Suma");
        System.out.println("2.resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.division");
        System.out.println("5.Salir");
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea: "));

        switch (opcion){
            case 1:
                double n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1: "));
                double n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2: "));
                Suma sum=new Suma(n1,n2);
                sum.resultado();
                break;
            case 2:
                double N1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1: "));
                double N2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1: "));
                Resta res=new Resta(N1,N2);
                res.resultado();
                break;
            case 3:
                double num1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1: "));
                double num2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1: "));
                Multiplicacion multi=new Multiplicacion(num1,num2);
                multi.resultado();
                break;
            case 4:
                double NUM1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1: "));
                double NUM2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1: "));
                Division div=new Division(NUM1,NUM2);
                div.resultado();
                break;
            case 5:
                System.out.println("Ha salido del programa");
                break;

            default:
                System.out.println("Opcion invalida");
        }
    }
}
