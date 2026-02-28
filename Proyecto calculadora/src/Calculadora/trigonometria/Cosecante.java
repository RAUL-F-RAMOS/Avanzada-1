package Calculadora.trigonometria;

public class Cosecante {
    double A;
    public Cosecante(double A){
        this.A=A;
    }
    public void resultado(){
        double resultado=1/Math.sin(Math.toRadians(A));
        System.out.println("El resultado es: "+(resultado));
    }
}
