import Business.*;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

    public static void main(String[] args) {

        GameManager gameManager = new GameManager();
        Game game1 = new Game(1,"PES 2013",100);
       gameManager.add(game1);
       gameManager.update(game1);
        gameManager.delete(game1);

        System.out.println();

        GamerManager gamerManager = new GamerManager(new MernisManager());
        Gamer gamer1 = new Gamer(1,"Eren","Uludağ","37957595426",2003);
        gamerManager.add(gamer1);
        gamerManager.update(gamer1);
       gamerManager.delete(gamer1);

        System.out.println();

        CampaignManager campaignManager = new CampaignManager();
          Campaign campaign = new Campaign(1,"Yaz İndirimi",25);
       campaignManager.add(campaign);

         SaleManager saleManager = new SaleManager();
        saleManager.sellGame(game1,gamer1,campaign);
    }
}
