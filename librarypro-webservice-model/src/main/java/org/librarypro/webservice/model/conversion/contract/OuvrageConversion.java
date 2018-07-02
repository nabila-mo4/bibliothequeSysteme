package org.librarypro.webservice.model.conversion.contract;

import java.util.List;
import java.util.Set;

import org.librarypro.webservice.model.dto.OuvrageDTO;
import org.librarypro.webservice.model.entities.Ouvrage;



public interface OuvrageConversion {
	
	Ouvrage toOuvrageEntity(OuvrageDTO Ouvrage, boolean isParent, String classParentName);
	OuvrageDTO toOuvrageDTO(Ouvrage Ouvrage, boolean isParent, String classParentName);
	Set<OuvrageDTO> toOuvragesDTO(Set<Ouvrage> ouvragesEntities, boolean isParent, String classParentName);
	Set<Ouvrage> toOuvragesEntities(Set<OuvrageDTO> ouvrages, boolean isParent, String classParentName);

}
