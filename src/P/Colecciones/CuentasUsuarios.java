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
        
         clientesBanco.add(cl5);
        
        for(Cliente e:clientesBanco){
            System.out.println(e);
        }
    }
    
}
