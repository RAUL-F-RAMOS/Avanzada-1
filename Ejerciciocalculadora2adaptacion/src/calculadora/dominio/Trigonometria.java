package calculadora.dominio;

public class Trigonometria {
    private double angulo;
    private double resultado;

    public Trigonometria() {
    }

    public Trigonometria(double angulo) {
        this.angulo = angulo;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
