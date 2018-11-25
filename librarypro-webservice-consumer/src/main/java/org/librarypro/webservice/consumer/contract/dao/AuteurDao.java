package org.librarypro.webservice.consumer.contract.dao;

import java.util.List;
import java.util.Set;

import org.librarypro.webservice.model.entities.Auteur;
import org.springframework.stereotype.Repository;


public interface AuteurDao {
	
    void delete(Auteur auteur);
    
     Auteur getById(int idauteur);
    
    void update(Auteur auteur);
    
    Set <Auteur> findAllBySearchCriteria(String sqlStatement);
	
	
	void create(Auteur auteur);


	List<Auteur> listAuteurs();

}
