package Calculadora.Operaciones_aritmeticax;

public class Division {
    Double NUM1,NUM2;
    public Division(double NUM1,double NUM2){
        this.NUM1=NUM1;
        this.NUM2=NUM2;
    }
    public void resultado(){
        double resultado=NUM1/NUM2;
        System.out.println("El resultado es: "+(resultado));
    }
}
