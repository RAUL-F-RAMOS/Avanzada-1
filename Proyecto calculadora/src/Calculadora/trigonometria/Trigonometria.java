package Calculadora.trigonometria;

import javax.swing.*;

public class Trigonometria {
    public void trigonometria(){
        System.out.println("---Operaciones Trigonometria---");
        System.out.println("1.cosecante");
        System.out.println("2.coseno");
        System.out.println("3.cotagente");
        System.out.println("4.secante");
        System.out.println("5.seno");
        System.out.println("6.tangente");
        System.out.println("7.Salir");
        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea: "));

        switch (opcion){
            case 1:
                double A=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un angulo: "));
                Cosecante cosecante=new Cosecante(A);
                cosecante.resultado();
                break;
            case 2:
                    double A2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero: "));
                    Coseno coseno=new Coseno(A2);
                    coseno.resultado();
                break;
            case 3:
                double A3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero: "));
                Cotangente cotangente= new Cotangente(A3);
                cotangente.resultado();
                break;
            case 4:
                double A4=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero: "));
                Secante secante=new Secante(A4);
                secante.resultado();
                break;
            case 5:
                double A5=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero: "));
                Seno seno=new Seno(A5);
                seno.resultado();
                break;
            case 6:
                double A6=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero: "));
                Tangente tangente=new Tangente(A6);
                tangente.resultado();
                break;
            case 7:
                System.out.println("Ha salido del programa");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
    }

