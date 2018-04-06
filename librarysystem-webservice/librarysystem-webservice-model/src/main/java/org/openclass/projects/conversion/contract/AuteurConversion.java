package src.main.java.org.openclass.projects.conversion.contract;

import java.util.Set;

import src.main.java.org.openclass.projects.dto.AuteurDTO;
import src.main.java.org.openclass.projects.entities.Auteur;

public interface AuteurConversion {
	
	
	Auteur toAuteurEntity(AuteurDTO auteur, boolean isParent, String classParentName);
	AuteurDTO toAuteurDTO(Auteur auteur, boolean isParent, String classParentName);
	Set<AuteurDTO> toAuteursDTO(Set<Auteur> auteurs, boolean isParent, String classParentName);
	Set<Auteur> toAuteursEntities(Set<AuteurDTO> auteurs, boolean isParent, String classParentName);

}
