package gameSystem.business.concretes;

import gameSystem.business.abstracts.GamerCheckService;
import gameSystem.entities.concretes.Gamer;

public class GamerManager extends BaseGamerManager {

	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void save(Gamer gamer) {

		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Save to database : " + gamer.getFirstName());
		} else {
			System.out.println("Not a valid person");
		}
	}
	
	@Override
	public void update(Gamer gamer) {

		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Update in database : " + gamer.getFirstName());
		} else {
			System.out.println("Not a valid person");
		}
	}
	
	@Override
	public void delete(Gamer gamer) {

		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Delete from database : " + gamer.getFirstName());
		} else {
			System.out.println("Not a valid person");
		}
	}
	
}