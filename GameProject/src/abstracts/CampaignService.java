package abstracts;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
	void add(Campaign campaign);

	void update(Campaign campaign);

	void delete(Campaign campaign);

	void CampaignSale(Campaign campaign, Game game);
}
