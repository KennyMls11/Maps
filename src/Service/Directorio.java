package Service;

import Domain.Contacto;
import Domain.Telefono;
import Domain.TipoTelefono;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Directorio {

    //String llave y valor objeto de tipo contacto//
    private Map<String, Contacto> contactos;

    public Directorio() {
        this.contactos= new TreeMap<>(); //creamos el treemap para q cada vez q instancio un directorio sea del tipo treemap//
        //si quiero puedo implementar un comparador para definir yo el orden //
    }
    public void registrarContacto(String nombre, String apellido){
        Contacto contacto= new Contacto(nombre, apellido);
        //instanciar un contacto con la coleccion vacia//
        contactos.put(contacto.getNombreCompleto(),contacto);


    } //sobrecargo y hago uno donde me pasen la coleccion de telefono por parametro//
    public void registrarContacto(String nombre, String apellido, Set<Telefono> contacto){
        Contacto aux= new Contacto(nombre, apellido,contacto);
        contactos.put (aux.getNombreCompleto(),aux);
    }
    public void removerContacto(String nombre, String apellido){
        contactos.remove(nombre+" "+ apellido);
        //retorna un contacto porq es del tipo de la coleccion de contactos//

    }

    public void registrarTelefono (String nombre, String apellido, TipoTelefono tipo, String codigoPais, String numeroTelefono) {
        Contacto contactoExistente = contactos.get(nombre + "" + apellido);
        if (contactoExistente == null) {
            Contacto nuevoContacto = new Contacto(nombre, apellido);
            nuevoContacto.getTelefonos().add(new Telefono(tipo, codigoPais, numeroTelefono));
            contactos.put(nuevoContacto.getNombreCompleto(), nuevoContacto);
        } else {
            Telefono nuevoTelefono = new Telefono(tipo, codigoPais, numeroTelefono);
            contactoExistente.getTelefonos().add(nuevoTelefono);

        }
    }

        public void removerTelefono(String nombre, String apellido, String indicativoPais, String numero) {
            if (contactos.containsKey(nombre + " " + apellido)) {
                Contacto contactoExistente = contactos.get(nombre + " " + apellido);
                boolean seEncontroTelefono = false;
                for (Telefono telefono : contactoExistente.getTelefonos()) {
                    if (telefono.getIndicativoPais().equals(indicativoPais)
                            && telefono.getNumero().equals(numero)) {
                        seEncontroTelefono = true;
                        contactoExistente.getTelefonos().remove(telefono);
                        break;
                    }
                }
                if (!seEncontroTelefono) {
                    System.out.println("El numero de telefono " + indicativoPais + numero +
                            " no estaregistrado en el contacto " + nombre + " " + apellido);
                }
            } else {
                System.out.println("El contacto " + nombre + " " + apellido + " no existe en el directorio");
            }
        }
    public Map<String, Contacto> getContactos(){
    return contactos;

    }
}
