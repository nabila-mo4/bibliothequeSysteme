package org.librarypro.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.librarypro.webservice.business.contract.manager.OuvrageManager;
import org.librarypro.webservice.model.dto.OuvrageDTO;
import org.librarypro.webservice.model.entities.Ouvrage;
import org.springframework.stereotype.Service;

@Service
public class OuvrageManagerImpl  extends AbstractManagerImpl implements OuvrageManager{
	
	
 
	public OuvrageDTO getById(int idouvrage) {
		
		Ouvrage ouvrage = getDaoFc().getOuvrageDao().getById(idouvrage);
		OuvrageDTO ouvrageDTO = new OuvrageDTO();
		ouvrageDTO = getConvfac().getOuvrageConversion().toOuvrageDTO(ouvrage, true, ouvrageDTO.getClass().getName());
		
		return ouvrageDTO;
		
	}

	
	public void create(OuvrageDTO ouvrage) {
		
		Ouvrage ouvrageEntity= getConvfac().getOuvrageConversion().toOuvrageEntity(ouvrage, true, Ouvrage.class.getSimpleName());
		
		getDaoFc().getOuvrageDao().create(ouvrageEntity);
		
	}

	
	public void delete(OuvrageDTO ouvrage) {
		
		Ouvrage ouvrageEntity= getConvfac().getOuvrageConversion().toOuvrageEntity(ouvrage, true, Ouvrage.class.getSimpleName());
		
		getDaoFc().getOuvrageDao().delete(ouvrageEntity);
	}

	
	public List<OuvrageDTO> list() {
		List<Ouvrage> ouvrages = getDaoFc().getOuvrageDao().list();
		List<OuvrageDTO> ouvragesDTO = new ArrayList<>();
		for(Ouvrage ouvrage : ouvrages)
		{
			
			OuvrageDTO ouvrageDTO = new OuvrageDTO();
			ouvrageDTO = getConvfac().getOuvrageConversion().toOuvrageDTO(ouvrage, true, ouvrageDTO.getClass().getName());
			ouvragesDTO.add(ouvrageDTO);
		}
		
		return ouvragesDTO;
	}


	public void update(OuvrageDTO ouvrage) {
		
		Ouvrage ouvrageEntity= getConvfac().getOuvrageConversion().toOuvrageEntity(ouvrage, true, Ouvrage.class.getSimpleName());
		
		
		getDaoFc().getOuvrageDao().update(ouvrageEntity);
		
	}

    
	public List<OuvrageDTO> searchTitre(String critere){
		
		List<Ouvrage> ouvrages = getDaoFc().getOuvrageDao().getOuvrageByTitre(critere);
		List<OuvrageDTO> ouvragesDTO = new ArrayList<>();
		for(Ouvrage ouvrage : ouvrages)
		{
			
			OuvrageDTO ouvrageDTO = new OuvrageDTO();
			ouvrageDTO = getConvfac().getOuvrageConversion().toOuvrageDTO(ouvrage, true, ouvrageDTO.getClass().getName());
			ouvragesDTO.add(ouvrageDTO);
		}
		
		return ouvragesDTO;
		
	  
	}
	
public List<OuvrageDTO> searchAuteur(String critere){
		
		List<Ouvrage> ouvrages = getDaoFc().getOuvrageDao().getOuvrageByAuteur(critere);
		List<OuvrageDTO> ouvragesDTO = new ArrayList<>();
		for(Ouvrage ouvrage : ouvrages)
		{
			
			OuvrageDTO ouvrageDTO = new OuvrageDTO();
			ouvrageDTO = getConvfac().getOuvrageConversion().toOuvrageDTO(ouvrage, true, ouvrageDTO.getClass().getName());
			ouvragesDTO.add(ouvrageDTO);
		}
		
		return ouvragesDTO;
		
	  
	}
	
	

	

	

}
