package src.main.java.org.openclass.projects.conversion.contract;

import java.util.Set;

public interface EmpruntConversion {
	
	EmpruntDTO toEmpruntDTO(Emprunt emprunt, boolean isParent, String classParentName);
	Set<EmpruntDTO> toEmpruntsDTO(Set<Emprunt> emprunts, boolean isParent, String classParentName);
	Emprunt toEmpruntEntity(EmpruntDTO emprunt, boolean isParent, String classParentName);
	Set<Emprunt> toEmpruntsEntities(Set<EmpruntDTO> emprunts, boolean isParent, String classParentName);

}
