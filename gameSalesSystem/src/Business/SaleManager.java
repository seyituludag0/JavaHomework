package Business;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {
    @Override
    public void sellGame(Game game, Gamer gamer) {
        String player = gamer.getFirstName() + " " + gamer.getLastName();
        String soldGame = game.getName();
        System.out.println(player + " isimli oyuncu " + soldGame + " oyununu " + game.getPrice() + " TL'ye sat�n ald�");
    }

    @Override
    public void sellGame(Game game, Gamer gamer, Campaign campaign) {
        String player = gamer.getFirstName() + " " + gamer.getLastName();
        String soldGame = game.getName();
        double price = game.getPrice() - (game.getPrice() * campaign.getDiscount()/100);
        System.out.println(player + " isimli oyuncu " + soldGame + " oyununu "
                + game.getPrice() + " TL'den " + campaign.getName() + " kampanyas� ile " + price + " TL'ye sat�n ald�");
    }
}
