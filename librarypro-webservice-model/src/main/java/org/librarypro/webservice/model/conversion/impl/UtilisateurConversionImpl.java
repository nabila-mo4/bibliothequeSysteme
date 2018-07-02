package org.librarypro.webservice.model.conversion.impl;

import java.util.HashSet;
import java.util.Set;

import org.librarypro.webservice.model.conversion.contract.UtilisateurConversion;
import org.librarypro.webservice.model.dto.EmpruntDTO;
import org.librarypro.webservice.model.dto.UtilisateurDTO;
import org.librarypro.webservice.model.entities.Emprunt;
import org.librarypro.webservice.model.entities.Ouvrage;
import org.librarypro.webservice.model.entities.Utilisateur;

public class UtilisateurConversionImpl implements UtilisateurConversion{


	public Utilisateur toUtilisateurEntity(UtilisateurDTO utilisateur, boolean isParent, String classParentName) {
		Utilisateur u = new Utilisateur();
		if(utilisateur.getIdutilisateur()!=0)
		{
			u.setIdutilisateur(utilisateur.getIdutilisateur());
		}
		
		if(utilisateur.getEmail()!=null)
		{
			u.setEmail(utilisateur.getEmail());
		}
		
		if(utilisateur.getMdp()!=null)
		{
			u.setMdp(utilisateur.getMdp());
		}
		
		if(utilisateur.getNom()!=null)
		{
			u.setNom(utilisateur.getNom());
		}
		
		if(utilisateur.getPrenom()!=null)
		{
			u.setPrenom(utilisateur.getPrenom());
		}
		if(utilisateur.getAddresse()!=null)
		{
			u.setAddresse(utilisateur.getAddresse());
		}
		
		return u;
	}

	
	public UtilisateurDTO toUtilisateurDTO(Utilisateur utilisateur, boolean isParent, String classParentName) {
		
		
		UtilisateurDTO u = new UtilisateurDTO();
		if(utilisateur.getIdutilisateur()!=0)
		{
			u.setIdutilisateur(utilisateur.getIdutilisateur());
		}
		
		if(utilisateur.getEmail()!=null)
		{
			u.setEmail(utilisateur.getEmail());
		}
		
		if(utilisateur.getMdp()!=null)
		{
			u.setMdp(utilisateur.getMdp());
		}
		
		if(utilisateur.getNom()!=null)
		{
			u.setNom(utilisateur.getNom());
		}
		
		if(utilisateur.getPrenom()!=null)
		{
			u.setPrenom(utilisateur.getPrenom());
		}
		if(utilisateur.getAddresse()!=null)
		{
			u.setAddresse(utilisateur.getAddresse());
		}
		
		return u;
	}

	
	public Set<UtilisateurDTO> toUtilisateursDTO(Set<Utilisateur> utilisateurs, boolean isParent,
			String classParentName) {
		
		
		Set<UtilisateurDTO> o = new HashSet<>();
		for(Utilisateur u : utilisateurs)
		{
			o.add(toUtilisateurDTO(u, isParent, classParentName));
		}
		return o;
	}

	
	public Set<Utilisateur> toUtilisateursEntities(Set<UtilisateurDTO> utilisateurs, boolean isParent,
			String classParentName) {
	
		
		Set<Utilisateur> ou= new HashSet<>();
		for(UtilisateurDTO e: utilisateurs)
		{
			ou.add(toUtilisateurEntity(e, isParent, classParentName));
		}
		return ou;
	}

}
