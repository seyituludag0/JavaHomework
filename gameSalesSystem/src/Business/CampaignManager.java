package Business;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName() + " " + "isimli kampanya sisteme eklendi");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getName() + " " + "isimli kampanya güncellendi");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName() + " " + "isimli kampanya sistemden silindi");
    }
}
