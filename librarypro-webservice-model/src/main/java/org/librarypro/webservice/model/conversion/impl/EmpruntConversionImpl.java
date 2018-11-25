package org.librarypro.webservice.model.conversion.impl;

import java.util.HashSet;

import java.util.Set;

import org.librarypro.webservice.model.conversion.contract.EmpruntConversion;
import org.librarypro.webservice.model.conversion.contract.OuvrageConversion;
import org.librarypro.webservice.model.conversion.contract.UtilisateurConversion;
import org.librarypro.webservice.model.dto.EmpruntDTO;
import org.librarypro.webservice.model.entities.Emprunt;
import org.librarypro.webservice.model.entities.Ouvrage;
import org.librarypro.webservice.model.entities.Utilisateur;

public class EmpruntConversionImpl  implements EmpruntConversion {

	
	public EmpruntDTO toEmpruntDTO(Emprunt emprunt, boolean isParent, String classParentName) {
		EmpruntDTO e = new EmpruntDTO();
		if(emprunt.getIdemprunt()!=0)
		{
			e.setIdemprunt(emprunt.getIdemprunt());
		}
		
		if(emprunt.getEncours()!=null)
		{
			e.setEncours(emprunt.getEncours());
		}
		
		if(emprunt.getProlonge()!=null)
		{
			e.setProlonge(emprunt.getProlonge());
		}
		
		if(emprunt.getDatedebut()!=null)
		{
			e.setDatedebut(emprunt.getDatedebut());
		}
		
		
		
		if(emprunt.getDateretour()!=null)
		{
			e.setDateretour(emprunt.getDateretour());
		}
		
		if(emprunt.getOuvrage()!=null)
		{
			
			OuvrageConversion oConversion = new OuvrageConversionImpl();
			e.setOuvrageDTO(oConversion.toOuvrageDTO(emprunt.getOuvrage(), false, Ouvrage.class.getSimpleName()));
		}
		
		if(emprunt.getUtilisateur()!=null)
		{
			UtilisateurConversion uConversion = new UtilisateurConversionImpl();
			e.setUtilisateurDTO(uConversion.toUtilisateurDTO(emprunt.getUtilisateur(), false, Utilisateur.class.getSimpleName()));
		}
		
		if(emprunt.getIdutilisateur()!=0)
		{
			e.setIdutilisateur(emprunt.getIdutilisateur());
		}
		
		
		
		if(emprunt.getIdouvrage()!=0)
		{
			e.setIdouvrage(emprunt.getIdouvrage());
		}
		
		return e;
	}



	
	public Set<EmpruntDTO> toEmpruntsDTO(Set<Emprunt> emprunts, boolean isParent, String classParentName) {
		Set<EmpruntDTO> o = new HashSet<>();
		for(Emprunt emprunt : emprunts)
		{
			o.add(toEmpruntDTO(emprunt, isParent, classParentName));
		}
		return o;
	}

	
	public Emprunt toEmpruntEntity(EmpruntDTO emprunt, boolean isParent, String classParentName) {
		
			Emprunt e = new Emprunt();
			if(emprunt.getIdemprunt()!=0)
			{
				e.setIdemprunt(emprunt.getIdemprunt());
			}
			
			if(emprunt.getEncours()!=null)
			{
				e.setEncours(emprunt.getEncours());
			}
			
			if(emprunt.getProlonge()!=null)
			{
				e.setProlonge(emprunt.getProlonge());
			}
			
			if(emprunt.getDatedebut()!=null)
			{
				e.setDatedebut(emprunt.getDatedebut());
			}
			
			
			
			if(emprunt.getDateretour()!=null)
			{
				e.setDateretour(emprunt.getDateretour());
			}
			
			if(emprunt.getOuvrageDTO()!=null)
			{
				
				OuvrageConversion oConversion = new OuvrageConversionImpl();
				e.setOuvrage(oConversion.toOuvrageEntity(emprunt.getOuvrageDTO(), false, Ouvrage.class.getSimpleName()));
			}
			
			if(emprunt.getUtilisateurDTO()!=null) 
			{
				UtilisateurConversion uConversion = new UtilisateurConversionImpl();
				e.setUtilisateur(uConversion.toUtilisateurEntity(emprunt.getUtilisateurDTO(), false, Utilisateur.class.getSimpleName()));
			}
			
			
			if(emprunt.getIdutilisateur()!=0)
			{
				e.setIdutilisateur(emprunt.getIdutilisateur());
			}
			
			if(emprunt.getIdouvrage()!=0)
			{
				e.setIdouvrage(emprunt.getIdouvrage());
			}
			
			
			return e;
			
	}

	
	public Set<Emprunt> toEmpruntsEntities(Set<EmpruntDTO> emprunts, boolean isParent, String classParentName) {
		Set<Emprunt> ou= new HashSet<>();
		for(EmpruntDTO e: emprunts)
		{
			ou.add(toEmpruntEntity(e, isParent, classParentName));
		}
		return ou;
	}

	
	
	

}
