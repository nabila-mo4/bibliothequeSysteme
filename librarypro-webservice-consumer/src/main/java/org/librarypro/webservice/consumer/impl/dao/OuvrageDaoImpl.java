package org.librarypro.webservice.consumer.impl.dao;

import java.sql.ResultSet;


import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import org.librarypro.webservice.consumer.contract.dao.OuvrageDao;
import org.librarypro.webservice.model.entities.Auteur;
import org.librarypro.webservice.model.entities.Ouvrage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class OuvrageDaoImpl implements OuvrageDao{

 
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	SqlParameterSource paramSource;
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	

	public  Ouvrage getById(int idouvrage)  {
		String sql="SELECT ouvrage.* FROM ouvrage  WHERE idouvrage=:idouvrage";
		return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Ouvrage(idouvrage)), new OuvrageMapper());
	}
	
	public SqlParameterSource getSqlParameterByModelone(Ouvrage ouvrage) {
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
			
			//paramSource.addValue("nom", ouvrage.getAuteur().getNom());
			
			
		
		}
		return paramSource;
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
			paramSource.addValue("idauteur", ouvrage.getAuteur());
			//paramSource.addValue("nom", ouvrage.getAuteur());
			
			
		
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
			
			//auteur.setNom(rs.getString("nom"));
			ouvrage.setAuteur(auteur);
			
			

			
			return ouvrage;
		}
	}
	
	public static final class OuvrageMappere implements RowMapper<Ouvrage>{
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

	public void create(Ouvrage ouvrage) {
	
		String sql="INSERT INTO ouvrage (titre,langue,domaine,editeur,datepublication,isbn,nbpages,nbtotal,nbrestant,idauteur)"
				+ " VALUES (:titre,:langue,:domaine,:editeur,:datepublication,:isbn,:nbpages,:nbtotal,:nbrestant,:idauteur)";
        
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModelone(ouvrage));
		
	}



	public void delete(Ouvrage ouvrage) {
		String sql ="DELETE FROM ouvrage WHERE idouvrage=:idouvrage";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModelone(ouvrage));
		
	}



	public List<Ouvrage> list() {
        String sql ="SELECT ouvrage.*, auteur.* FROM ouvrage LEFT JOIN auteur ON ouvrage.idauteur=auteur.idauteur ";
		
		List<Ouvrage> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new OuvrageMapper());
		return list;
	}



	public void update(Ouvrage ouvrage) {
		String sql="UPDATE ouvrage SET titre=:titre, langue=:langue, domaine=:domaine, editeur=:editeur, datepublication=:datepublication,"
				+ "isbn=:isbn, nbpages=:nbpages,nbtotal=:nbtotal, nbrestant=:nbrestant, idauteur=:idauteur WHERE idouvrage=:idouvrage";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(ouvrage));
		
	}



	public List<Ouvrage> getOuvrageByTitre(String titre) {
		
		String critere = "'" + titre + "'";
		String vSQL = "SELECT * FROM ouvrage WHERE titre = " + critere;
		List<Ouvrage> list=  namedParameterJdbcTemplate.query(vSQL, getSqlParameterByModel(null), new OuvrageMapper());
        return list;
    	}
	
	
    public List<Ouvrage> getOuvrageByAuteur(String auteur) {
		
		String critere = "'" + auteur + "'";
		String vSQL = "SELECT ouvrage.*, auteur.* FROM ouvrage LEFT JOIN auteur ON ouvrage.idauteur=auteur.idauteur WHERE nom = " + critere;
		
		List<Ouvrage> list=  namedParameterJdbcTemplate.query(vSQL, getSqlParameterByModel(null), new OuvrageMapperee());
        return list;
    	}
	
    
    public static final class OuvrageMapperee implements RowMapper<Ouvrage>{
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
			
			auteur.setNom(rs.getString("nom"));
			ouvrage.setAuteur(auteur);
			
			

			
			return ouvrage;
		}
	}
	
	


}

