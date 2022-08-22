import Domain.*;
import Service.CustomerService;
import Service.Directorio;
import Util.DniComparator;

import java.util.*;


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




System.out.println(treeMapEntries);


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
}*/
        public class App {
                public static void main(String[] args) {
                        //creando telefonos
                        Telefono tel1 = new Telefono(TipoTelefono.MOVIL, "+54", "01156561212");
                        Telefono tel2 = new Telefono(TipoTelefono.MOVIL, "+39", "016578456598");
                        Telefono tel3 = new Telefono(TipoTelefono.MOVIL, "+1", "3476966917");
                        Telefono tel4 = new Telefono(TipoTelefono.MOVIL, "+44", "212245778");

                        //creando set de telefonos
                        Set<Telefono> set1 = new HashSet<>();
                        set1.add(tel3);
                        set1.add(tel4);

                        Set<Telefono> set2 = new HashSet<>();
                        set2.add(tel2);
                        set2.add(tel3);

                        Set<Telefono> set3 = new HashSet<>();
                        set3.add(tel1);

                        Set<Telefono> set4 = new HashSet<>();
                        set4.add(tel1);
                        set4.add(tel2);
                        set4.add(tel3);

                        //creando contactos
                        Contacto contacto1 = new Contacto("Brenda", "Zattera");
                        Contacto contacto2 = new Contacto("Lucía", "Pérez");
                        Contacto contacto3 = new Contacto("Juan", "Fernández", set3);
                        Contacto contacto4 = new Contacto("Marcos", "González", set1);

                        //creando directorio
                        Directorio directorioBrenda = new Directorio();

                        //llamando métodos
                        directorioBrenda.registrarContacto(contacto1.getNombre(), contacto1.getApellido(), set2);
                        directorioBrenda.registrarContacto(contacto3.getNombre(), contacto3.getApellido(), set3);
                        directorioBrenda.registrarContacto(contacto2.getNombre(), contacto3.getApellido(), set1);
                        directorioBrenda.registrarContacto(contacto4.getNombre(), contacto4.getApellido(), set1);


                        System.out.println("----------------------");

                        directorioBrenda.registrarTelefono("Pedro", "Sanchez", TipoTelefono.FIJO, "+39", "3461547765");
                        directorioBrenda.registrarTelefono("Lucía", "Pérez", TipoTelefono.OFICINA, "+54", "2213659852");

                        System.out.println("----------------------");

                        directorioBrenda.removerContacto("Marcos", "González");
                        directorioBrenda.removerContacto("Marcos", "De La Torre");

                        System.out.println("----------------------");

                        directorioBrenda.removerTelefono("Juan", "Fernández", "+54", "01156561212");
                        directorioBrenda.removerTelefono("Juan", "Fernández", "+23", "123456789");

                        System.out.println("----------------------");

                        System.out.println(directorioBrenda.getContactos());

                        
                }
        }













