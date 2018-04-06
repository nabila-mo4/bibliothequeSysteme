package src.main.java.org.openclass.projects.conversion.contract;

import java.util.Set;

import src.main.java.org.openclass.projects.dto.UtilisateurDTO;
import src.main.java.org.openclass.projects.entities.Utilisateur;

public interface UtilisateurConversion {
	
	Utilisateur toUtilisateurEntity(UtilisateurDTO Utilisateur, boolean isParent, String classParentName);
	UtilisateurDTO toUtilisateurDTO(Utilisateur Utilisateur, boolean isParent, String classParentName);
	Set<UtilisateurDTO> toUtilisateursDTO(Set<Utilisateur> Utilisateurs, boolean isParent, String classParentName);
	Set<Utilisateur> toUtilisateursEntities(Set<UtilisateurDTO> Utilisateurs, boolean isParent, String classParentName);

}
