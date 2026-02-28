package Calculadora.Operaciones_aritmeticax;

public class Suma {
    Double n1,n2;
    public Suma(double n1, double n2){
        this.n1=n1;
        this.n2=n2;
    }
    public void resultado(){
        double resultado=n1+n2;
        System.out.println("El resultado es: "+(resultado));
    }
}
