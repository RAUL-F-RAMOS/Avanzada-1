package Calculadora.trigonometria;

public class Tangente {
    double A;
    public Tangente(double A){
        this.A=A;
    }
    public void resultado(){
        double resultado=Math.tan(Math.toRadians(A));
        System.out.println("El resultado es: "+(resultado));
    }
}
