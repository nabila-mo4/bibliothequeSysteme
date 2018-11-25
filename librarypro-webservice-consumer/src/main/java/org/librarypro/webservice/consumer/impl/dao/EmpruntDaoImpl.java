package org.librarypro.webservice.consumer.impl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.librarypro.webservice.consumer.contract.dao.EmpruntDao;
import org.librarypro.webservice.consumer.impl.dao.OuvrageDaoImpl.OuvrageMapper;
import org.librarypro.webservice.model.entities.Emprunt;
import org.librarypro.webservice.model.entities.Ouvrage;
import org.librarypro.webservice.model.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class EmpruntDaoImpl implements EmpruntDao {
	
 
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	SqlParameterSource paramSource;
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	
	public void prolonger(int idemprunt) {
		System.out.println("nabila");
		
		String sql="UPDATE emprunt SET datedebut=:datedebut,encours=:encours,idutilisateur=:idutilisateur,idouvrage=:idouvrage,dateretour=:dateretour, prolonge=:prolonge WHERE idemprunt=:idemprunt";
		//getempruntbyid
		Emprunt emp=new Emprunt();
		List <Emprunt> prets= list();
		for(Emprunt e: prets) {  
			if(e.getIdemprunt()==idemprunt) {
				emp.setDateretour(e.getDateretour());
				emp.setIdouvrage(e.getIdouvrage());
				emp.setIdutilisateur(e.getIdutilisateur());
				//dateretour=e.getDateretour();
			}
		}
		System.out.println("nabila");
	//	System.out.println(dateretour);
		
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModeltwo(emp));
		
	}
	
	
	public void prolonge(Emprunt e) {
		System.out.println("nabila");
		
		String sql="UPDATE emprunt SET datedebut=:datedebut,encours=:encours,idutilisateur=:idutilisateur,idouvrage=:idouvrage,dateretour=:dateretour, prolonge=:prolonge WHERE idemprunt=:idemprunt";
		
		
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModeltwo(e));
		
	}
	
	public List<Emprunt> list() {
		String sql ="SELECT * FROM emprunt";
		List<Emprunt> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new EmpruntMapper());
		return list;
	}
	
	public List<Emprunt> empruntsEnCours() {
		
        String sql ="SELECT * FROM emprunt WHERE encours=true";
		List<Emprunt> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new EmpruntMapper());
		return list;
	}

	public void add(Emprunt emprunt) {
		String sql="INSERT INTO emprunt (datedebut,dateretour,prolonge,encours,idutilisateur,idouvrage) VALUES (:datedebut,:dateretour,:prolonge,:encours,:idutilisateur,:idouvrage)";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(emprunt));
		
	}
	
	public List<Emprunt> empruntsByUtilisateur(int idutilisateur) {
		String sql ="SELECT * FROM emprunt WHERE idutilisateur = :idutilisateur  ";
		List<Emprunt> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModelthree(new Emprunt(idutilisateur)), new EmpruntMapper());
		return list;
				
	}
	
	
	

	
	public SqlParameterSource getSqlParameterByModel(Emprunt emprunt) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(emprunt !=null) {
			paramSource.addValue("idemprunt", emprunt.getIdemprunt());
			paramSource.addValue("datedebut", emprunt.getDatedebut());
			
			paramSource.addValue("dateretour",emprunt.getDateretour());
			paramSource.addValue("prolonge",emprunt.getProlonge());
			paramSource.addValue("encours",emprunt.getEncours());
			paramSource.addValue("idouvrage",emprunt.getOuvrage().getIdouvrage());
			paramSource.addValue("idutilisateur", emprunt.getUtilisateur().getIdutilisateur());
		
		}
		return paramSource;
	}

	public SqlParameterSource getSqlParameterByModelone(Emprunt emprunt) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(emprunt !=null) {
			paramSource.addValue("idemprunt", emprunt.getIdemprunt());
			paramSource.addValue("datedebut", emprunt.getDatedebut());
			
			paramSource.addValue("dateretour", emprunt.getDateretour());
			paramSource.addValue("prolonge",emprunt.getProlonge());
			paramSource.addValue("encours",emprunt.getEncours());
		    paramSource.addValue("idouvrage", emprunt.getOuvrage().getIdouvrage());
		    paramSource.addValue("idutilisateur", emprunt.getUtilisateur().getIdutilisateur());
		    
		}
		return paramSource;
	}
	
	public SqlParameterSource getSqlParameterByModeltwo(Emprunt emprunt) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(emprunt !=null) {
			paramSource.addValue("idemprunt", emprunt.getIdemprunt());
			paramSource.addValue("datedebut", emprunt.getDatedebut());
			paramSource.addValue("encours", emprunt.getEncours());
			
			paramSource.addValue("idouvrage", emprunt.getOuvrage().getIdouvrage());
			paramSource.addValue("idutilisateur", 2);
			paramSource.addValue("prolonge", true);
			
			Date nvdate = DateUtils.addMonths(emprunt.getDateretour(),1);
			
			paramSource.addValue("dateretour",nvdate);
			System.out.println(nvdate);
			
			//System.out.println(dateretour);
		
		}
		return paramSource;
	}
	
	
	public SqlParameterSource getSqlParameterByModelthree(Emprunt emprunt) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(emprunt !=null) {
			
			paramSource.addValue("idutilisateur", emprunt.getIdutilisateur());

		
		}
		return paramSource;
	}



	public static final class EmpruntMapper implements RowMapper<Emprunt>{
		public Emprunt mapRow(ResultSet rs, int rowNum) throws SQLException{
			Emprunt emprunt = new Emprunt();
			emprunt.setIdemprunt(rs.getInt("idemprunt"));
			
			emprunt.setDatedebut(rs.getDate("datedebut"));
			
			emprunt.setDateretour(rs.getDate("dateretour"));
			emprunt.setProlonge(rs.getBoolean("prolonge"));
			emprunt.setEncours(rs.getBoolean("encours"));
			Ouvrage ouvrage= new Ouvrage();
			ouvrage.setIdouvrage(rs.getInt("idouvrage"));
			emprunt.setOuvrage(ouvrage);
			Utilisateur utilisateur= new Utilisateur();
			utilisateur.setIdutilisateur(rs.getInt("idutilisateur"));
			emprunt.setUtilisateur(utilisateur);

			
			return emprunt;
		}
	}



	
	
}
