package org.librarypro.webservice.consumer.impl.dao;

import java.sql.ResultSet;



import java.sql.SQLException;
import java.util.List;

import org.librarypro.webservice.consumer.contract.dao.UtilisateurDao;

import org.librarypro.webservice.model.entities.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class UtilisateurDaoImpl implements UtilisateurDao{

		
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	SqlParameterSource paramSource;
	 
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}
 
	public List<Utilisateur> list() {
		String sql ="SELECT * FROM utilisateur";
		List <Utilisateur> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new UtilisateurMapper());
		return list;
	}

	public Utilisateur getUtilisateurByEmail(String email) {
		
		String sql ="SELECT * FROM utilisateur WHERE email=:email";
		
		return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Utilisateur(email)), new UtilisateurMapper());
	
		
	}
	
	public SqlParameterSource getSqlParameterByModel(Utilisateur utilisateur) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(utilisateur !=null) {
			paramSource.addValue("idutilisateur", utilisateur.getIdutilisateur());
			paramSource.addValue("email", utilisateur.getEmail());
			paramSource.addValue("mdp",utilisateur.getMdp());
			paramSource.addValue("nom",utilisateur.getNom());
			paramSource.addValue("prenom",utilisateur.getPrenom());
			paramSource.addValue("adresse",utilisateur.getAddresse());
		}
		return paramSource;
	}
	
	public static final class UtilisateurMapper implements RowMapper<Utilisateur>{
		 public Utilisateur mapRow(ResultSet rs, int rowNum) throws SQLException{
			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setIdutilisateur(rs.getInt("idutilisateur"));
			utilisateur.setEmail(rs.getString("email"));
			utilisateur.setMdp(rs.getString("mdp"));
			utilisateur.setNom(rs.getString("nom"));
			utilisateur.setPrenom(rs.getString("prenom"));
			utilisateur.setAddresse(rs.getString("adresse"));
			return utilisateur;
		} 
	}


	
	
	
	
	

}
