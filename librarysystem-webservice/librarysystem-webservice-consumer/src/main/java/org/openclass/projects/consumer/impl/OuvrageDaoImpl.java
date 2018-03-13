package org.openclass.projects.consumer.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.openclass.projects.consumer.contract.OuvrageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

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
	public void delete(Ouvrage ouvrage) {
		
		String sql ="DELETE FROM ouvrage WHERE idouvrage=:idouvrage";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(new Ouvrage(idouvrage)));
		
	}

	@Override
	public Ouvrage getById(int idouvrage)  {
		String sql="SELECT * FROM ouvrage WHERE idouvrage=:idouvrage";
		return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Ouvrage(idouvrage)), new OuvrageMapper());
	}

	@Override 
	public void update(Ouvrage ouvrage) {
		String sql="UPDATE ouvrage SET titre=:titre, langue=:langue, domaine=:domaine, editeur=:editeur, auteur=:auteur, datepublication=:datepublication,"
				+ "isbn=:isbn, nbpages=:nbpages,nbtotal=:nbtotal, nbrestant=:nbrestant WHERE idouvrage=:idouvrage";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(ouvrage));
		
	}

	@Override
	public List<Ouvrage> findAllBySearchCriteria(String sqlStatement) {
		List<Ouvrage> list= namedParameterJdbcTemplate.query(sqlStatement, getSqlParameterByModel(null), new OuvrageMapper());
        return list;
	}

	@Override
	public void create(Ouvrage ouvrage) {
		String sql="INSERT INTO ouvrage (titre,langue,domaine,editeur,auteur,datepublication,isbn,nbpages,nbtotal,nbrestant)"
				+ " VALUES (:titre,:langue,:domaine,:editeur,:auteur,:datepublication,:isbn,:nbpages,:nbtotal,:nbrestant)";
        
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(ouvrage));
		
		
	}

	@Override
	public List<Ouvrage> listOuvrages() {
		String sql ="SELECT * FROM ouvrage ";
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
			paramSource.addValue("auteur",ouvrage.getAuteur());
			paramSource.addValue("datepublication",ouvrage.getDatepublication());
			paramSource.addValue("isbn", ouvrage.getIsbn());
			paramSource.addValue("nbpages", ouvrage.getNbpages());
			paramSource.addValue("nbtotal", ouvrage.getNbtotal());
			paramSource.addValue("nbrestant", ouvrage.getNbrestant());
			
		
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
			ouvrage.setAuteur(rs.getString("auteur"));
			ouvrage.setIsbn(rs.getString("isbn"));
			ouvrage.setNbpages(rs.getInt("nbpages"));
			ouvrage.setNbrestant(rs.getInt("nbrestant"));
			ouvrage.setNbtotal(rs.getInt("nbtotal"));
			return ouvrage;
		}
	}
	

}
