package Service;

import Domain.Customer;

import java.util.Map;

public class CustomerService {
    public static Customer getCustomerByKey(Map<String, Customer> customers, String key) {
        return customers.get(key); /*metodo que recorre todas las entradas del mapa verificando si esa key existe
        y si existe retorna el valor que tenga asociado esa key*/
    }
}




