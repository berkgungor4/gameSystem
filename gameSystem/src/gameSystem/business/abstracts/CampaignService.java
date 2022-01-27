package gameSystem.business.abstracts;

import gameSystem.entities.concretes.Campaign;

public interface CampaignService {

	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	
}
