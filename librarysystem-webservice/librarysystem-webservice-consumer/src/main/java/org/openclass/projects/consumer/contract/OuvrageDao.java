package org.openclass.projects.consumer.contract;


import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import src.main.java.org.openclass.projects.entities.Ouvrage;

@Repository
public interface OuvrageDao {
    
    void delete(Ouvrage ouvrage);
    
    Ouvrage getById(int idouvrage);
    
    void update(Ouvrage ouvrage);
    
    Set <Ouvrage> findAllBySearchCriteria(String sqlStatement);
	
	
	void create(Ouvrage ouvrage);


	List<Ouvrage> listOuvrages();
	

}
