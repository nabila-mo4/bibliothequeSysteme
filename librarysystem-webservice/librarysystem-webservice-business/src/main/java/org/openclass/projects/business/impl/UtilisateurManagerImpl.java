package org.openclass.projects.business.impl;

import org.openclass.projects.business.contract.UtilisateurManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.main.java.org.openclass.projects.conversion.contract.ConversionFactory;
import src.main.java.org.openclass.projects.dto.UtilisateurDTO;
import src.main.java.org.openclass.projects.entities.Utilisateur;

@Service
public class UtilisateurManagerImpl implements UtilisateurManager {
	
	private ConversionFactory conversionFactory;
	
	
	public ConversionFactory getConversionFactory() {
		return conversionFactory;
	}



	public void setConversionFactory(ConversionFactory conversionFactory) {
		this.conversionFactory = conversionFactory;
	}
	
	@Autowired
	UtilisateurDao utilisateurDao;

	@Override
	public boolean existant(String email) {
		
		return utilisateurDao.existant(email);
	}

	@Override
	public boolean validercompte(Utilisateur utilisateur, String mdp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UtilisateurDTO login(String email, String mdp) {
		if(existant(email))
		{
			Utilisateur utilisateur = utilisateurDao.getByEmail(email);
			
			if(utilisateur !=null)
			{
				if(validercompte(user,password))
				{
					Utilisateur utilisateur = utilisateurDao.getById(utilisateur.getIdutilisateur());
					UtilisateurDTO utilisateurDTO = new UtilisateurDTO();
					utilisateurDTO = getConversionFactory().getUtilisateurConversion().toUtilisateurDTO(utilisateur, true, utilisateurDTO.getClass().getName());
					
					return utilisateurDTO;
				}else {
					return null;
				}
			}else {
				return null;
			}
		}else {
			return null;
		}
	}

	@Override
	public UtilisateurDTO getById(int idutilisateur) {
		Utilisateur utilisateur = utilisateurDao.getById(idutilisateur);
		UtilisateurDTO utilisateurDTO = getConversionFactory().getUtilisateurConversion().toUtilisateurDTO(utilisateur, true, Utilisateur.class.getSimpleName());
		return utilisateurDTO;
	}

	@Override
	public void add(UtilisateurDTO utilisateur) {
		Utilisateur utilisateurEnt = getConversionFactory().getUtilisateurConversion().toUtilisateurEntity(utilisateur, true, Utilisateur.class.getSimpleName());
		utilisateurDao.add(utilisateurEnt);
		
	}

	@Override
	public void update(UtilisateurDTO utilisateur) {
		Utilisateur utilisateurEnt = getConversionFactory().getUtilisateurConversion().toUtilisateurEntity(utilisateur, true, Utilisateur.class.getSimpleName());
		utilisateurDao.add(utilisateurEnt);
		
	}

	@Override
	public void delete(UtilisateurDTO utilisateur) {
		Utilisateur utilisateurEnt = getConversionFactory().getUtilisateurConversion().toUtilisateurEntity(utilisateur, true, Utilisateur.class.getSimpleName());
		utilisateurDao.delete(utilisateurEnt);
		
	}

}
