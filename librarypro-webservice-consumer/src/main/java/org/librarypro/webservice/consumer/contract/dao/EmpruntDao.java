package org.librarypro.webservice.consumer.contract.dao;

import java.util.List;

import org.librarypro.webservice.model.entities.Emprunt;

public interface EmpruntDao {
	
	void prolonger(int idemprunt);
	
	List<Emprunt> empruntsEnCours();
	
	List<Emprunt> list();
	
	void add(Emprunt emprunt);
	
	List<Emprunt> empruntsByUtilisateur(int idutilisateur);
	
	

}
