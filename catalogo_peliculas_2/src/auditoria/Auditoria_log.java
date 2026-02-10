package auditoria;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Auditoria_log {
 private static Logger logger=Logger.getLogger("AuditoriaSistema");
 static {
     try{
         FileHandler fileHandler=new FileHandler("Auditoria.log", true);
         fileHandler.setFormatter(new SimpleFormatter());
         logger.addHandler(fileHandler);
         logger.setUseParentHandlers(false);
         logger.setLevel(Level.INFO);
     }catch (Exception e){
         System.out.println("Error al crear el archivo de auditoria"+e.getMessage());
     }
 }
 public static void registrar(String usuario, String accion){
     logger.info("Usuario: "+usuario+" | Accion: "+accion);
 }
}
