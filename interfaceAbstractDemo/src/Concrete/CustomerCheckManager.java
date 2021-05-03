package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkPersonService(Customer customer) {
        return true;
    }
}
