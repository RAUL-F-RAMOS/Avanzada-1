package Calculadora.trigonometria;

public class Seno {
    double A;
    public Seno(double A){
        this.A=A;
    }
    public void resultado(){
        double resultado=Math.sin(Math.toRadians(A));
        System.out.println("El resultado es: "+(resultado));
    }
}
