package org.librarypro.webservice.consumer.contract.dao;

import java.util.List;

import org.librarypro.webservice.model.entities.Ouvrage;

public interface OuvrageDao {
	
	Ouvrage getById(int idouvrage);
	
    void create( Ouvrage ouvrage);
    
    void delete(Ouvrage ouvrage);
    
    List<Ouvrage> list();
    
    void update(Ouvrage ouvrage);
    
    List<Ouvrage> getOuvrageByTitre(String critere);
    
    List<Ouvrage> getOuvrageByAuteur(String critere);

}
