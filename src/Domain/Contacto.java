package Domain;
import java.util.HashSet;
import java.util.Set;

public class Contacto {
    private String nombre;
    private String apellido;
    private Set<Telefono> telefonos;

    //defino 2 constructores, nombre y apellido//

    public Contacto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonos= new HashSet<>();
        //nuestras coleccion esta vacia cuando instanciamos objetos con este constructor//
    }

    public Contacto(String nombre, String apellido, Set<Telefono> contactos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonos = telefonos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public String getNombreCompleto(){
        return nombre + apellido;
    }

    public Set<Telefono> getTelefonos() {
        return telefonos;
    }
}
