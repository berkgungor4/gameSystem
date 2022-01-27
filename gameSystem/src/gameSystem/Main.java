package gameSystem;

import java.time.LocalDate;

import gameSystem.adapters.MernisServiceAdapter;
import gameSystem.business.concretes.BaseGamerManager;
import gameSystem.business.concretes.GameSaleManager;
import gameSystem.business.concretes.GamerManager;
import gameSystem.entities.concretes.Campaign;
import gameSystem.entities.concretes.GameSale;
import gameSystem.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(1997, 12, 26);
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setNationalityId("00000000000");
		gamer.setFirstName("Berk");
		gamer.setLastName("Güngör");
		gamer.setDateOfBirth(date);

		BaseGamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.save(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setName("5 percent discount");
		campaign.setDiscount(5);
		
		GameSale gameSale = new GameSale();
		gameSale.setId(1);
		gameSale.setGameName("CS GO");
		gameSale.setPrice(100);
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sales(gameSale, gamer);
		gameSaleManager.campaignSale(gameSale, gamer, campaign);

	}

}
