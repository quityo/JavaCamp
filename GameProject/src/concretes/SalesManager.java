package concretes;

import Entities.Campaign;
import Entities.Game;
import Entities.User;
import abstracts.SalesService;

public class SalesManager implements SalesService {

	@Override
	public void buyGame(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName()+ " "+ user.getLastName()+ ", '"+ game.getGameName() + "' Oyununu '" + 
				campaign.getCampaignName() + "' Ile Satýn Aldý.");
		
	}

	@Override
	public void giveBack(User user, Game game, Campaign campaign) {
		
		
	}

	
}
