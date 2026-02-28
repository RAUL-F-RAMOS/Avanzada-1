package Calculadora.Logaritmos;

public class LogNatural {
    double n;
    public LogNatural(double n){
        this.n=n;
    }
    public void resultado(){
        double resultado=Math.log(n);
        System.out.println("El resultado es: "+(resultado));
    }
}
