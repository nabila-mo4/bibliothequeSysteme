package org.librarypro.webservice.business.contract.manager;

import java.util.Hashtable;
import java.util.List;

import org.librarypro.webservice.model.dto.AuteurDTO;

public interface AuteurManager {
	
    void  create(AuteurDTO auteur);
    
    void delete(AuteurDTO auteur);
    
    AuteurDTO getById(int idauteur);
    
    List<AuteurDTO> list();
    
    void update(AuteurDTO auteur);
    
    List<AuteurDTO> search(Hashtable criterias);

}
