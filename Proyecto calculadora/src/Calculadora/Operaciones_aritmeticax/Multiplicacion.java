package Calculadora.Operaciones_aritmeticax;

public class Multiplicacion {
    Double num1,num2;
    public Multiplicacion(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void resultado(){
        double resultado=num1*num2;
        System.out.println("El resultado es: "+(resultado));
    }
}
