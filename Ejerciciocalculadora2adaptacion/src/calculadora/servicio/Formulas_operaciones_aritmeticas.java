package calculadora.servicio;

import calculadora.dominio.Operaciones_aritmeticas;

import java.util.Scanner;

public class Formulas_operaciones_aritmeticas implements ICalculadora {
    Operaciones_aritmeticas opa=new Operaciones_aritmeticas();


    @Override
    public void subMenuOpciones(Scanner consola) {
        System.out.println("Ingrese el numero 1: ");
        var N1=consola.nextDouble();
        opa.setN1(N1);

        System.out.println("Ingrese el numero 2: ");
        var N2=consola.nextDouble();
        opa.setN2(N2);

        System.out.println("---Menu---");
        System.out.println("1-suma");
        System.out.println("2-resta");
        System.out.println("3-multiplicacion");
        System.out.println("4-division");
        System.out.println("5-salir");
    }

    @Override
    public void ejecutarFormula(Scanner consola) {
        System.out.println("---Opcion---");
        var opcion=consola.nextInt();
        var num=opa.getN1();
        var num2=opa.getN2();

        switch (opcion){
            case 1:
                opa.setResultado(num+num2);
                    break;
            case 2:
                opa.setResultado(num-num2);
                    break;
            case 3:
                opa.setResultado(num*num2);
                    break;
            case 4:
                opa.setResultado(num/num2);
                    break;
            case 5:
                System.out.println("ha salido del sub-menu");
                    break;
            default:
                System.out.println("Opcion invalida");
        }
    }

    @Override
    public void calcularResultado() {
        System.out.println("El resultado es: "+opa.getResultado());
    }
}
