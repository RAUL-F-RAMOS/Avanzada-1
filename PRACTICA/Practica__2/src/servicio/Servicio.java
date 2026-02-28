package servicio;

import dominio.Registro;

import java.util.ArrayList;

public class Servicio implements IServicio {
    ArrayList<Registro>lista=new ArrayList<>();

    @Override
    public void agregar(String nombre, int edad) {
        Registro nuevoregistro=new Registro(nombre, edad);
        lista.add(nuevoregistro);
    }

    @Override
    public void listar() {
    if (lista.isEmpty()){
        System.out.println("La lista esta vacia");
    }else {
        for (Registro e: lista){
            System.out.println("Nombre: "+e.getNombre()+" edad: "+e.getEdad());
            }
         }
    }

    @Override
    public void eliminar(String nombre) {
    lista.removeIf(m->m.getNombre().equalsIgnoreCase(nombre));
    }
}
