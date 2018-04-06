package src.main.java.org.openclass.projects.conversion.impl;

import java.util.Calendar;
import java.util.Set;
import java.util.HashSet;


import src.main.java.org.openclass.projects.conversion.contract.EmpruntConversion;

import src.main.java.org.openclass.projects.conversion.contract.OuvrageConversion;
import src.main.java.org.openclass.projects.dto.EmpruntDTO;
import src.main.java.org.openclass.projects.entities.Auteur;
import src.main.java.org.openclass.projects.entities.Ouvrage;

public class EmpruntConversionImpl implements EmpruntConversion {

	@Override
	public EmpruntDTO toEmpruntDTO(Emprunt emprunt, boolean isParent, String classParentName) {
		
		EmpruntDTO empruntDTO = new EmpruntDTO();
		empruntDTO.setIdemprunt(emprunt.getIdemprunt());
		if(null==emprunt.getDatefin())
		{
			Calendar calendrier = Calendar.getInstance();
			calendrier.setTime(emprunt.getDatedebut());
			int nbMois = emprunt.getProlonge() ? 2 : 1;
			calendrier.add(Calendar.MONTH, nbMois);
			empruntDTO.setDatefin(calendrier.getTime());
		}
		else
		{
			Calendar calendrier = Calendar.getInstance();
			calendrier.setTime(emprunt.getDatefin());
			int nbMois = emprunt.getProlonge() ? 1 : 0;
			calendrier.add(Calendar.MONTH, nbMois);
			empruntDTO.setDatefin(calendrier.getTime());
		}
		
		empruntDTO.setDateretour(emprunt.getDateretour());
		empruntDTO.setProlonge(emprunt.getProlonge());
		empruntDTO.setDatedebut(emprunt.getDatedebut());
	    OuvrageConversion ouvrageConversion = new OuvrageConversionImpl();
		empruntDTO.setOuvrageDTO(ouvrageConversion.toOuvrageDTO(emprunt.getOuvrage(), false, Emprunt.class.getSimpleName()));
		if(emprunt.getUtilisateur()!=null && (isParent||classParentName.equals(Ouvrage.class.getSimpleName())))
		{
			UtilisateurConversion utilisateurConversion = new UtilisateurConversionImpl();
			empruntDTO.setUtilisateur(utilisateurConversion.toUtilisateurDTO( emprunt.getUtilisateur(), false, Emprunt.class.getSimpleName()));
		}
		return empruntDTO;
	}

	@Override
	public Set<EmpruntDTO> toEmpruntsDTO(Set<Emprunt> emprunts, boolean isParent, String classParentName) {
		
		Set<EmpruntDTO> empruntsDTO = new HashSet<>();
		for(Emprunt emprunt : emprunts)
		{
			empruntsDTO.add(toEmpruntDTO(emprunt, isParent, classParentName));
		}
		return empruntsDTO;
	}

	@Override
	public Emprunt toEmpruntEntity(EmpruntDTO emprunt, boolean isParent, String classParentName) {
		
		Emprunt empruntEnt = new Emprunt();
		
		empruntEnt.setIdemprunt(emprunt.getIdemprunt());
		empruntEnt.setDateretour(emprunt.getDateretour());
		empruntEnt.setProlonge(emprunt.getProlonge());
		empruntEnt.setDatedebut(emprunt.getDatedebut());
		
		if(emprunt.getOuvrageDTO() !=null && (isParent||classParentName.equals(Utilisateur.class.getSimpleName())))
		{
			EmpruntConversion empruntConversion = new EmpruntConversionImpl();
			empruntEnt.setOuvrage(empruntConversion.toOuvrageEntity(emprunt.getOuvrageDTO(), false, Emprunt.class.getSimpleName()));
		}
		
		
		if(emprunt.getUtilisateur()!=null && (isParent||classParentName.equals(Utilisateur.class.getSimpleName())||classParentName.equals(Utilisateur.class.getSimpleName())))
		{
			UtilisateurConversion utilisateurConversion = new UtilisateurConversionImpl();
			empruntEnt.setUtilisateur(utilisateurConversion.toUtilisateurEntity( emprunt.getUtilisateur(), false, Emprunt.class.getSimpleName()));
		}
		
		return empruntEnt;
	}

	@Override
	public Set<Emprunt> toEmpruntsEntities(Set<EmpruntDTO> emprunts, boolean isParent, String classParentName) {
		Set<Emprunt> empruntsEnt = new HashSet<>();
		for(EmpruntDTO emprunt : emprunts)
		{
			empruntsEnt.add(toEmpruntEntity(emprunt, isParent, classParentName));
		}
		return empruntsEnt;
	}

}
