package org.librarypro.webservice.business.contract.manager;

import java.util.Hashtable;
import java.util.List;

import org.librarypro.webservice.model.dto.OuvrageDTO;

public interface OuvrageManager {
	
	 OuvrageDTO getById(int id);
	
    void create(OuvrageDTO ouvrage);
    
    void delete(OuvrageDTO ouvrage);
    
    List<OuvrageDTO> list();
    
    void update(OuvrageDTO ouvrage);
    
    List<OuvrageDTO> searchTitre(String critere);
    
    List<OuvrageDTO> searchAuteur(String critere);

}
