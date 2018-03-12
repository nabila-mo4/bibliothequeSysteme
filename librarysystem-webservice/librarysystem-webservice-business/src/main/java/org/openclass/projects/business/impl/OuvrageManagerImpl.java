package org.openclass.projects.business.impl;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import org.openclass.projects.business.contract.OuvrageManager;
import org.openclass.projects.consumer.contract.OuvrageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.main.java.org.openclass.projects.dto.OuvrageDTO;
import src.main.java.org.openclass.projects.entities.Ouvrage;

@Service 

public class OuvrageManagerImpl implements OuvrageManager {
	
	@Autowired
	OuvrageDao ouvrageDao;
	
	@Override
	public void create(OuvrageDTO ouvrage) {
		Ouvrage ouvrageEntity= getChangeFactory().getOuvrageChange().toOuvrageEntity(ouvrage, true, Ouvrage.class.getSimpleName());
		ouvrageDao.create(ouvrageEntity);
		
	}
	
	
	@Override
	public void delete(OuvrageDTO ouvrage) {
		
		Ouvrage ouvrageEntity= getChangeFactory().getOuvrageChange().toOuvrageEntity(ouvrage, true, Ouvrage.class.getSimpleName());
		ouvrageDao.delete(ouvrageEntity);
		
	}
	
	@Override
	public OuvrageDTO getById(int id) {
		
		Ouvrage ouvrage = ouvrageDao.getById(id);
		OuvrageDTO ouvrageDTO = new OuvrageDTO();
		ouvrageDTO = getChangeFactory().getOuvrageChange().toOuvrageDTO(ouvrage, true, OuvrageDTO.getClass().getName());
	    return ouvrageDTO;
	}

	@Override
	public List<OuvrageDTO> list() {
		List<Ouvrage> ouvrages = ouvrageDao.listOuvrages();
		List<OuvrageDTO> ouvragesDTO = new ArrayList<>();
		for(Ouvrage ouvrage : ouvrages)
		{
			
			OuvrageDTO ouvrageDTO = new OuvrageDTO();
			ouvrageDTO = getChangeFactory().getOuvrageChange().toOuvrageDTO(ouvrage, true, ouvrageDTO.getClass().getName());
			ouvragesDTO.add(ouvrageDTO);
		}
		
		return ouvragesDTO;
	}
    
	
	@Override
	public void update(OuvrageDTO ouvrage) {
		
		Ouvrage ouvrageEntity= getChangeFactory().getOuvrageChange().toOuvrageEntity(ouvrage, true, Ouvrage.class.getSimpleName());
		ouvrageDao.create(ouvrageEntity);
		
	}
	

	@Override
	public List<OuvrageDTO> search(Hashtable criterias) {
		
        String sqlStatement = "SELECT * FROM ouvrage WHERE";
		List<String> sqlCriterias= new ArrayList<String>();
        List<Ouvrage> ouvragesEntities = new ArrayList<Ouvrage>();
        
        Enumeration enumCriteria = criterias.keys();
		while (enumCriteria.hasMoreElements())
		{
            String key = (String) enumCriteria.nextElement();
            
            if(criterias.containsKey("ouvrage-titre") && key.equals("ouvrage-titre") && !criterias.get(key).equals(""))
            {
                String ouvrageTitre = (String) criterias.get(key);
                String ouvrageTitreCap = ouvrageTitre.substring(0, 1).toUpperCase() + ouvrageTitre.toLowerCase().substring(1);
                sqlCriterias.add(" (titre LIKE '%"+ouvrageTitre+"%' OR titre LIKE '%"+ouvrageTitre.toLowerCase()+"%' OR titre LIKE '%"+ouvrageTitre.toUpperCase()+"%' OR titre LIKE '%"+ouvrageTitreCap+"%' )") ;
            }
				
				
				
			if(criterias.containsKey("ouvrage-auteur") && key.equals("ouvrage-auteur") && !criterias.get(key).equals(""))
            {
                String ouvrageAuteur = (String) criterias.get(key);
                String ouvrageAuteurCap = ouvrageAuteur.substring(0, 1).toUpperCase() + ouvrageAuteur.toLowerCase().substring(1);
                sqlCriterias.add(" (auteur LIKE '%"+ouvrageAuteur+"%' OR auteur LIKE '%"+ouvrageAuteur.toLowerCase()+"%' OR auteur LIKE '%"+ouvrageAuteur.toUpperCase()+"%' OR auteur LIKE '%"+ouvrageAuteurCap+"%')") ;
            }
			
			if(criterias.containsKey("site-isbn") && key.equals("site-isbn") && !criterias.get(key).equals(""))
            {
                String siteIsbn = (String) criterias.get(key);
                String siteIsbnCap = siteIsbn.substring(0, 1).toUpperCase() + siteIsbn.toLowerCase().substring(1);
                sqlCriterias.add(" (isbn LIKE '%"+siteIsbn+"%' OR isbn LIKE '%"+siteIsbn.toLowerCase()+"%' OR i LIKE '%"+siteIsbn.toUpperCase()+"%' OR emplacement LIKE '%"+siteIsbnCap+"%')") ;
            }
			
			if(criterias.containsKey("ouvrage-editeur") && key.equals("ouvrage-editeur") && !criterias.get(key).equals(""))
            {
                String ouvrageEditeur = (String) criterias.get(key);
                String ouvrageEditeurCap = ouvrageEditeur.substring(0, 1).toUpperCase() + ouvrageEditeur.toLowerCase().substring(1);
                sqlCriterias.add(" (editeur LIKE '%"+ouvrageEditeur+"%' OR editeur LIKE '%"+ouvrageEditeur.toLowerCase()+"%' OR editeur LIKE '%"+ouvrageEditeur.toUpperCase()+"%' OR editeur LIKE '%"+ouvrageEditeurCap+"%')") ;
            }
			
			
		}
		
		for(String sqlCriteria : sqlCriterias)
        {
            System.out.println(sqlCriteria);
            sqlStatement = sqlStatement + sqlCriteria;
            if(!sqlCriteria.equals(sqlCriterias.get(sqlCriterias.size()-1)))
            {
                sqlStatement += " AND ";
            }
            System.out.println(sqlCriteria);
        }
		
		ouvragesEntities =ouvrageDao.findAllBySearchCriteria(sqlStatement);
		
		
			
		if (ouvragesEntities.isEmpty()) {System.out.println("pas de sites");}
		
		List<OuvrageDTO> ouvrages = new ArrayList<>();
		if(ouvrages!=null && ouvragesEntities.size()!=0)
		{
			ouvrages.addAll(getChangeFactory().getOuvrageChange().toOuvragesDTO(ouvragesEntities,true, "org.openclass.projects.dto.OuvrageDTO"));
		}
		return ouvrages;
	
		
	}

}
