package gameSystem.business.abstracts;

import gameSystem.entities.concretes.Campaign;
import gameSystem.entities.concretes.GameSale;
import gameSystem.entities.concretes.Gamer;

public interface GameSaleService {
	
	void sales(GameSale gameSale, Gamer gamer);
	void campaignSale(GameSale gameSale, Gamer gamer, Campaign campaign);

}
