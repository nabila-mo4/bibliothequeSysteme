package org.librarypro.webservice.model.entities;

import java.io.Serializable;
import java.util.Date;

public class Emprunt implements Serializable{
	private int idutilisateur;
	
	
	public Emprunt(int idutilisateur) {
		super();
		this.idutilisateur = idutilisateur;
	}
	public int getIdutilisateur() {
		return idutilisateur;
	}
	public void setIdutilisateur(int idutilisateur) {
		this.idutilisateur = idutilisateur;
	}
	
	private int idouvrage;
	public int getIdouvrage() {
		return idouvrage;
	}
	public void setIdouvrage(int idouvrage) {
		this.idouvrage = idouvrage;
	}
	public Emprunt(Utilisateur utilisateur) {
		super();
		this.utilisateur = utilisateur;
	}
	private int idemprunt;
	private Date datedebut;
	
	private Date dateretour;
	private Boolean prolonge;
	private Boolean encours;
	public Boolean getEncours() {
		return encours;
	}
	public void setEncours(Boolean encours) {
		this.encours = encours;
	}
	private Utilisateur utilisateur;
	private Ouvrage ouvrage;
	public Emprunt() {
		super();
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
