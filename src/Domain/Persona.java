package Domain;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private int dni;
    private String nombre;
    private String apellido;


    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Persona: " + nombre + " " + apellido + ", dni: " + dni;
    }

    @Override
    //la firma tiene q ser la misma//
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //casteo, el objeto pasado por parametro lo convierto en persona/
        Persona persona = (Persona) o;
        return dni == persona.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);

    }

    @Override
    public int compareTo(Persona o) {
        //el string tiene el metodo compareto//
        return nombre.compareTo(o.getNombre());
    }
}


