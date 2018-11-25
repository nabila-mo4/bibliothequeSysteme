package org.librarypro.webservice.consumer.impl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import org.librarypro.webservice.consumer.contract.dao.AuteurDao;
import org.librarypro.webservice.model.entities.Auteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class AuteurDaoImpl implements AuteurDao {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	SqlParameterSource paramSource;
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}
	
	
	public void  delete (Auteur auteur) {
		String sql ="DELETE FROM auteur WHERE idauteur=:idauteur";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(auteur));
		
	}

	
	public Auteur getById(int idauteur) {
		String sql="SELECT * FROM auteur WHERE idauteur=:idauteur";
		return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Auteur(idauteur)), new AuteurMapper());
	}

	
	public void update(Auteur auteur) {
		String sql="UPDATE auteur SET nom=:nom, prenom=:prenom, biographie=:biographie,nationalite=:nationalite,"
				+ " WHERE idauteur=:idauteur";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(auteur));
		
	}

	
	
	public Set<Auteur> findAllBySearchCriteria(String sqlStatement) {
		Set<Auteur> list= (Set<Auteur>) namedParameterJdbcTemplate.query(sqlStatement, getSqlParameterByModel(null), new AuteurMapper());
        return list;
	}

	
	public void create(Auteur auteur) {
		String sql="INSERT INTO auteur (nom,prenom,biographie,nationalite)"
				+ " VALUES (:nom,:prenom,:biographie,:nationalite)";
        
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(auteur));
		
	}

	
	public List<Auteur> listAuteurs() {
		String sql ="SELECT * FROM auteur ";
		List<Auteur> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new AuteurMapper());
		return list;
	}
	
	public SqlParameterSource getSqlParameterByModel(Auteur auteur) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(auteur !=null) {
			paramSource.addValue("idauteur", auteur.getIdauteur());
			paramSource.addValue("nom", auteur.getNom());
			paramSource.addValue("prenom",auteur.getPrenom());
			paramSource.addValue("biographie",auteur.getBiographie());
			paramSource.addValue("nationalite",auteur.getNationalite());
			
			
		
		}
		return paramSource;
	}
	
	public static final class AuteurMapper implements RowMapper<Auteur>{
		public Auteur mapRow(ResultSet rs, int rowNum) throws SQLException{
			Auteur auteur = new Auteur();
			auteur.setIdauteur(rs.getInt("idauteur"));
			auteur.setNom(rs.getString("nom"));
			auteur.setPrenom(rs.getString("prenom"));
			auteur.setBiographie(rs.getString("biographie"));
			auteur.setNationalite(rs.getString("nationalite"));

			return auteur;
		}
	}


	
	
	


}
