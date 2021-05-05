package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import Mernis.IASKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        IASKPSPublicSoap publicSoap = new IASKPSPublicSoap();

       try {
           return publicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName(),
                   customer.getLastName(),customer.getYearOfBirth());
       }catch (Exception e){
           e.printStackTrace();
       }
       return false;
    }
}
