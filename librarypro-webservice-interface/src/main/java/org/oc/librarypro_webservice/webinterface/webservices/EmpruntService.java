package org.oc.librarypro_webservice.webinterface.webservices;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.librarypro.webservice.model.dto.EmpruntDTO;
import org.librarypro.webservice.model.dto.UtilisateurDTO;
import org.librarypro.webservice.model.entities.Emprunt;
import org.oc.librarypro_webservice.webinterface.AbstractService;

@WebService (name = "EmpruntClient", serviceName = "EmpruntService", portName = "EmpruntPort", targetNamespace="model.webapp.librarypro.org")

public class EmpruntService extends AbstractService{
	

	
	@WebMethod
	public List <EmpruntDTO> empruntsByUtilisateur(int idutilisateur)
	{
		return getManagerFactory().getEmpruntManager().empruntsByUtilisateur(idutilisateur);
	}
	
	
	@WebMethod
	public List<EmpruntDTO> list()
	{
		return getManagerFactory().getEmpruntManager().list();
	}
	
	@WebMethod
	public void prolonger(int idemprunt)
	{
	   getManagerFactory().getEmpruntManager().prolonger(idemprunt);
	}
	
	
	@WebMethod
	public String prolonge(EmpruntDTO e)
	{
	   getManagerFactory().getEmpruntManager().prolonge(e);
	   
	   return "ca march";
	}
	
	
	@WebMethod
	public void add(EmpruntDTO emprunt)
	{
	   getManagerFactory().getEmpruntManager().add(emprunt);
	}
	
	@WebMethod
	public List<EmpruntDTO> empruntsEnCours()
	{
		return getManagerFactory().getEmpruntManager().pretsencours();
	}
	@WebMethod
	public void print() {
		System.out.println("nj");
		
	}

}
