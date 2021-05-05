package Business;

import Abstract.CustomerCheckService;
import Entities.Customer;
public class StarbucksCustomerManager extends BaseCustomerManager{
    CustomerCheckService customerCheckService;
    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer entity) {
        if (customerCheckService.checkIfRealPerson(entity)){
            super.add(entity);
        }
        else{
            System.out.println("Kişi doğrulanamadı");
        }
    }
}
