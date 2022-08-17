package Util;

import Domain.Persona;

import java.util.Comparator;

public class DniComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        int auxiliar = 0;
        if (o1.getDni() > o2.getDni()) {
            auxiliar = 1;
        } else if (o2.getDni() < o1.getDni()) {
            auxiliar = -1;
        }
        return auxiliar;
    }
}
