package servicio;

import dominio.Mascota;
import dominio.Veterinario;

import java.util.ArrayList;

public class Servicio_veterinaria implements IServicio_veterinaria{

    private ArrayList<Mascota>lista=new ArrayList<>();



    //private ArrayList<Mascota>lista=new ArrayList<>();//Instancia

    @Override
    public void agregar_mascota(String nombre, String especie) {
      Mascota mascotanueva=new Mascota(nombre, especie);
      lista.add(mascotanueva);
        //Mascota mascotanueva=new Mascota(nombre,especie);
        //lista.add(mascotanueva);
    }

    @Override
    public void listar() {
        if (lista.isEmpty()){
            System.out.println("la lista esta vacia");

//        if (lista.isEmpty()){
//            System.out.println("La lista esta vacia");
//        }else{
//            for (Mascota e:lista){
//                System.out.println("Nombre: "+e.getNombre()+" Especie: "+e.getEspecie());


        }else{
            for (Mascota e:lista){
                System.out.println("nombre"+e.getNombre()+"especie"+e.getEspecie());
            }
        }
    }

    @Override
    public  void eliminar(String nombre) {
       lista.removeIf(m->m.getNombre().equalsIgnoreCase(nombre))
       // lista.removeIf(m->m.getNombre().equalsIgnoreCase(nombre));

    }

    @Override
    public void calcular_bono(Double salario, Double porcentaje) {

        salario+=salario*(porcentaje/100);
        System.out.println("El salario es: "+salario);
//        salario+=salario*(porcentaje/100);
//        System.out.println("El salario por el bono es: "+ salario);
    }

    @Override
    public void calcular_descuento(Double total, Double descuento) {
        total-=total*(descuento/100);
        System.out.println("El descuento es: "+total);
    }
}
//calcular el total seria el subtotal+=subtotal*0.15 asi saldria lo que ese el total