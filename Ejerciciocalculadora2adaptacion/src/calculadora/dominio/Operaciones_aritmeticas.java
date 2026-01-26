package calculadora.dominio;

public class Operaciones_aritmeticas {
    private double n1;
    private double n2;
    private double resultado;

    public Operaciones_aritmeticas() {
    }

    public Operaciones_aritmeticas(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
