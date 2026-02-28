package servicio;

public interface IServicio_veterinaria {
    public void agregar_mascota(String nombre, String especie);
    public void listar();
    public void eliminar(String nombre);

    //veterinario
    public void calcular_bono(Double salario, Double porcentaje);
    public void calcular_descuento(Double total,Double descuento);
}
