package org.librarypro.webservice.consumer.contract.dao;

import java.util.List;

import org.librarypro.webservice.model.entities.Utilisateur;

public interface UtilisateurDao {
	
	public List<Utilisateur> list();

	Utilisateur getUtilisateurByEmail(String email);

}
