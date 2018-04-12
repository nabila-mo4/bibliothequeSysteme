package src.main.java.org.openclass.projects.servicesweb;

import java.util.List;

import javax.jws.WebMethod;

import org.openclass.projects.business.contract.EmpruntManager;
import org.springframework.beans.factory.annotation.Autowired;

import src.main.java.org.openclass.projects.dto.EmpruntDTO;
import src.main.java.org.openclass.projects.dto.UtilisateurDTO;

public class EmpruntService {
	
	@Autowired
	EmpruntManager empruntManager;
	
	@WebMethod
	public EmpruntDTO getById(int idemprunt)
	{
		return empruntManager.getById(idemprunt);
	}

	
	@WebMethod
	public List<EmpruntDTO> empruntsByUtilisateur(UtilisateurDTO utilisateur)
	{
		return empruntManager.empruntsByUtilisateur(utilisateur);
	}
	
	
	@WebMethod
	public List<EmpruntDTO> list()
	{
		return empruntManager.list();
	}
	
	@WebMethod
	public boolean prolonger(EmpruntDTO emprunt)
	{
		return empruntManager.prolonger(emprunt);
	}
	
	
	@WebMethod
	public void add(EmpruntDTO emprunt)
	{
		empruntManager.add(emprunt);
	}
	
	@WebMethod
	public void update(EmpruntDTO emprunt)
	{
		empruntManager.update(emprunt);
	}
	
	@WebMethod
	public void delete(EmpruntDTO emprunt)
	{
		empruntManager.delete(emprunt);
	}
	
	@WebMethod
	public List<EmpruntDTO> empruntsEnRetard()
	{
		return empruntManager.empruntsEnRetard();
	}
}


