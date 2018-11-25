package org.oc.librarypro_webservice.webinterface.webservices;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.librarypro.webservice.model.dto.UtilisateurDTO;
import org.oc.librarypro_webservice.webinterface.AbstractService;

@WebService(name = "UtilisateurClient", serviceName = "UtilisateurService", portName = "UtilisateurPort", targetNamespace="model.webapp.librarypro.org")
public class UtilisateurService extends AbstractService {
	
	@WebMethod
	public List <UtilisateurDTO> users() { 

		List <UtilisateurDTO> list = getManagerFactory().getUtilisateurManager().list();

		return list;
	}

	@WebMethod
	public boolean valider(String email, String mdp) {
		return getManagerFactory().getUtilisateurManager().valid(email, mdp);
	}

	@WebMethod
	public UtilisateurDTO getUtilisateurByEmail(String email) {
		return getManagerFactory().getUtilisateurManager().utilisateursparmail(email);
	}

}
