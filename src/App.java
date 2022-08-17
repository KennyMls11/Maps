import Domain.Customer;
import Domain.Persona;
import Service.CustomerService;
import Util.DniComparator;
import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


        /*Map<Persona, String> celularesPersonas= new HashMap<>();
        Map<Persona, String> agenda = new HashMap<>();
        agenda.put(new Persona(78945623, "Brenda", "Zattera"), "+5401100001111");
        agenda.put(new Persona(01234567, "Lucía", "Pérez"), "+5401122221111");
        agenda.put(new Persona(78912345, "Matías", "González"), "+5401145451111");


        System.out.println(agenda);

        Map< Persona, String>  treeMapEntries= new TreeMap<>(new DniComparator());
        treeMapEntries.put(new Persona(172455, "Brenda", "Zattera"),"+58322");
        treeMapEntries.put(new Persona(568999, "Kenny", "Delgado"),"+57322");
        treeMapEntries.put(new Persona(956655, "William", "González"),"+57322");




     System.out.println(treeMapEntries);*/
        public class App {
            public static void main(String[] args) {

        Customer customer1 = new Customer("hy 88", "Motorola", "Lavalle 1700");
        Customer customer2= new Customer("jh 56","Coca Cola company", "larrea21");
        Customer customer3= new Customer("aj 21","AerolineasArgentinas", "cabildo 76");
        Customer customer4=new Customer("as 611","ParadiseSmokeshop", "guemes 80");
        Customer customer5= new Customer("hp 6565","LionRollingCircus", "recoleta 21");

        Map<String, Customer> customers = new HashMap<>();
        customers.put(customer1.getCodigoDeRegistro(), customer1);
        customers.put(customer2.getCodigoDeRegistro(), customer2);
        customers.put(customer3.getCodigoDeRegistro(), customer3);
        customers.put(customer4.getCodigoDeRegistro(), customer4);
        customers.put(customer5.getCodigoDeRegistro(), customer5);











    }
}



