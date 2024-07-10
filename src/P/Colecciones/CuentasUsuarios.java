package P.Colecciones;
import java.util.*;


/**
 *
 * @author braya
 */
public class CuentasUsuarios {
    public static void main(String[] args) {
        Cliente cl1= new Cliente("Diego Perez","00001",200000);
        Cliente cl2= new Cliente("Rafael Nadal","00002",250000);
        Cliente cl3= new Cliente("Penelope Cruz","00003",300000);
        Cliente cl4= new Cliente("Julio Iglesias","00004",500000);
        
        Cliente cl5= new Cliente("Diego Perez","00001",200000);
        
        Set <Cliente>clientesBanco = new HashSet<Cliente>();
        
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
       
        //FOREACH me sirve solo para recorrer, si intento eliminar mientras recorro me sale un problema de concurrencia
       /*  clientesBanco.add(cl5); //No lo agrega por ser un HashSet que no acepta elementos duplicados    
        for(Cliente e:clientesBanco){
            //System.out.println(e);
        }*/
        
       //Para ELIMINAR objetos de la lista es mucho mas util el iterator
        Iterator<Cliente> it=clientesBanco.iterator(); //creo un iterator y le asigno la coleccion para iterar
        while(it.hasNext()){
            String nombre_cliente=it.next().getNombre();
            //System.out.println(nombre_cliente);
            if(nombre_cliente.equals("Julio Iglesias"))
                it.remove();
            //System.out.println(it.next().getNombre());
        }
        
        for(Cliente cliente:clientesBanco){
            System.out.println(cliente);
        }
        
        
        
    }
    
}
