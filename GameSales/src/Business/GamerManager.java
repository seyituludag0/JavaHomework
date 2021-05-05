package Business;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
    GamerCheckService gamerCheckService;
    public GamerManager(GamerCheckService gamerCheckService) {
        this.gamerCheckService = gamerCheckService;
    }

    public void add(Gamer gamer){
        if (gamerCheckService.checkIfRealPerson(gamer)){
           String nameSurname= gamer.getFirstName() + " " + gamer.getLastName();
            System.out.println(nameSurname + " oyuncu sisteme eklendi");
        }
        else{
            System.out.println("Kullan�c� bilgileri hatal�");
        }
    }

    public void update(Gamer gamer){
        if (gamerCheckService.checkIfRealPerson(gamer)){
            String nameSurname= gamer.getFirstName() + " " + gamer.getLastName();
            System.out.println(nameSurname + " oyuncu sistemdeki bilgilerini g�ncelledi");
        }
        else{
            System.out.println("Kullan�c� bilgileri hatal�");
        }
    }

    public void delete(Gamer gamer){
        System.out.println(gamer.getFirstName() + " " + "isimli oyuncu sistemden silindi");
    }
}
