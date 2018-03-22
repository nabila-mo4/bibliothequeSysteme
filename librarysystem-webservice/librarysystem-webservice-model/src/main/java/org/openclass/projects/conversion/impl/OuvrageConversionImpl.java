package src.main.java.org.openclass.projects.conversion.impl;

import java.util.HashSet;
import java.util.Set;

import src.main.java.org.openclass.projects.conversion.contract.OuvrageConversion;
import src.main.java.org.openclass.projects.dto.OuvrageDTO;
import src.main.java.org.openclass.projects.entities.Ouvrage;

public class OuvrageConversionImpl implements OuvrageConversion {

	@Override
	public Ouvrage toOuvrageEntity(OuvrageDTO ouvrage, boolean isParent, String classParentName) {
				Ouvrage ouvrage1 = new Ouvrage();
				
				
				
				if(ouvrage.getIdouvrage()!=0)
				{
					ouvrage1.setIdouvrage(ouvrage.getIdouvrage());
				}
				if(ouvrage.getDatepublication()!=null)
				{
					ouvrage1.setDatepublication(ouvrage.getDatepublication());
				}
				if(ouvrage.getDomaine()!=null)
				{
					ouvrage1.setDomaine(ouvrage.getDomaine());
				}
				if(ouvrage.getEditeur()!=null)
				{
					ouvrage1.setEditeur(ouvrage.getEditeur());
				}
				if(ouvrage.getIsbn()!=null)
				{
					ouvrage1.setIsbn(ouvrage.getIsbn());
				}
				if(ouvrage.getNbrestant()>=0)
				{
					ouvrage1.setNbrestant(ouvrage.getNbrestant());
				}
				if(ouvrage.getLangue()!=null)
				{
					ouvrage1.setLangue(ouvrage.getLangue());
				}
				if(ouvrage.getNbpages()!=0)
				{
					ouvrage1.setNbpages(ouvrage.getNbpages());
				}
				if(ouvrage.getNbtotal()>=0)
				{
					ouvrage1.setNbtotal(ouvrage.getNbtotal());
				}
				
				if(ouvrage.getTitre()!=null)
				{
					ouvrage1.setTitre(ouvrage.getTitre());
				}

				
				return ouvrage1;
	}

	@Override
	public OuvrageDTO toOuvrageDTO(Ouvrage ouvrage, boolean isParent, String classParentName) {
		OuvrageDTO ouvrage2 = new OuvrageDTO();
		
		
		if(ouvrage.getIdouvrage()!=0)
		{
			ouvrage2.setIdouvrage(ouvrage.getIdouvrage());
		}
		if(ouvrage.getDatepublication()!=null)
		{
			ouvrage2.setDatepublication(ouvrage.getDatepublication());
		}
		if(ouvrage.getDomaine()!=null)
		{
			ouvrage2.setDomaine(ouvrage.getDomaine());
		}
		if(ouvrage.getEditeur()!=null)
		{
			ouvrage2.setEditeur(ouvrage.getEditeur());
		}
		if(ouvrage.getIsbn()!=null)
		{
			ouvrage2.setIsbn(ouvrage.getIsbn());
		}
		if(ouvrage.getNbrestant()>=0)
		{
			ouvrage2.setNbrestant(ouvrage.getNbrestant());
		}
		if(ouvrage.getLangue()!=null)
		{
			ouvrage2.setLangue(ouvrage.getLangue());
		}
		if(ouvrage.getNbpages()!=0)
		{
			ouvrage2.setNbpages(ouvrage.getNbpages());
		}
		if(ouvrage.getNbtotal()>=0)
		{
			ouvrage2.setNbtotal(ouvrage.getNbtotal());
		}
		
		if(ouvrage.getTitre()!=null)
		{
			ouvrage2.setTitre(ouvrage.getTitre());
		}

		
		return ouvrage2;
		
		
	}

	@Override
	public Set<OuvrageDTO> toOuvragesDTO(Set<Ouvrage> ouvrages, boolean isParent, String classParentName) {
		Set<OuvrageDTO> ouvrages1 = new HashSet<>();
		for(Ouvrage ouvrage : ouvrages)
		{
			ouvrages1.add(toOuvrageDTO(ouvrage, isParent, classParentName));
		}
		return ouvrages1;
	}

	@Override
	public Set<Ouvrage> toOuvragesEntities(Set<OuvrageDTO> ouvrages, boolean isParent, String classParentName) {
		Set<Ouvrage> ouvrages2 = new HashSet<>();
		for(OuvrageDTO ouvrage : ouvrages)
		{
			ouvrages2.add(toOuvrageEntity(ouvrage, isParent, classParentName));
		}
		return ouvrages2;
	}





}
