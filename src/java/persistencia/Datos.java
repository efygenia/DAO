package persistencia;

import java.util.ArrayList;


public class Datos {
   public static ArrayList obtener(){
       
       ArrayList Listado = new ArrayList();
       String item1 = "Agenda";
       String item2 = "Redes Sociales";
       String item3 = "Tareas";
       String item4 = "Correos";
       Listado.add(item1);
       Listado.add(item2);
       Listado.add(item3);
       Listado.add(item4);
       return Listado;
       
   }
           
}
