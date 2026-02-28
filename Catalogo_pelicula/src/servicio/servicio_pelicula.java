package servicio;

import java.util.ArrayList;
import java.util.List;

public class servicio_pelicula implements IServicio_pelicula {
private final List<Pelicula>peliculas;
public servicio_pelicula(){
    this.peliculas=new ArrayList<>();
}
    @Override
    public void listarPelicula() {
        System.out.println("Listado peliculas...");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
    peliculas.add(pelicula);
        System.out.println("* "+pelicula+" agregar...");
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        var indice=peliculas.indexOf(pelicula);
        if(indice>=0){
            System.out.println("Pelicula encontrada en el indice...");
        }else{
            System.out.println("Pelicula no encontrada..."+pelicula);
        }
    }

}
