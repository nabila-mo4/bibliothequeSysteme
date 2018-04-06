package src.main.java.org.openclass.projects.conversion.impl;

import java.util.HashSet;
import java.util.Set;


import src.main.java.org.openclass.projects.conversion.contract.AuteurConversion;
import src.main.java.org.openclass.projects.dto.AuteurDTO;
import src.main.java.org.openclass.projects.dto.OuvrageDTO;
import src.main.java.org.openclass.projects.entities.Auteur;
import src.main.java.org.openclass.projects.entities.Ouvrage;

public class AuteurConversionImpl implements AuteurConversion{

	@Override
	public Auteur toAuteurEntity(AuteurDTO auteur, boolean isParent, String classParentName) {
			
		Auteur auteurEnt = new Auteur();
		
		if(auteur.getIdauteur()!=0)
		{
			auteurEnt.setIdauteur(auteur.getIdauteur());
		}
		
		if(auteur.getNom()!=null)
		{
			auteurEnt.setNom(auteur.getNom());
		}
		
		if(auteur.getPrenom()!=null)
		{
			auteurEnt.setPrenom(auteur.getPrenom());
		}
		
		if(auteur.getBiographie()!=null)
		{
			auteurEnt.setBiographie(auteur.getBiographie());
		}
		
		if(auteur.getOuvrages()!=null)
		{
			auteurEnt.setOuvrages(auteur.getOuvrages());
		}
		
		if(auteur.getNationalite()!=null)
		{
			auteurEnt.setNationalite(auteur.getNationalite());
		}
		

		
		return auteurEnt;
	}

	@Override
	public AuteurDTO toAuteurDTO(Auteur auteur, boolean isParent, String classParentName) {
			
		AuteurDTO auteurDTO = new AuteurDTO();
		
		if(auteur.getIdauteur()!=0)
		{
			auteurDTO.setIdauteur(auteur.getIdauteur());
		}
		
		if(auteur.getNom()!=null)
		{
			auteurDTO.setNom(auteur.getNom());
		}
		
		if(auteur.getPrenom()!=null)
		{
			auteurDTO.setPrenom(auteur.getPrenom());
		}
		
		if(auteur.getBiographie()!=null)
		{
			auteurDTO.setBiographie(auteur.getBiographie());
		}
		
		if(auteur.getOuvrages()!=null)
		{
			auteurDTO.setOuvrages(auteur.getOuvrages());
		}
		
		if(auteur.getNationalite()!=null)
		{
			auteurDTO.setNationalite(auteur.getNationalite());
		}
		

		
		return auteurDTO;
		
	}

	@Override
	public Set<AuteurDTO> toAuteursDTO(Set<Auteur> auteurs, boolean isParent, String classParentName) {
		
		Set<AuteurDTO> auteursDTO = new HashSet<>();
		for(Auteur auteur : auteurs)
		{
			auteursDTO.add(toAuteurDTO(auteur, isParent, classParentName));
		}
		return auteursDTO;
	}

	@Override
	public Set<Auteur> toAuteursEntities(Set<AuteurDTO> auteurs, boolean isParent, String classParentName) {
		Set<Auteur> auteursEnt = new HashSet<>();
		for(AuteurDTO auteur : auteurs)
		{
			auteursEnt.add(toAuteurEntity(auteur, isParent, classParentName));
		}
		return auteursEnt;
	}

}
