package practicas;

import java.util.*;

/**
 *
 * @author braya
 */
public class Pruebas {
    public static void main(String[] args) {
       
        //Array List lo que permite es crear listas dinamicas, para que vaya creciendo o decreciendo en ejecucion
        //Los array list solo permiten almacenar objetos, no tipos primitivos
        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        listaEmpleados.add(new Empleado("Ana",45,2500));
        listaEmpleados.add(new Empleado("Juan",23,2800));
        listaEmpleados.add(new Empleado("Diego",15,500));
        
        for (Empleado e:listaEmpleados) {
            System.out.println(e);
        }
        
        
        
        
        
        
    }
    
}
