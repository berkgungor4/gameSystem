package gameSystem.business.concretes;

import gameSystem.business.abstracts.CampaignService;
import gameSystem.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added :  "+ campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated :  "+ campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted :  "+ campaign.getName());
		
	}
}
