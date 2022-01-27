package gameSystem.business.abstracts;

import gameSystem.entities.concretes.Gamer;

public interface GamerService {
	
	void save(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
	
}
