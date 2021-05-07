package abstracts;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface SalesService {
	void buyGame(User user, Game game, Campaign campaign);

	void giveBack(User user, Game game, Campaign campaign);
}
