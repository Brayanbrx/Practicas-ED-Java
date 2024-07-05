package Practicas1;

/**
 *
 * @author braya
 */
public class ParejaGenerica<T> {
    private T primero;
    
    public ParejaGenerica(){
        primero=null;
    }
    
    public void setPrimero(T nuevoValor){
        this.primero=nuevoValor;
    }
    
    public T getPrimero(){
        return this.primero;
    }
    
    public static void imprimirTrabajador(ParejaGenerica<? extends Empleado> p){ //esto es para que funcione con una clase y las clases que heredan de este
       Empleado primero = p.getPrimero();
        System.out.println(primero);
    }
    
    
}
