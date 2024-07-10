
package P.Colecciones;

/**
 *
 * @author braya
 */
public class UsoLibro {
    
    public static void main(String[] args) {
        Libro libro1 = new Libro("P en Java","Juan",2577);
        Libro libro2 = new Libro("P en Java","Juan",25);
        
        //Equal se usa para comparar, es necesario sobreescribir en nuevas clases para que compare mis clases.
        /*if (libro1.equals(libro2)) {
            System.out.println("Es el mismo libro");
        } else{
            System.out.println("No es el mismo libro");        
        }*/
        //libro1=libro2;
        System.out.println("Libro 1: " + libro1.hashCode());
        System.out.println("Libro 2: " + libro2.hashCode());
        libro1=libro2;
        System.out.println("Libro 1: " + libro1.hashCode());
        System.out.println("Libro 2: " + libro2.hashCode());
        
    }
    
    
}
