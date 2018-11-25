package org.librarypro.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.List;

import org.librarypro.webservice.business.contract.manager.EmpruntManager;
import org.librarypro.webservice.model.dto.EmpruntDTO;
import org.librarypro.webservice.model.dto.OuvrageDTO;
import org.librarypro.webservice.model.entities.Emprunt;
import org.librarypro.webservice.model.entities.Ouvrage;
import org.springframework.stereotype.Service;

@Service
public class EmpruntManagerImpl extends AbstractManagerImpl  implements EmpruntManager {


	public void prolonger(int idemprunt) {
		getDaoFc().getEmpruntDao().prolonger(idemprunt);
	}
	
	public String prolonge(EmpruntDTO e) {
		Emprunt e1=getConvfac().getEmpruntConversion().toEmpruntEntity(e, true, Emprunt.class.getSimpleName());
		
		getDaoFc().getEmpruntDao().prolonge(e1);
		return "c fait";
	}

	public List<EmpruntDTO> empruntsEnCours() {
		List<Emprunt> emprunts = getDaoFc().getEmpruntDao().empruntsEnCours();
		List<EmpruntDTO> empruntsDTO = new ArrayList<>();
		for(Emprunt emprunt : emprunts)
		{
			
			empruntsDTO.add(getConvfac().getEmpruntConversion().toEmpruntDTO(emprunt, true, Emprunt.class.getSimpleName()));
		}
		return empruntsDTO;
	}

	
	public List<EmpruntDTO> list() {
		List<Emprunt> emprunts = getDaoFc().getEmpruntDao().list();
		List<EmpruntDTO> empruntsDTO = new ArrayList<>();
		for(Emprunt emprunt : emprunts)
		{
			
			empruntsDTO.add(getConvfac().getEmpruntConversion().toEmpruntDTO(emprunt, true, Emprunt.class.getSimpleName()));
		}
		

		return empruntsDTO;
	}
	
	public boolean emprunter(int idouvrage) {
		

		List<Emprunt> prets = getDaoFc().getEmpruntDao().list();
		
		Ouvrage o = getDaoFc().getOuvrageDao().getById(idouvrage);
		boolean etat = false;

		int nbdispo = o.getNbrestant();
		int nbrestant = nbdispo;

		for (Emprunt emprunt : prets) {
			if (emprunt.getOuvrage().getIdouvrage() == idouvrage && emprunt.getEncours()) {
			    o.setNbrestant(nbrestant-1);
			}
		}

		if (o.getNbrestant() <= 0) {
			etat = false;
		} else {
			etat = true;
		}

		return etat;
	}

	
	public void add(EmpruntDTO emprunt) {
		Emprunt empruntEnt = getConvfac().getEmpruntConversion().toEmpruntEntity(emprunt, true, EmpruntDTO.class.getSimpleName());
		getDaoFc().getEmpruntDao().add(empruntEnt);
		
	}

	public List<EmpruntDTO> empruntsByUtilisateur(int idutilisateur) {
		List<Emprunt> list=getDaoFc().getEmpruntDao().empruntsByUtilisateur(idutilisateur);
		List<EmpruntDTO> empruntsDTO = new ArrayList<>();
		for(Emprunt emprunt : list)
		{
			
			empruntsDTO.add(getConvfac().getEmpruntConversion().toEmpruntDTO(emprunt, true, Emprunt.class.getSimpleName()));
		}
		
		
		return empruntsDTO;
	}

	public List<EmpruntDTO> pretsencours() {
		List<Emprunt> emprunts = getDaoFc().getEmpruntDao().empruntsEnCours();
		List<EmpruntDTO> empruntsDTO = new ArrayList<>();
		for(Emprunt emprunt : emprunts)
		{
			
			empruntsDTO.add(getConvfac().getEmpruntConversion().toEmpruntDTO(emprunt, true, Emprunt.class.getSimpleName()));
		}
		
		for(EmpruntDTO e:empruntsDTO) {
			
			Ouvrage ouv= getDaoFc().getOuvrageDao().getById(e.getOuvrageDTO().getIdouvrage());
			OuvrageDTO o1=getConvfac().getOuvrageConversion().toOuvrageDTO(ouv, true, Ouvrage.class.getSimpleName());
			e.setOuvrageDTO(o1);
			
		}
		return empruntsDTO;
	}
	

}
