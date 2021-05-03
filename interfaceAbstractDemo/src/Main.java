import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager = new NeroCustomerManager();
        Customer customer = new Customer(1, "Seyit", "Uludağ", new Date(2001, 7, 3),
                "47896892104");
        customerManager.save(customer);
    }
}
