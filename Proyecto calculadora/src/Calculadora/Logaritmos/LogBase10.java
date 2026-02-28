package Calculadora.Logaritmos;

public class LogBase10 {
    double n;
    public LogBase10(double n){
        this.n=n;
    }
    public void resultado(){
        double resultado=Math.log10(n);
        System.out.println("El resultado es: "+(resultado));
    }
}
