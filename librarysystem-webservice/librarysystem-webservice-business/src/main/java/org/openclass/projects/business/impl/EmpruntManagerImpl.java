package org.openclass.projects.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.openclass.projects.business.contract.EmpruntManager;
import org.openclass.projects.consumer.contract.EmpruntDao;
import org.openclass.projects.consumer.contract.OuvrageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.main.java.org.openclass.projects.conversion.contract.ConversionFactory;
import src.main.java.org.openclass.projects.dto.EmpruntDTO;
import src.main.java.org.openclass.projects.entities.Emprunt;


@Service
public class EmpruntManagerImpl implements EmpruntManager{
	
    private ConversionFactory conversionFactory;
	
	
	public ConversionFactory getConversionFactory() {
		return conversionFactory;
	}

	public void setConversionFactory(ConversionFactory conversionFactory) {
		this.conversionFactory = conversionFactory;
	}

	
	@Autowired
	EmpruntDao empruntDao;
	
	@Override
	public boolean prolonger(EmpruntDTO emprunt) {
		
			if(emprunt.getProlonge())
			{
				return false;
			}
			
			else 
			{
				Emprunt empruntEnt = getConversionFactory().getEmpruntConversion().toEmpruntEntity(emprunt, true, Emprunt.class.getSimpleName());
				
				empruntDao.prolonger(empruntEnt);
				
				return true;
			}
			
		}
		
	}

	@Override
	public List<EmpruntDTO> empruntsEnRetard() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public EmpruntDTO getById(int idemprunt)
	{
		Emprunt emprunt = empruntDao.getById(idemprunt);
		EmpruntDTO empruntDTO = getConversionFactory().getEmpruntConversion().toEmpruntDTO(emprunt, true, Emprunt.class.getSimpleName());
		return empruntDTO;
	}
	
	@Override
	public List<EmpruntDTO> list()
	{
		List<Emprunt> emprunts = empruntDao.list();
		List<EmpruntDTO> empruntsDTO = new ArrayList<>();
		for(Emprunt emprunt : emprunts)
		{
			
			empruntsDTO.add(getConversionFactory().getEmpruntConversion().toEmpruntDTO(emprunt, true, Emprunt.class.getSimpleName()));
		}
		return empruntsDTO;
	}
	
	@Override
	
	public void add(EmpruntDTO emprunt) {
		Emprunt empruntEnt = getConversionFactory().getEmpruntConversion().toEmpruntEntity(emprunt, true, EmpruntDTO.class.getSimpleName());
		empruntDao.add(empruntEnt);
	}
	
	@Override
	
	public void update(EmpruntDTO emprunt) {
		Emprunt empruntEnt = getConversionFactory().getEmpruntConversion().toEmpruntEntity(emprunt, true, EmpruntDTO.class.getSimpleName());
		empruntDao.update(empruntEnt);
	}
	
	@Override
	
	public void delete(EmpruntDTO emprunt) {
		Emprunt empruntEnt = getConversionFactory().getEmpruntConversion().toEmpruntEntity(emprunt, true, EmpruntDTO.class.getSimpleName());
		empruntDao.delete(empruntEnt);
	}
	
	@Override
	public List<EmpruntDTO> empruntsByUtilisateur(UtilisateurDTO utilisateur)
	{
		if(utilisateur != null && utilisateur.getIdutilisateur()!=0)
		{
			
			if(utilisateur != null)
			{
				Utilisateur utilisateurEnt = getConversionFactory().getUtilisateurConversion().toUtilisateurEntity(utilisateur, true, Utilisateur.class.getSimpleName());
				List<Emprunt> emprunts = empruntDao.empruntsByUtilisateur(utilisateurEnt);
				List<EmpruntDTO> empruntsDTO = new ArrayList<>();
				for(Emprunt emprunt : emprunts)
				{
					
					empruntsDTO.add(getConversionFactory().getEmpruntConversion().toEmpruntDTO(emprunt, true, Emprunt.class.getSimpleName()));
				}
				return empruntsDTO;
			}else
			{
				return null;
			}
		}else {
			return null;
		}
	}
	

}
