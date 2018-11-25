package org.librarypro.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.librarypro.webservice.business.contract.manager.AuteurManager;
import org.librarypro.webservice.model.dto.AuteurDTO;
import org.librarypro.webservice.model.entities.Auteur;
import org.springframework.stereotype.Service;

@Service
public class  AuteurManagerImpl extends AbstractManagerImpl implements AuteurManager {
	
	public void create(AuteurDTO auteur) {
		Auteur auteurEntity= getConvfac().getAuteurConversion().toAuteurEntity(auteur, true, Auteur.class.getSimpleName());
		getDaoFc().getAuteurDao().create(auteurEntity);
		
	}

	
	public void delete(AuteurDTO auteur) {
		Auteur auteurEntity= getConvfac().getAuteurConversion().toAuteurEntity(auteur, true, Auteur.class.getSimpleName());
		getDaoFc().getAuteurDao().delete(auteurEntity);
		
	}


	public AuteurDTO getById(int idauteur) {
		Auteur auteur = getDaoFc().getAuteurDao().getById(idauteur);
		AuteurDTO auteurDTO = new AuteurDTO();
		auteurDTO = getConvfac().getAuteurConversion().toAuteurDTO(auteur, true, auteurDTO.getClass().getName());
	    return auteurDTO;
	}

	
	public List<AuteurDTO> list() {
		List<Auteur> auteurs = getDaoFc().getAuteurDao().listAuteurs();
		List<AuteurDTO> auteursDTO = new ArrayList<>();
		for(Auteur auteur : auteurs)
		{
			
			AuteurDTO auteurDTO = new AuteurDTO();
			auteurDTO = getConvfac().getAuteurConversion().toAuteurDTO(auteur, true, auteurDTO.getClass().getName());
			auteursDTO.add(auteurDTO);
		}
		
		return auteursDTO;
	}


	public void update(AuteurDTO auteur) {
		Auteur auteurEntity= getConvfac().getAuteurConversion().toAuteurEntity(auteur, true, Auteur.class.getSimpleName());
		getDaoFc().getAuteurDao().create(auteurEntity);
		
	}

	
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
			
			Set<Auteur> auteursEntities =getDaoFc().getAuteurDao().findAllBySearchCriteria(sqlStatement);
			
			
				
			if (auteursEntities.isEmpty()) {System.out.println("pas d'auteurs");}
			
			List<AuteurDTO> auteurs = new ArrayList<>();
			if(auteurs!=null && auteursEntities.size()!=0)
			{
				auteurs.addAll(getConvfac().getAuteurConversion().toAuteursDTO(auteursEntities,true, "org.librarypro.webservice.model.dto.AuteurDTO"));
			}
			return auteurs; 
	}

}
