package org.librarypro.webservice.model.conversion.contract;

import java.util.Set;

import org.librarypro.webservice.model.dto.EmpruntDTO;
import org.librarypro.webservice.model.entities.Emprunt;

public interface EmpruntConversion {
	
	EmpruntDTO toEmpruntDTO(Emprunt emprunt, boolean isParent, String classParentName);
	Set<EmpruntDTO> toEmpruntsDTO(Set<Emprunt> emprunts, boolean isParent, String classParentName);
	Emprunt toEmpruntEntity(EmpruntDTO emprunt, boolean isParent, String classParentName);
	Set<Emprunt> toEmpruntsEntities(Set<EmpruntDTO> emprunts, boolean isParent, String classParentName);

}
