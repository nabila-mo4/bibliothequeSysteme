package org.librarypro.webservice.business.contract;

import org.librarypro.webservice.business.contract.manager.AuteurManager;
import org.librarypro.webservice.business.contract.manager.EmpruntManager;
import org.librarypro.webservice.business.contract.manager.OuvrageManager;
import org.librarypro.webservice.business.contract.manager.UtilisateurManager;
import org.springframework.stereotype.Service;
@Service
public interface ManagerFactory {
	
	OuvrageManager getOuvrageManager();
	void setOuvrageManager(OuvrageManager ouvrageManager);
	
	AuteurManager getAuteurManager();
	void setAuteurManager(AuteurManager auteurManager);
	
	EmpruntManager getEmpruntManager();
	void setEmpruntManager(EmpruntManager empruntManager);
	
	UtilisateurManager getUtilisateurManager();
	void setUtilisateurManager(UtilisateurManager utilisateurManager);


}
