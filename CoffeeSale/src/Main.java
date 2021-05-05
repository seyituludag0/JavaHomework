import Adapters.MernisServiceAdapter;
import Business.BaseCustomerManager;
import Business.NeroCustomerManager;
import Business.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer1 = new Customer(1,"Seyit","Uludağ",2001,"12345678900");
        baseCustomerManager.add(customer1);


    }
}
