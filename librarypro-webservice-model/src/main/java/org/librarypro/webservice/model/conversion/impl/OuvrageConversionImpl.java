package org.librarypro.webservice.model.conversion.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.librarypro.webservice.model.conversion.contract.AuteurConversion;
import org.librarypro.webservice.model.conversion.contract.OuvrageConversion;
import org.librarypro.webservice.model.dto.OuvrageDTO;
import org.librarypro.webservice.model.entities.Ouvrage;

public class OuvrageConversionImpl implements OuvrageConversion{
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
		
		if(ouvrage.getNom()!=null)
		{
			ouvrage1.setNom(ouvrage.getNom());
		}
		
		if(ouvrage.isEtat())
		{
			ouvrage1.setEtat(ouvrage.isEtat());
		}

		
		return ouvrage1;
}

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
		
		if(ouvrage.getAuteur()!=null )
		{
			AuteurConversion auteurConversion = new AuteurConversionImpl();
			ouvrage2.setAuteur(auteurConversion.toAuteurDTO(ouvrage.getAuteur(), false, Ouvrage.class.getSimpleName()));
					
		}
		
		if(ouvrage.getNom()!=null)
		{
			ouvrage2.setNom(ouvrage.getNom());
		}
		
		if(ouvrage.isEtat())
		{
			ouvrage2.setEtat(ouvrage.isEtat());
		}
		
		
		return ouvrage2;
		
		
		}

		public Set<OuvrageDTO> toOuvragesDTO(Set<Ouvrage> ouvrages, boolean isParent, String classParentName) {
			Set<OuvrageDTO> o = new HashSet<>();
			for(Ouvrage ouvrage : ouvrages)
			{
				o.add(toOuvrageDTO(ouvrage, isParent, classParentName));
			}
			return o;
		}

		public Set<Ouvrage> toOuvragesEntities(Set<OuvrageDTO> ouvrages, boolean isParent, String classParentName) {
			Set<Ouvrage> ou= new HashSet<>();
			for(OuvrageDTO ouvrage : ouvrages)
			{
				ou.add(toOuvrageEntity(ouvrage, isParent, classParentName));
			}
			return ou;
		}

		

}
