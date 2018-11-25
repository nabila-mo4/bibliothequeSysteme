package org.oc.librarypro_webservice.webinterface.webservices;

import java.util.Hashtable;
import java.util.List;

import javax.jws.WebMethod;

import javax.jws.WebService;

import org.librarypro.webservice.model.dto.OuvrageDTO;
import org.oc.librarypro_webservice.webinterface.AbstractService;


@WebService(name = "OuvrageClient", serviceName = "OuvrageService", portName = "OuvragePort", targetNamespace="model.webapp.librarypro.org")
public class OuvrageService extends AbstractService{

	@WebMethod
	public  OuvrageDTO getBook(Integer id)
	{
		return getManagerFactory().getOuvrageManager().getById(id);
	}
	
	@WebMethod
	public List<OuvrageDTO> getAll()
	{
		return getManagerFactory().getOuvrageManager().list();
	}
	
	
	@WebMethod
	public List<OuvrageDTO> getOuvrageByTitre(String critere)
	{
		return getManagerFactory().getOuvrageManager().searchTitre(critere);
	}
	
	
	@WebMethod
	public List<OuvrageDTO> getOuvrageByAuteur(String critere)
	{
		return getManagerFactory().getOuvrageManager().searchAuteur(critere);
	}
	
	@WebMethod
	public void create(OuvrageDTO ouvrage)
	{
		getManagerFactory().getOuvrageManager().create(ouvrage);
	}
	
	@WebMethod
	public void update(OuvrageDTO ouvrage)
	{
		getManagerFactory().getOuvrageManager().update(ouvrage);
	}
	
	@WebMethod
	public void delete(OuvrageDTO ouvrage)
	{
		getManagerFactory().getOuvrageManager().delete(ouvrage);
	}
}
