package org.librarypro.webservice.business.contract.manager;

import java.util.List;

import org.librarypro.webservice.model.dto.UtilisateurDTO;

public interface UtilisateurManager {
	
	
	
		 List<UtilisateurDTO> list();
	    boolean valid(String email, String mdp);
	   
	    UtilisateurDTO utilisateursparmail(String email);
		

}
