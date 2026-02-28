package Calculadora.Operaciones_aritmeticax;

public class Resta {
    Double N1,N2;
    public Resta(double N1, double N2){
        this.N1=N1;
        this.N2=N2;
    }
    public void resultado(){
        double resultado=N1-N2;
        System.out.println("El resultado es: "+(resultado));
    }
}
