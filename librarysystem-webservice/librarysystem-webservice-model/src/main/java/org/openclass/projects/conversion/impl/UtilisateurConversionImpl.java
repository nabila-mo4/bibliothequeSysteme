package src.main.java.org.openclass.projects.conversion.impl;

import java.util.HashSet;
import java.util.Set;

import src.main.java.org.openclass.projects.conversion.contract.EmpruntConversion;
import src.main.java.org.openclass.projects.conversion.contract.UtilisateurConversion;
import src.main.java.org.openclass.projects.dto.EmpruntDTO;
import src.main.java.org.openclass.projects.dto.UtilisateurDTO;
import src.main.java.org.openclass.projects.entities.Utilisateur;

public class UtilisateurConversionImpl implements UtilisateurConversion{

	@Override
	public Utilisateur toUtilisateurEntity(UtilisateurDTO utilisateur, boolean isParent, String classParentName) {
		
		Utilisateur utilisateurEnt = new Utilisateur();
		utilisateurEnt.setIdutilisateur(utilisateur.getIdutilisateur());
		utilisateurEnt.setEmail(utilisateur.getEmail());
		utilisateurEnt.setNom(utilisateur.getNom());
		utilisateurEnt.setPrenom(utilisateur.getPrenom());
		utilisateurEnt.setMdp(utilisateur.getMdp());
		
		utilisateurEnt.setAddresse(utilisateur.getAddresse());
		
		
		if(utilisateur.getEmprunts()!=null)
		{
			for(EmpruntDTO emprunt : utilisateur.getEmprunts()){
				Emprunt empruntEnt = getEm().find(Borrow.class, borrow.getId());
				utilisateurEnt.getEmprunts().add(empruntEnt);
			}
		}
		
		return utilisateurEnt;
	}

	@Override
	public UtilisateurDTO toUtilisateurDTO(Utilisateur utilisateur, boolean isParent, String classParentName) {
		UtilisateurDTO utilisateurdto = new UtilisateurDTO();
		utilisateurdto.setIdutilisateur(utilisateur.getIdutilisateur());
		utilisateurdto.setEmail(utilisateur.getEmail());
		utilisateurdto.setNom(utilisateur.getNom());
		utilisateurdto.setPrenom(utilisateur.getPrenom());
		utilisateurdto.setMdp(utilisateur.getMdp());
		
		utilisateurdto.setAddresse(utilisateur.getAddresse());
		
		if(utilisateur.getEmprunts()!=null )
		{
			EmpruntConversion empruntConversion = new EmpruntConversionImpl();
			utilisateurdto.setEmprunts(empruntConversion.toEmpruntsDTO(utilisateur.getEmprunts(), false, utilisateurdto.getClass().getName()));
		}
		
		return utilisateurdto;
	}

	@Override
	public Set<UtilisateurDTO> toUtilisateursDTO(Set<Utilisateur> utilisateurs, boolean isParent,
			String classParentName) {
		Set<UtilisateurDTO> utilisateursdto = new HashSet<>();
		for(Utilisateur utilisateur : utilisateurs)
		{
			utilisateursdto.add(toUtilisateurDTO(utilisateur, isParent, classParentName));
		}
		return utilisateursdto;
	}

	@Override
	public Set<Utilisateur> toUtilisateursEntities(Set<UtilisateurDTO> utilisateurs, boolean isParent,
			String classParentName) {
		Set<Utilisateur> utilisateursEnt = new HashSet<>();
		for(UtilisateurDTO utilisateur : utilisateurs)
		{
			utilisateursEnt.add(toUtilisateurEntity(utilisateur, isParent, classParentName));
		}
		return utilisateursEnt;
	}

}
