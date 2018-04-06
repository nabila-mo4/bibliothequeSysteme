package org.openclass.projects.business.impl;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.openclass.projects.business.contract.AuteurManager;
import org.openclass.projects.consumer.contract.AuteurDao;
import org.openclass.projects.consumer.contract.AuteurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.main.java.org.openclass.projects.conversion.contract.ConversionFactory;
import src.main.java.org.openclass.projects.dto.AuteurDTO;
import src.main.java.org.openclass.projects.dto.AuteurDTO;
import src.main.java.org.openclass.projects.dto.AuteurDTO;
import src.main.java.org.openclass.projects.entities.Auteur;
import src.main.java.org.openclass.projects.entities.Auteur;
import src.main.java.org.openclass.projects.entities.Auteur;
import src.main.java.org.openclass.projects.entities.Auteur;

@Service
public class AuteurManagerImpl implements AuteurManager {
	
	private ConversionFactory conversionFactory;
	
	
	public ConversionFactory getConversionFactory() {
		return conversionFactory;
	}



	public void setConversionFactory(ConversionFactory conversionFactory) {
		this.conversionFactory = conversionFactory;
	}


	@Autowired
	AuteurDao auteurDao;

	@Override
	public void create(AuteurDTO auteur) {
		Auteur auteurEntity= getConversionFactory().getAuteurConversion().toAuteurEntity(auteur, true, Auteur.class.getSimpleName());
		auteurDao.create(auteurEntity);
		
	}

	@Override
	public void delete(AuteurDTO auteur) {
		Auteur auteurEntity= getConversionFactory().getAuteurConversion().toAuteurEntity(auteur, true, Auteur.class.getSimpleName());
		auteurDao.delete(auteurEntity);
		
	}

	@Override
	public AuteurDTO getById(int idauteur) {
		Auteur auteur = auteurDao.getById(idauteur);
		AuteurDTO auteurDTO = new AuteurDTO();
		auteurDTO = getConversionFactory().getAuteurConversion().toAuteurDTO(auteur, true, auteurDTO.getClass().getName());
	    return auteurDTO;
	}

	@Override
	public List<AuteurDTO> list() {
		List<Auteur> auteurs = auteurDao.listAuteurs();
		List<AuteurDTO> auteursDTO = new ArrayList<>();
		for(Auteur auteur : auteurs)
		{
			
			AuteurDTO auteurDTO = new AuteurDTO();
			auteurDTO = getConversionFactory().getAuteurConversion().toAuteurDTO(auteur, true, auteurDTO.getClass().getName());
			auteursDTO.add(auteurDTO);
		}
		
		return auteursDTO;
	}

	@Override
	public void update(AuteurDTO auteur) {
		Auteur auteurEntity= getConversionFactory().getAuteurConversion().toAuteurEntity(auteur, true, Auteur.class.getSimpleName());
		auteurDao.create(auteurEntity);
		
	}

	@Override
	public List<AuteurDTO> search(Hashtable criterias) {
		
		  	String sqlStatement = "SELECT * FROM auteur WHERE";
			List<String> sqlCriterias= new ArrayList<String>();
	   
	        
	        Enumeration enumCriteria = criterias.keys();
			while (enumCriteria.hasMoreElements())
			{
	            String key = (String) enumCriteria.nextElement();
	            
	            if(criterias.containsKey("auteur-nom") && key.equals("auteur-nom") && !criterias.get(key).equals(""))
	            {
	                String auteurNom = (String) criterias.get(key);
	                String auteurNomCap = auteurNom.substring(0, 1).toUpperCase() + auteurNom.toLowerCase().substring(1);
	                sqlCriterias.add(" (nom LIKE '%"+auteurNom+"%' OR nom LIKE '%"+auteurNom.toLowerCase()+"%' OR nom LIKE '%"+auteurNom.toUpperCase()+"%' OR nom LIKE '%"+auteurNomCap+"%' )") ;
	            }
					
				if(criterias.containsKey("auteur-prenom") && key.equals("auteur-prenom") && !criterias.get(key).equals(""))
	            {
	                String auteurPrenom = (String) criterias.get(key);
	                String auteurPrenomCap = auteurPrenom.substring(0, 1).toUpperCase() + auteurPrenom.toLowerCase().substring(1);
	                sqlCriterias.add(" (prenom LIKE '%"+auteurPrenom+"%' OR prenom LIKE '%"+auteurPrenom.toLowerCase()+"%' OR prenom LIKE '%"+auteurPrenom.toUpperCase()+"%' OR prenom LIKE '%"+auteurPrenomCap+"%')") ;
	            }
				
				if(criterias.containsKey("auteur-nationalite") && key.equals("auteur-nationalite") && !criterias.get(key).equals(""))
	            {
	                String auteurNationalite = (String) criterias.get(key);
	                String auteurNationaliteCap = auteurNationalite.substring(0, 1).toUpperCase() + auteurNationalite.toLowerCase().substring(1);
	                sqlCriterias.add(" (nationalite LIKE '%"+auteurNationalite+"%' OR nationalite LIKE '%"+auteurNationalite.toLowerCase()+"%' OR nationalite LIKE '%"+auteurNationalite.toUpperCase()+"%' OR nationalite LIKE '%"+auteurNationaliteCap+"%')") ;
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
			
			Set<Auteur> auteursEntities =auteurDao.findAllBySearchCriteria(sqlStatement);
			
			
				
			if (auteursEntities.isEmpty()) {System.out.println("pas d'auteurs");}
			
			List<AuteurDTO> auteurs = new ArrayList<>();
			if(auteurs!=null && auteursEntities.size()!=0)
			{
				auteurs.addAll(getConversionFactory().getAuteurConversion().toAuteursDTO(auteursEntities,true, "org.openclass.projects.dto.AuteurDTO"));
			}
			return auteurs;
	}

}
