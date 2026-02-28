package dominio;

public class Veterinario {
    String nombre;
    Double salario;
    Double precio;
    Double descuento;
    public Veterinario(String nombre,Double salario){
        this.nombre=nombre;
        this.salario=salario;
        this.precio=precio;
        this.descuento=descuento;
    }
    public Veterinario(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getprecioe() {
        return precio;
    }

    public void setprecio(Double precio) {
        this.precio = precio;
    }

    public Double getdescuento() {
        return descuento;
    }

    public void setdescuento(Double descuento) {
        this.descuento = descuento;
    }
}
