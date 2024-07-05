/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas1;

/**
 *
 * @author braya
 */
public class PruebaProgGenerica {
    public static void main(String[] args) {
        /*La programacion generica nos permite manejar cualquier tipo de elementos en un Array List, modificando el parametro de tipo
        que es lo que se encuentra en: <Tipo> dentro de un ArrayList
        Se podria crear un ArrayList de la clase Object y esta podria manejar cualquier tipo de Elemento, pero esta forma trae diversos inconvenientes
        INCONVENIENTES DE USAR OBJECT
        1) Uso continuo de casting. 
        2) Complicacion del codigo. 
        ) No posibilidad de comprobacion de errores en compilacion(manejo de excepciones)
        VENTAJAS DE PROGRAMACION GENERICA
        1) Reutilizacion del codigo en diferentes escenarios
        2) Comprobacion de errores en tiempo de compilacion
        3) Mayor sencillez del codigo
        */
        //Clases Genericas Demostracion:
        /*ParejaGenerica<String> una = new ParejaGenerica<String>();
        una.setPrimero("Juan");
        System.out.println(una.getPrimero());*/
        
        /*ParejaGenerica<Empleado> dos = new ParejaGenerica<Empleado>();
        dos.setPrimero(new Empleado("Diego Perez",21,0));
        System.out.println(dos.getPrimero());*/
        
        //PRUEBA METODOS GENERICOS
        /*String nombres[]={"Jose","Maria","Pepe","Aldo"};
        String elementos=MisMatrices.getElementos(nombres);
        System.out.println(elementos);
        
        Empleado listaEmpleados[]={new Empleado("Diego Perez",21,0),
            new Empleado("Anahi Gutierrez",25,0),
            new Empleado("Diego Bolañoz",21,0),
            new Empleado("Juan Perez",21,0),
            new Empleado("Ayuwoki Poroz",21,0)};      
        System.out.println(MisMatrices.getElementos(listaEmpleados));
        System.out.println(MisMatrices.getMenor(nombres));*/
        
        //HERENCIA EN CLASES GENERICAS
        /*Empleado Administrativa=new Empleado("Elena",45,1500);
        Jefe DirectoraComercial = new Jefe("Ana",27,3500);
        Empleado nuevoEmpleado=DirectoraComercial;*/
        //El principio de Sustitucion no funciona con Clases genericas
        ParejaGenerica<Empleado> Administrativa = new ParejaGenerica<Empleado>();
        ParejaGenerica<Jefe> DirectoraComercial = new ParejaGenerica<Jefe>();
        //ParejaGenerica<Empleado> nuevoEmpleado = new ParejaGenerica<Jefe>();
        ParejaGenerica.imprimirTrabajador(Administrativa);
        ParejaGenerica.imprimirTrabajador(DirectoraComercial); //Como se soluciona esto? utilizando tipos comodin
        
        
        
    }
}

class MisMatrices {
    /*Metodos Genericos, se adaptan con cualquier tipo de objeto, 
        estos metodos pueden estar construidos dentro de clases genericas o no genericas*/
    public static <T> String getElementos(T[]a){
        return "El Array tiene: " + a.length + " elementos"; 
    }
    /*Este metodo usara CompareTo de la interfaz Comparable<T>, devuelve un entero
    Compara dos objetos, el elemento actual con otro enviado por parametro
    A) Si devuelve un negativo, quiere decir que el elemento del parametro es mayor
    B) Si devuelve un cero, quiere decir que el elemento del parametro es igual
    C) Si devuelve un positivo, quiere decir que el elemento del parametro es menor
    ComparaTo solo funciona si los objetos comparables tienen el extends Comparable*/
    public static <T extends Comparable> T getMenor(T[]a){
        if (a==null || a.length==0)
            return null;   
        T elementoMenor=a[0];
        for(int i=1; i<a.length;i++){
            if (elementoMenor.compareTo(a[i])>0)
                elementoMenor=a[i];
        }
        return elementoMenor; 
    }
    //¿Porque se usa Extends en un metodo o clase generico?
    
}
