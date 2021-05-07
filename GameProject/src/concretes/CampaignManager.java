package concretes;

import Entities.Campaign;
import Entities.Game;
import abstracts.CampaignService;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getDiscount() +" indirimli '"+ campaign.getCampaignName() + "' Kampanya Satislari Baslamistir." );
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "'nin Satis Suresi 1 Hafta Uzatilmistir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Kapmpanya satisimiz bitmistir.");
		
	}

	@Override
	public void CampaignSale(Campaign campaign, Game game) {
		double newPrice = game.getGamePrice() - ((game.getGamePrice() * campaign.getDiscount() / 100));
		System.out.println(game.getGameName() + " isimli oyun, '" + campaign.getCampaignName() + "' dahilindeki %"
				+ campaign.getDiscount() + " indirimle " + newPrice + "$'a satin alindi. Iyi Oyunlar Dileriz.");
		
	}

}
