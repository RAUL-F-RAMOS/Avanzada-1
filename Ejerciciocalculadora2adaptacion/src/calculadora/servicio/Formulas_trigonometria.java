package calculadora.servicio;

import calculadora.dominio.Trigonometria;

import java.util.Scanner;

public class Formulas_trigonometria implements ICalculadora {
    Trigonometria trigo=new Trigonometria();

    @Override
    public void subMenuOpciones(Scanner consola) {
        System.out.println("Ingrese un numero: ");
        var num=consola.nextDouble();
        trigo.setAngulo(num);

        System.out.println("---Menu de opciones---");
        System.out.println("1-coseno");
        System.out.println("2-seno");
        System.out.println("3-tangente");
        System.out.println("4-salir");
    }

    @Override
    public void ejecutarFormula(Scanner consola) {
        System.out.println("---Opcion---");
        var opcion=consola.nextInt();
        var angulo=trigo.getAngulo();

        switch (opcion){
            case 1:
                trigo.setResultado(Math.cos(Math.toRadians(angulo)));
                    break;
            case 2:
                trigo.setResultado(Math.sin(Math.toRadians(angulo)));
                    break;
            case 3:
                trigo.setResultado(Math.tan(Math.toRadians(angulo)));
                    break;
            case 4:
                System.out.println("Ha salido del sub-menu");
                    break;
            default:
                System.out.println("Opcion invalida");

        }

    }

    @Override
    public void calcularResultado() {
        System.out.println("El resultado es: "+trigo.getResultado());
    }
}
