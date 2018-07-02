package org.librarypro.webservice.business.contract.manager;

import java.util.List;

import org.librarypro.webservice.model.dto.EmpruntDTO;

public interface EmpruntManager {

	void prolonger(int idemprunt);
	List<EmpruntDTO> pretsencours();
	List<EmpruntDTO> list();
	boolean emprunter(int idouvrage);
	void add(EmpruntDTO emprunt);
	List<EmpruntDTO> empruntsByUtilisateur(int idutilisateur);
}
