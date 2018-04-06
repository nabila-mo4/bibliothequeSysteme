package org.openclass.projects.consumer.impl;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import org.openclass.projects.consumer.contract.OuvrageDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import src.main.java.org.openclass.projects.entities.Auteur;
import src.main.java.org.openclass.projects.entities.Ouvrage;

@Repository 
public class OuvrageDaoImpl implements OuvrageDao {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	SqlParameterSource paramSource;
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	@Override
	public void delete(Ouvrage ouvrage)
	{
		
		String sql ="DELETE FROM ouvrage WHERE idouvrage=:idouvrage";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(ouvrage));
	}

	@Override 
	public Ouvrage getById(int idouvrage)  {
		String sql="SELECT ouvrage.*, auteur.nom FROM ouvrage LEFT JOIN auteur ON ouvrage.idauteur=auteur.idauteur WHERE idouvrage=:idouvrage";
		return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Ouvrage(idouvrage)), new OuvrageMapper());
	}

	@Override 
	public void update(Ouvrage ouvrage) {
		String sql="UPDATE ouvrage SET titre=:titre, langue=:langue, domaine=:domaine, editeur=:editeur, datepublication=:datepublication,"
				+ "isbn=:isbn, nbpages=:nbpages,nbtotal=:nbtotal, nbrestant=:nbrestant, idauteur=:idauteur WHERE idouvrage=:idouvrage";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(ouvrage));
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Set<Ouvrage> findAllBySearchCriteria(String sqlStatement) {
		Set<Ouvrage> list= (Set<Ouvrage>) namedParameterJdbcTemplate.query(sqlStatement, getSqlParameterByModel(null), new OuvrageMapper());
        return list;
	}

	@Override
	public void create(Ouvrage ouvrage) {
		String sql="INSERT INTO ouvrage (titre,langue,domaine,editeur,datepublication,isbn,nbpages,nbtotal,nbrestant,idauteur)"
				+ " VALUES (:titre,:langue,:domaine,:editeur,:datepublication,:isbn,:nbpages,:nbtotal,:nbrestant,:idauteur)";
        
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(ouvrage));
		
		
	}

	@Override
	public List<Ouvrage> listOuvrages() {
		String sql ="SELECT ouvrage.*, auteur.* FROM ouvrage LEFT JOIN auteur ON ouvrage.idauteur=auteur.idauteur ";
		
		List<Ouvrage> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new OuvrageMapper());
		return list;
	}
	
	
	public SqlParameterSource getSqlParameterByModel(Ouvrage ouvrage) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(ouvrage !=null) {
			paramSource.addValue("idouvrage", ouvrage.getIdouvrage());
			paramSource.addValue("titre", ouvrage.getTitre());
			paramSource.addValue("langue",ouvrage.getLangue());
			paramSource.addValue("domaine",ouvrage.getDomaine());
			paramSource.addValue("editeur",ouvrage.getEditeur());
			
			paramSource.addValue("datepublication",ouvrage.getDatepublication());
			paramSource.addValue("isbn", ouvrage.getIsbn());
			paramSource.addValue("nbpages", ouvrage.getNbpages());
			paramSource.addValue("nbtotal", ouvrage.getNbtotal());
			paramSource.addValue("nbrestant", ouvrage.getNbrestant());
			paramSource.addValue("idauteur", ouvrage.getAuteur().getIdauteur());
			
			
		
		}
		return paramSource;
	}
	
	public static final class OuvrageMapper implements RowMapper<Ouvrage>{
		public Ouvrage mapRow(ResultSet rs, int rowNum) throws SQLException{
			Ouvrage ouvrage = new Ouvrage();
			ouvrage.setIdouvrage(rs.getInt("idouvrage"));
			ouvrage.setTitre(rs.getString("titre"));
			ouvrage.setLangue(rs.getString("langue"));
			ouvrage.setEditeur(rs.getString("editeur"));
			ouvrage.setDomaine(rs.getString("domaine"));
			ouvrage.setDatepublication(rs.getDate("datepublication"));
			
			ouvrage.setIsbn(rs.getString("isbn"));
			ouvrage.setNbpages(rs.getInt("nbpages"));
			ouvrage.setNbrestant(rs.getInt("nbrestant"));
			ouvrage.setNbtotal(rs.getInt("nbtotal"));
			
			Auteur auteur= new Auteur();
			auteur.setIdauteur(rs.getInt("idauteur"));
			ouvrage.setAuteur(auteur);

			
			return ouvrage;
		}
	}
	

}
