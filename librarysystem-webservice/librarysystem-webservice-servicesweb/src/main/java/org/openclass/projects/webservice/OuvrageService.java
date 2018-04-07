package src.main.java.org.openclass.projects.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.openclass.projects.business.contract.OuvrageManager;
import org.springframework.beans.factory.annotation.Autowired;

import src.main.java.org.openclass.projects.dto.OuvrageDTO;


@WebService(name = "Ouvrageclient", serviceName = "OuvrageService", portName = "OuvragePort", targetNamespace="model.generated.webinterface.librarysystem.com")
public class OuvrageService {
	
	
	@Autowired 
	OuvrageManager ouvrageManager;
	
	@WebMethod
	public OuvrageDTO findById(int idouvrage)
	{
		return ouvrageManager.getById(idouvrage);
	}
	
	@WebMethod
	public List<OuvrageDTO> list()
	{
		return ouvrageManager.list();
	}
	
	@WebMethod
	public void add(OuvrageDTO ouvrage)
	{
		ouvrageManager.create(ouvrage);
	}
	
	@WebMethod
	public void update(OuvrageDTO ouvrage)
	{
		ouvrageManager.update(ouvrage);
	}
	
	@WebMethod
	public void delete(OuvrageDTO ouvrage)
	{
		ouvrageManager.delete(ouvrage);
	}
	

}
