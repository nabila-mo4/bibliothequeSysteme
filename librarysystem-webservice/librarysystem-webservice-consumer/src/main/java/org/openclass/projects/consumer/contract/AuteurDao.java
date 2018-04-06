package org.openclass.projects.consumer.contract;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import src.main.java.org.openclass.projects.entities.Auteur;
import src.main.java.org.openclass.projects.entities.Emprunt;

@Repository
public interface AuteurDao {
    
    void delete(Auteur auteur);
    
    Auteur getById(int idauteur);
    
    void update(Auteur auteur);
    
    Set <Auteur> findAllBySearchCriteria(String sqlStatement);
	
	
	void create(Auteur auteur);


	List<Auteur> listAuteurs();
	
	
	

}