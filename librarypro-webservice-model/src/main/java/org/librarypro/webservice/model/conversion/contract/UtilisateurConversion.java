package org.librarypro.webservice.model.conversion.contract;

import java.util.Set;

import org.librarypro.webservice.model.dto.UtilisateurDTO;
import org.librarypro.webservice.model.entities.Utilisateur;

public interface UtilisateurConversion {
	
	Utilisateur toUtilisateurEntity(UtilisateurDTO Utilisateur, boolean isParent, String classParentName);
	UtilisateurDTO toUtilisateurDTO(Utilisateur Utilisateur, boolean isParent, String classParentName);
	Set<UtilisateurDTO> toUtilisateursDTO(Set<Utilisateur> Utilisateurs, boolean isParent, String classParentName);
	Set<Utilisateur> toUtilisateursEntities(Set<UtilisateurDTO> Utilisateurs, boolean isParent, String classParentName);

}
