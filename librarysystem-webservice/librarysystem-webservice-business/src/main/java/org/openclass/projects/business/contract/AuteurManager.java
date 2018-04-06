package org.openclass.projects.business.contract;

import java.util.Hashtable;
import java.util.List;

import src.main.java.org.openclass.projects.dto.AuteurDTO;

public interface AuteurManager {
	
	void create(AuteurDTO auteur);
    
    void delete(AuteurDTO auteur);
    
    AuteurDTO getById(int idauteur);
    
    List<AuteurDTO> list();
    
    void update(AuteurDTO auteur);
    
    List<AuteurDTO> search(Hashtable criterias);

}
