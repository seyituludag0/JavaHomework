package Business;

import Abstract.Repository;
import Entities.Customer;
public abstract class BaseCustomerManager implements Repository<Customer> {
    @Override
    public void add(Customer entity) {
        System.out.println(entity.getFirstName() + " " + entity.getLastName() +" veritabanına kaydedildi");
    }

    @Override
    public void update(Customer entity) {
        System.out.println(entity.getFirstName() + " " + entity.getLastName() +" veritabanındaki bilgilerini güncelledi");
    }

    @Override
    public void delete(Customer entity) {
        System.out.println(entity.getFirstName() + " " + entity.getLastName() +" veritabanından silindi");
    }
}
