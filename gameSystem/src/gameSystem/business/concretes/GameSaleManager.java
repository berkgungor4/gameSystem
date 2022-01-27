package gameSystem.business.concretes;

import gameSystem.business.abstracts.GameSaleService;
import gameSystem.entities.concretes.Campaign;
import gameSystem.entities.concretes.GameSale;
import gameSystem.entities.concretes.Gamer;

public class GameSaleManager implements GameSaleService {

	@Override
	public void sales(GameSale gameSale, Gamer gamer) {
		
		System.out.println(gameSale.getGameName() + " sold for " + gameSale.getPrice() + " euro to " + gamer.getFirstName());
		
	}
	
	@Override
	public void campaignSale(GameSale gameSale, Gamer gamer, Campaign campaign) {
		
		double newPrice = gameSale.getPrice() - ( gameSale.getPrice() * campaign.getDiscount() / 100);
		
		System.out.println("Discounted price = " + newPrice + " euro ");
		
	}
}
