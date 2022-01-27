package gameSystem.business.abstracts;

import gameSystem.entities.concretes.Gamer;

public interface GamerCheckService {
	
	boolean checkIfRealPerson(Gamer gamer);
	
}
