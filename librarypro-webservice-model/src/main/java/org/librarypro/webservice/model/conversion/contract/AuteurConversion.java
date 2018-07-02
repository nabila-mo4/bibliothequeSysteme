package org.librarypro.webservice.model.conversion.contract;

import java.util.Set;

import org.librarypro.webservice.model.dto.AuteurDTO;
import org.librarypro.webservice.model.entities.Auteur;

public interface AuteurConversion {
	
	Auteur toAuteurEntity(AuteurDTO Auteur, boolean isParent, String classParentName);
	AuteurDTO toAuteurDTO(Auteur Auteur, boolean isParent, String classParentName);
	Set<AuteurDTO> toAuteursDTO(Set<Auteur> Auteurs, boolean isParent, String classParentName);
	Set<Auteur> toAuteursEntities(Set<AuteurDTO> Auteurs, boolean isParent, String classParentName);


}
