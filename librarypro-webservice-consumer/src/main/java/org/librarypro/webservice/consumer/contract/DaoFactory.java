package org.librarypro.webservice.consumer.contract;

import org.librarypro.webservice.consumer.contract.dao.AuteurDao;
import org.librarypro.webservice.consumer.contract.dao.EmpruntDao;
import org.librarypro.webservice.consumer.contract.dao.OuvrageDao;
import org.librarypro.webservice.consumer.contract.dao.UtilisateurDao;

public interface DaoFactory {
	
	
	OuvrageDao getOuvrageDao();
	void setOuvrageDao(OuvrageDao ouvrageDao);
	
	AuteurDao getAuteurDao();
	void setAuteurDao(AuteurDao auteurDao);
	
	EmpruntDao getEmpruntDao();
	void setEmpruntDao(EmpruntDao empruntDao);
	
	UtilisateurDao getUtilisateurDao();
	void setUtilisateurDao(UtilisateurDao utilisateurDao);
	
}
