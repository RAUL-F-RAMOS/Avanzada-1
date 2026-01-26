package calculadora.servicio;

import calculadora.dominio.Logaritmos;

import java.util.Scanner;

public class Formulas_logaritmos implements ICalculadora {
    Logaritmos log=new Logaritmos();


    @Override
    public void subMenuOpciones(Scanner consola) {
        System.out.println("Ingrese un numero: ");
        var num=consola.nextDouble();
        log.setNum(num);

        System.out.println("---Menu logaritmos---");
        System.out.println("1-Logaritmos base natural");
        System.out.println("2-Logaritmos base 10");
        System.out.println("3-Salir");
    }

    @Override
    public void ejecutarFormula(Scanner consola) {
        System.out.println("---Opcion---");
        var opcion=consola.nextInt();
        var num=log.getNum();

        switch (opcion){
            case 1:
                log.setResultado(Math.log(num));
                    break;
            case 2:
                log.setResultado(Math.log10(num));
                    break;
            case 3:
                System.out.println("Ha salido del sub menu");
                    break;
            default:
                System.out.println("Opcion no valida");
        }

    }

    @Override
    public void calcularResultado() {
        System.out.println("El resultado del logaritmos es: "+log.getResultado());
    }
}
