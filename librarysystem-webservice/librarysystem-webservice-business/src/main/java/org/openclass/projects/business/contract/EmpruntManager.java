package org.openclass.projects.business.contract;


import java.util.List;

import org.openclass.projects.business.impl.UtilisateurDTO;

import src.main.java.org.openclass.projects.dto.EmpruntDTO;



public interface EmpruntManager {
    
    boolean prolonger(EmpruntDTO emprunt);
	List<EmpruntDTO> empruntsEnRetard();
	EmpruntDTO getById(int idemprunt);
	List<EmpruntDTO> list();
	void add(EmpruntDTO emprunt);
	void update(EmpruntDTO emprunt);
	void delete(EmpruntDTO emprunt);
	List<EmpruntDTO> empruntsByUtilisateur(UtilisateurDTO utilisateur);
    
}
