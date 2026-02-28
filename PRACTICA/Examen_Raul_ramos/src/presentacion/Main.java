package presentacion;
import dominio.Figura3D;
import servicio.IServicioVolumen;
import servicio.IServicioVolumen;
import servicio.Servicio;

public class Main {
    public static void main(String[] args) {
        Figura3D cubo=new Figura3D(3);
        Figura3D esfera=new Figura3D(2);

        IServicioVolumen servicio=new Servicio();
        System.out.println("Volumen cubo= "+servicio.volumenCubo(cubo));
        System.out.println("Volumen esfera= "+servicio.volumenEsfera(esfera));


    }
}