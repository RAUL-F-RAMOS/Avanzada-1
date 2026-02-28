package Calculadora.trigonometria;

public class Coseno {
    double A;
    public Coseno(double A){
        this.A=A;
    }
    public void resultado(){
        double resultado=Math.cos(Math.toRadians(A));
        System.out.println("El resultado es: "+(resultado));
    }
}
