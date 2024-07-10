package P.Colecciones;

/**
 *
 * @author braya
 */
public class Libro {

    private String titulo;
    private String autor;
    private int ISBN;

    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getDatos() {
        return "El titulo es: " + titulo + ", El autor es: " + autor + ", Y el ISBN es: " + ISBN;
    }
    /*HASHCODE me devuelve un entero y esta es como la direccion de memoria donde esta almacenado el objeto, segun un atributo
    puedo saber si es el mismo o no, tambien es recomendable sobreescribirlo*/
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.ISBN;
        return hash;
    }
    /*EQUALS me sirve para hacer comparaciones de dos objetos, es recomendable sobreescribirlos 
    cuando creas una clase, segun un atributo que comparara si son iguales o no*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return this.ISBN == other.ISBN;
    }



}
