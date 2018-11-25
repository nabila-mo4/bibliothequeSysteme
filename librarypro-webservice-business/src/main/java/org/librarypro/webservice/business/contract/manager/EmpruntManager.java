package org.librarypro.webservice.business.contract.manager;

import java.util.List;

import org.librarypro.webservice.model.dto.EmpruntDTO;
import org.librarypro.webservice.model.entities.Emprunt;

public interface EmpruntManager {

	void  prolonger(int idemprunt);
	String prolonge(EmpruntDTO e);
	List<EmpruntDTO> pretsencours();
	List<EmpruntDTO> list();
	boolean emprunter(int idouvrage);
	void add(EmpruntDTO emprunt);
	List<EmpruntDTO> empruntsByUtilisateur(int idutilisateur);
}
