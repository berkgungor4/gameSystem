package gameSystem.business.concretes;

import gameSystem.business.abstracts.GamerCheckService;
import gameSystem.entities.concretes.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return true;
		
	}
}