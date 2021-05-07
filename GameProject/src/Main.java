import java.time.LocalDate;

import Entities.Campaign;
import Entities.Game;
import Entities.User;
import adapters.MernisServiceAdapter;
import concretes.CampaignManager;
import concretes.GameManager;
import concretes.SalesManager;
import concretes.UserManager;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Fu", "Yu","fu@fu.com", LocalDate.of(1900, 7, 7), "123456789");
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user);

		Game game1 = new Game(1, "Fallout", 40);
		Game game2 = new Game(2, "Diablo", 50);

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.update(game1);
		gameManager.delete(game1);

		Campaign campaign1 = new Campaign(1, "You Are Not Choosen One Kampanyasý", 10);
		Campaign campaign2 = new Campaign(2, "Hello My Friend Kampanyasý", 5);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign2);
		campaignManager.CampaignSale(campaign1, game1);

		SalesManager salesManager = new SalesManager();
		salesManager.buyGame(user, game1, campaign1);
		salesManager.giveBack(user, game2, campaign2);

	}

}
