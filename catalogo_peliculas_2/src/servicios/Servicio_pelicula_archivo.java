package servicios;

import auditoria.Auditoria_log;
import dominio.Pelicula;

import java.io.*;
import java.nio.file.attribute.FileAttribute;

public class Servicio_pelicula_archivo implements Iservicio_peliculas {
   private final String NOMBRE_ARCHIVO="Peliculas.txt";
   //CONSTRUCTOR
    public Servicio_pelicula_archivo(){
        var archivo=new File(NOMBRE_ARCHIVO);
    try{
        if(archivo.exists()){
            System.out.println("Ya existe el archivo.");
        }else{
            var salida=new PrintWriter(new FileWriter(archivo));
        }

    }catch (IOException e){
        System.out.println("Error al abrir el archivo"+e.getMessage());

    }
    }


    @Override
    public void listar_peliculas() {
    var archivo=new File(NOMBRE_ARCHIVO);
            try{
                System.out.println("Listado de peliculas");
                Auditoria_log.registrar("user","Listo las peliculas");
                //abrir el archivo para lectura
                var entrada=new BufferedReader(new FileReader(archivo));
                //leamos linea a linea al archivo
                String linea;
                linea=entrada.readLine();

                //ciclo para leer todos los archivos
                while (linea!=null){
                    var pelicula=new Pelicula(linea);
                    System.out.println(pelicula);
                    //volvemos a llamar y capturar el valor de la siguiente
                    linea=entrada.readLine();

                }
                //cerrar el archivo siempre no lo olvides..
                entrada.close();

            }catch (Exception e){
                System.out.println("Ocurrio un error"+e.getMessage());
            }

    }

    @Override
    public void agregar_pelicula(Pelicula pelicula) {
        boolean anexar=false;
        var archivo=new  File(NOMBRE_ARCHIVO);
        try {
            if(archivo.exists()){
                //aqui viene lo chido...luisito
                //argregar la pelu
                anexar=archivo.exists();
                var salida=new PrintWriter(new FileWriter(archivo,anexar));
                salida.println(pelicula);
                System.out.println("Se agrego la peli... "+pelicula+" al archivo");
                Auditoria_log.registrar("user","Se agrego la peli... "+pelicula+" al archivo");
                salida.close();
            }



        }catch (Exception e){
            System.out.println("Ocurrio un error");
        }
    }

    @Override
    public void buscar_pelicula(Pelicula pelicula) {
    var archivo=new File(NOMBRE_ARCHIVO);
    try{
        var entrada=new BufferedReader(new FileReader(archivo));
         String lineaTexto;
         lineaTexto=entrada.readLine();
         var indice=1;
         boolean encontrada=false;
         var peliculaBuscar=pelicula.getNombre();
         while(lineaTexto!=null){
             if(peliculaBuscar!=null && peliculaBuscar.equalsIgnoreCase(lineaTexto)){
                 encontrada=true;
                 break;//romper el ciclo
             }
             //leemos la siguiente linea de texto
             lineaTexto=entrada.readLine();
             indice++;
         }//while
    }catch (Exception e){
        System.out.println("Ocurrio un error");
     }
    }

    @Override
    public void eliminar_pelicula(Pelicula nombre) {
            var archivo = new File(NOMBRE_ARCHIVO);
            // Creamos un archivo temporal para copiar todox excepto la peli a borrar
            var archivoTemporal = new File("Peliculas_temp.txt");

            try {
                var entrada = new BufferedReader(new FileReader(archivo));
                var salida = new PrintWriter(new FileWriter(archivoTemporal));
                String lineaTexto;
                lineaTexto = entrada.readLine();

                boolean encontrada = false;
                var peliculaAEliminar = nombre.getNombre();

                while (lineaTexto != null) {
                    // Si la línea NO es la que queremos borrar, la escribimos en el nuevo archivo
                    if (peliculaAEliminar != null && !peliculaAEliminar.equalsIgnoreCase(lineaTexto)) {
                        salida.println(lineaTexto);
                    } else if (peliculaAEliminar != null && peliculaAEliminar.equalsIgnoreCase(lineaTexto)) {
                        encontrada = true; // La encontramos, así que NO la imprimimos (se elimina)
                    }
                    lineaTexto = entrada.readLine();
                }

                // Cerramos los flujos para poder borrar el archivo original
                entrada.close();
                salida.close();

                // Borramos el original y renombramos el temporal al nombre original
                if (archivo.delete()) {
                    archivoTemporal.renameTo(archivo);
                }

                if (encontrada) {
                    System.out.println("Se elimino la pelicula: " + peliculaAEliminar);
                    // Usamos tu nueva clase de auditoría
                    auditoria.Auditoria_log.registrar("User", "ELIMINO LA PELICULA: " + peliculaAEliminar);
                } else {
                    System.out.println("No se encontro la pelicula: " + peliculaAEliminar);
                }

            } catch (Exception e) {
                System.out.println("Ocurrio un error"); // Mantengo tu mensaje de error original
            }

        }
    }
