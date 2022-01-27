package gameSystem.business.concretes;

import gameSystem.business.abstracts.*;
import gameSystem.entities.concretes.Gamer;

public abstract class BaseGamerManager implements GamerService {
	
	@Override
	public void save(Gamer gamer) {
		System.out.println("Saved to database : " + gamer.getFirstName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Updated in database : " + gamer.getFirstName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Deleted from database : " + gamer.getFirstName());

	}
	
}
