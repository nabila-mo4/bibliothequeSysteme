package org.openclass.projects.consumer.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.openclass.projects.consumer.contract.EmpruntDao;
import org.openclass.projects.consumer.contract.Utilisateur;
import org.openclass.projects.consumer.impl.OuvrageDaoImpl.OuvrageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import src.main.java.org.openclass.projects.dto.EmpruntDTO;
import src.main.java.org.openclass.projects.entities.Emprunt;
import src.main.java.org.openclass.projects.entities.Ouvrage;

@Repository
public class EmpruntDaoImpl implements EmpruntDao{
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	SqlParameterSource paramSource;
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	@Override
	public void prolonger(Emprunt emprunt) {
		emprunt.setProlonge(true);
		String sql="UPDATE emprunt SET prolonge=:prolonge WHERE idemprunt=:idemprunt";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(emprunt));
		
	}
	
	@Override 
	public Emprunt getById(int idemprunt)  {
		String sql="SELECT emprunt.*, utilisateur.nom FROM emprunt LEFT JOIN utilisateur ON emprunt.idutilisateur=utilisateur.idutilisateur WHERE idemprunt=:idemprunt";
		return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Emprunt(idemprunt)), new EmpruntMapper());
	}
	
	
	@Override
	public List<Emprunt> list() {
		String sql ="SELECT emprunt.*, utilisateur.nom FROM emprunt LEFT JOIN utilisateur ON emprunt.idutilisateur=utilisateur.idutilisateur ";
		
		List<Emprunt> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new EmpruntMapper());
		return list;
	}
	
	 
	

	@Override
	public List<Emprunt> empruntsEnRetard() {
		/*StringBuilder requete = new StringBuilder();
		requete.append("SELECT emprunt.*, ouvrage.* FROM emprunt LEFT JOIN ouvrage ON emprunt.idouvrage=ouvrage.idouvrage WHERE ((emprunt.datedebut<=:now AND emprunt.prolonge=false)OR(emprunt.datedebut<=:nowe AND emprunt.prolonge=true)) AND dateretour=null");
		Query query = getEm().createQuery(requete.toString());
		Calendar calendrier = Calendar.getInstance();
		calendrier.setTime(new Date());
		calendrier.add(Calendar.MONTH, -1);
		query.setParameter("now", calendrier.getTime());
		Calendar cal2Month = Calendar.getInstance();
		cal2Month.setTime(new Date());
		cal2Month.add(Calendar.MONTH, -2);
		query.setParameter("nowe", cal2Month.getTime());
		return (List<Borrow>) query.getResultList();*/
		return null;
	}
	
	public SqlParameterSource getSqlParameterByModel(Emprunt emprunt) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(emprunt !=null) {
			paramSource.addValue("idemprunt", emprunt.getIdemprunt());
			paramSource.addValue("datedebut", emprunt.getDatedebut());
			paramSource.addValue("datefin",emprunt.getDatefin());
			paramSource.addValue("dateretour",emprunt.getDateretour());
			paramSource.addValue("prolonge",emprunt.getProlonge());
			paramSource.addValue("idouvrage",emprunt.getOuvrage().getIdouvrage());
			paramSource.addValue("idutilisateur", emprunt.getUtilisateur().getIdutilisateur());
		
		}
		return paramSource;
	}

	@Override
	public void add(Emprunt emprunt) {
		String sql="INSERT INTO emprunt (datedebut,datefin,dateretour,prolonge,idutilisateur,idouvrage) VALUES (:datedebut,:datefin,:dateretour,:prolonge,:idutilisateur,:idouvrage)";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(emprunt));
		
	}

	@Override
	public void update(Emprunt emprunt) {
		String sql="UPDATE emprunt SET datedebut=:datedebut, datefin=:datefin, dateretour=:dateretour, prolonge=:prolonge, idutilisateur=:idutilisateur, idouvrage=:idouvrage WHERE idemprunt=:idemprunt";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModelone(emprunt));
		
	}

	@Override
	public void delete(Emprunt emprunt) {
		String sql ="DELETE FROM emprunt WHERE idemprunt=:idemprunt";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(emprunt));	
		
	}
	
	public SqlParameterSource getSqlParameterByModelone(Emprunt emprunt) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(emprunt !=null) {
			paramSource.addValue("idemprunt", emprunt.getIdemprunt());
			paramSource.addValue("datedebut", emprunt.getDatedebut());
			paramSource.addValue("datefin", emprunt.getDatefin());
			paramSource.addValue("dateretour", emprunt.getDateretour());
			paramSource.addValue("prolonge",emprunt.getProlonge());
		    paramSource.addValue("idouvrage", emprunt.getOuvrage().getIdouvrage());
		    paramSource.addValue("idutilisateur", emprunt.getUtilisateur().getIdutilisateur());
		    
		}
		return paramSource;
	}


	public static final class EmpruntMapper implements RowMapper<Emprunt>{
		public Emprunt mapRow(ResultSet rs, int rowNum) throws SQLException{
			Emprunt emprunt = new Emprunt();
			emprunt.setIdemprunt(rs.getInt("idemprunt"));
			
			emprunt.setDatedebut(rs.getDate("datedebut"));
			emprunt.setDatefin(rs.getDate("datefin"));
			emprunt.setDateretour(rs.getDate("dateretour"));
			emprunt.setProlonge(rs.getBoolean("prolonge"));
			Ouvrage ouvrage= new Ouvrage();
			ouvrage.setIdouvrage(rs.getInt("idouvrage"));
			emprunt.setOuvrage(ouvrage);
			Utilisateur utilisateur= new Utilisateur();
			utilisateur.setIdutilisateur(rs.getInt("idutilisateur"));
			emprunt.setUtilisateur(utilisateur);

			
			return emprunt;
		}
	}


	@Override
	public List<Emprunt> empruntsByUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	


}
