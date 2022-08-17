import Domain.Customer;
import Domain.Persona;
import Service.CustomerService;
import Util.DniComparator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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

        Scanner leer= new Scanner(System.in);

        Customer customer1 = new Customer("HY881", "Motorola", "Lavalle 1700");
        Customer customer2= new Customer("JH456","Coca Cola company", "larrea21");
        Customer customer3= new Customer("AJ521","AerolineasArgentinas", "cabildo 76");
        Customer customer4=new Customer("AS6111","ParadiseSmokeshop", "guemes 80");
        Customer customer5= new Customer("HP655","LionRollingCircus", "recoleta 21");

        Map<String, Customer> customers = new HashMap<>();
        customers.put(customer1.getCodigoDeRegistro(), customer1);
        customers.put(customer2.getCodigoDeRegistro(), customer2);
        customers.put(customer3.getCodigoDeRegistro(), customer3);
        customers.put(customer4.getCodigoDeRegistro(), customer4);
        customers.put(customer5.getCodigoDeRegistro(), customer5);

        for (Map.Entry<String,Customer> customersAux: customers.entrySet()){
                System.out.println(customersAux.toString());
                    }

                    System.out.println(" _______________________________________");

        System.out.println("Ingrese el codigo de regustro a buscar");
        String aux= leer.next();

        if (CustomerService.getCustomerByKey(customers,aux)==null) {
                System.out.println( "El elemento buscado no se encuentra registrado");
        } else {
                System.out.println(CustomerService.getCustomerByKey(customers,aux).toString());
        }











    }
}



