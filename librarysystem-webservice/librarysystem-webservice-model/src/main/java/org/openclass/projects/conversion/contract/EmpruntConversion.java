package src.main.java.org.openclass.projects.conversion.contract;

import java.util.Set;

import src.main.java.org.openclass.projects.dto.EmpruntDTO;
import src.main.java.org.openclass.projects.entities.Emprunt;

public interface EmpruntConversion {
	
	EmpruntDTO toEmpruntDTO(Emprunt emprunt, boolean isParent, String classParentName);
	Set<EmpruntDTO> toEmpruntsDTO(Set<Emprunt> emprunts, boolean isParent, String classParentName);
	Emprunt toEmpruntEntity(EmpruntDTO emprunt, boolean isParent, String classParentName);
	Set<Emprunt> toEmpruntsEntities(Set<EmpruntDTO> emprunts, boolean isParent, String classParentName);

}
