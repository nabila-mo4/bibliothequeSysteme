package org.openclass.projects.business.contract;

import src.main.java.org.openclass.projects.dto.UtilisateurDTO;
import src.main.java.org.openclass.projects.entities.Utilisateur;

public interface UtilisateurManager {
	
	boolean existant(String email);
	boolean validercompte(Utilisateur utilisateur, String mdp);
	UtilisateurDTO login(String email, String mdp);
	
	//List<UtilisateurDTO> searchUser(UserCriterias userCriterias);
	UtilisateurDTO getById(int idutilisateur);
	void add(UtilisateurDTO utilisateur);
	void update(UtilisateurDTO utilisateur);
	void delete(UtilisateurDTO utilisateur);

}
