package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    CustomerCheckService customerCheckService;

    @Override
    public void save(Customer customer)
    {
        if (customerCheckService.checkPersonService(customer)){
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + "veritabanına kaydedildi");
        }else{
            System.out.println("Kişi doğrulanamadı");
        }
    }



}
