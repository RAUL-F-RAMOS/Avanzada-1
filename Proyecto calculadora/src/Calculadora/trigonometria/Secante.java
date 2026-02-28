package Calculadora.trigonometria;

public class Secante {
    double A;
    public Secante(double A){
        this.A=A;

    }
    public void resultado(){
        double resultado=1/Math.cos(Math.toRadians(A));
        System.out.println("El resultado es: "+(resultado));
    }
}
