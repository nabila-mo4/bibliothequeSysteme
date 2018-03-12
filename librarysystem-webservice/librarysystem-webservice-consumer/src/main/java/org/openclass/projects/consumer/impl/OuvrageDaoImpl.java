package org.openclass.projects.consumer.impl;

import java.util.List;

import org.myprojects.spring.escaladeproject.model.Site;
import org.openclass.projects.consumer.contract.OuvrageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import src.main.java.org.openclass.projects.entities.Ouvrage;

@Repository 
public class OuvrageDaoImpl implements OuvrageDao {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public void delete(int idouvrage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ouvrage getById(int idouvrage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ouvrage> findAllBySearchCriteria(String sqlStatement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Ouvrage ouvrage) {
		String sql="INSERT INTO ouvrage (titre,langue,domaine,editeur,auteur,datepublication,isbn,nbpages,nbtotal,nbrestant)"
				+ " VALUES (:titre,:langue,:domaine,:editeur,:auteur,:datepublication,:isbn,:nbpages,:nbtotal,:nbrestant)";

		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(ouvrage));
		
	}

	@Override
	public List<Ouvrage> listOuvrages() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public SqlParameterSource getSqlParameterByModel(Ouvrage ouvrage) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(ouvrage !=null) {
			paramSource.addValue("idouvrage", ouvrage.getIdouvrage());
			paramSource.addValue("titre", site.getNomsite());
			paramSource.addValue("emplacement", site.getEmplacement());
			paramSource.addValue("hauteur", site.getHauteur());
			paramSource.addValue("type", site.getType());
			
		
		}
		return paramSource;
	}
	

}
