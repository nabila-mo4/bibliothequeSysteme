package org.openclass.projects.business.contract;

import java.util.Hashtable;
import java.util.List;

import src.main.java.org.openclass.projects.dto.OuvrageDTO;

public interface OuvrageManager 
{
	
	void create(OuvrageDTO Ouvrage);
    
    void delete(OuvrageDTO Ouvrage);
    
    OuvrageDTO getById(int id);
    
    List<OuvrageDTO> list();
    
    void update(OuvrageDTO Ouvrage);
    
    List<OuvrageDTO> search(Hashtable criterias);

}
