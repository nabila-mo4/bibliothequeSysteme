package org.openclass.projects.business.contract;

import java.util.Hashtable;
import java.util.List;

import src.main.java.org.openclass.projects.dto.OuvrageDTO;

public interface OuvrageManager 
{
	
	void create(OuvrageDTO ouvrage);
    
    void delete(OuvrageDTO ouvrage);
    
    OuvrageDTO getById(int id);
    
    List<OuvrageDTO> list();
    
    void update(OuvrageDTO ouvrage);
    
    List<OuvrageDTO> search(Hashtable criterias);

}
