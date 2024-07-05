package Practicas1;

import java.util.*;

/**
 *
 * @author braya
 */
public class PruebaArrayList {
    public static void main(String[] args) {
       
        /*ARRAY LIST lo que permite es crear listas dinamicas, para que vaya creciendo o decreciendo en ejecucion
        Los array list solo permiten almacenar objetos, no tipos primitivos
        Un arrayList inicia por defecto con 10 elementos y si luego inserto mas de 10 crea otro array list y copia el que tenia, consumiendo mas recursos
        Los array list comienzan siempre desde la posicion 0*/
        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
        
        //Puedo definir una capacidad de inicio para mi array list para evitar el uso innecesario de recursos, uso ensureCapacity
        //listaEmpleados.ensureCapacity(11);
        
        listaEmpleados.add(new Empleado("Ana",45,2500));
        listaEmpleados.add(new Empleado("Juan",23,2800));
        listaEmpleados.add(new Empleado("Diego",15,500));
        //el Metodo Set me permite agregar un nuevo elemento, e indicar la posicion en la que quiero incluirlo, reemplaza el elemento que habia en esa posicion
        //listaEmpleados.set(1,new Empleado("Chamaco",15,500)); 
        
        //Si estoy seguro que no vamos a añadir mas elementos al arrayList se puede limpiar el espacio extra uso TrimToSize;
        //listaEmpleados.trimToSize();
        
        /*for (Empleado e:listaEmpleados) { //For Each
            System.out.println(e);
        }*/
        
        
        /*//Otra manera de recorrer los elementos de un arrayList, ya que estos no tienen indice
        for (int i = 0; i < listaEmpleados.size(); i++) {
            System.out.println(listaEmpleados.get(i));  
        }*/
        //El metodo Get me permite extraer un elemento del array list indicando la posicion
        //System.out.println(listaEmpleados.get(1));
        
        //Copiar elementos de un array en otro
        /*Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];
        listaEmpleados.toArray(arrayEmpleados);*/
        
        /*Los Iteradores es una interfaz que nos permite acceder secuencialmente 
        los elementos de una coleccion, ver si hay mas elementos o no algunos metodos son:
        boolean hasNext = nos dice si hay mas elementos
        E next = nos retorna el siguiente elemento
        void remove() = se encarga de eliminar el elemento en el que estamos 
        */
        
        Iterator<Empleado> mi_iterador = listaEmpleados.iterator();
        while(mi_iterador.hasNext()){
            System.out.println(mi_iterador.next());   
        }
        
        
        
        
        
        
        
    }
    
}
