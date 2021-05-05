package Business;

import Abstract.CustomerCheckService;
import Entities.Customer;
public class NeroCustomerManager extends BaseCustomerManager{

    @Override
    public void add(Customer entity) {
        System.out.println(entity.getFirstName() + " " + entity.getLastName() + " veritabanına eklendi");
    }
}
