package src.main.java.org.openclass.projects.conversion.contract;


import java.util.Set;

import src.main.java.org.openclass.projects.dto.OuvrageDTO;
import src.main.java.org.openclass.projects.entities.Ouvrage;


public interface OuvrageConversion {

	Ouvrage toOuvrageEntity(OuvrageDTO Ouvrage, boolean isParent, String classParentName);
	OuvrageDTO toOuvrageDTO(Ouvrage Ouvrage, boolean isParent, String classParentName);
	Set<OuvrageDTO> toOuvragesDTO(Set<Ouvrage> Ouvrages, boolean isParent, String classParentName);
	Set<Ouvrage> toOuvragesEntities(Set<OuvrageDTO> Ouvrages, boolean isParent, String classParentName);
}
