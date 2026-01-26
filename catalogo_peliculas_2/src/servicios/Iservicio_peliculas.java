package servicios;

import dominio.Pelicula;

public interface Iservicio_peliculas {
    public void listar_peliculas();
    public void agregar_pelicula(Pelicula nombre);
    public void buscar_pelicula(Pelicula nombre);
}
