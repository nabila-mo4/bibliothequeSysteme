package org.openclass.projects.consumer.contract;

import java.util.List;



import src.main.java.org.openclass.projects.dto.EmpruntDTO;
import src.main.java.org.openclass.projects.entities.Emprunt;

public interface EmpruntDao {
	
	void prolonger(Emprunt emprunt);
	List<Emprunt> empruntsEnRetard();
	Emprunt getById(int idemprunt);
	List<Emprunt> list();
	void add(Emprunt emprunt);
	void update(Emprunt emprunt);
	void delete(Emprunt emprunt);
	List<Emprunt> empruntsByUtilisateur(Utilisateur utilisateur);

}
