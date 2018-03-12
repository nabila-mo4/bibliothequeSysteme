package org.openclass.projects.consumer.contract;


import java.util.List;

import org.springframework.stereotype.Repository;

import src.main.java.org.openclass.projects.entities.Ouvrage;

@Repository
public interface OuvrageDao {
    
    void delete(int idouvrage);
    
    Ouvrage getById(int idouvrage);
    
    void update(Ouvrage ouvrage);
    
    List<Ouvrage> findAllBySearchCriteria(String sqlStatement);
	
	
	void create(Ouvrage ouvrage);


	List<Ouvrage> listOuvrages();
	

}
