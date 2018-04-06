package src.main.java.org.openclass.projects.entities;

import java.io.Serializable;
import java.util.Date;

import src.main.java.org.openclass.projects.dto.OuvrageDTO;


public class Emprunt implements Serializable{
	
	private int idemprunt;
	private Date datedebut;
	private Date datefin;
	private Date dateretour;
	private Boolean prolonge;
	private Utilisateur utilisateur;
	private Ouvrage ouvrage;
	public Emprunt() {
		super();
	}
	public Emprunt(int idemprunt) {
		super();
		this.idemprunt = idemprunt;
	}
	public int getIdemprunt() {
		return idemprunt;
	}
	public void setIdemprunt(int idemprunt) {
		this.idemprunt = idemprunt;
	}
	public Date getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}
	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	public Date getDateretour() {
		return dateretour;
	}
	public void setDateretour(Date dateretour) {
		this.dateretour = dateretour;
	}
	public Boolean getProlonge() {
		return prolonge;
	}
	public void setProlonge(Boolean prolonge) {
		this.prolonge = prolonge;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Ouvrage getOuvrage() {
		return ouvrage;
	}
	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}
	
	

}
