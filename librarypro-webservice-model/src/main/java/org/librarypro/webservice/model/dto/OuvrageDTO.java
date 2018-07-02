package org.librarypro.webservice.model.dto;

import java.util.Date;

import org.librarypro.webservice.model.entities.Auteur;

public class OuvrageDTO {
	
	private String titre;
	private String langue;
	private String domaine;
	private String editeur;
	
	private Date datepublication;
	private String isbn;
	private int nbpages;
	private int nbtotal;
	private int nbrestant;
	private int idouvrage;
	private String nom;
	private boolean etat;
	
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public AuteurDTO getAuteur() {
		return auteur;
	}
	public void setAuteur(AuteurDTO auteur) {
		this.auteur = auteur;
	}
	private AuteurDTO auteur;
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	
	public Date getDatepublication() {
		return datepublication;
	}
	public void setDatepublication(Date datepublication) {
		this.datepublication = datepublication;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNbpages() {
		return nbpages;
	}
	public void setNbpages(int nbpages) {
		this.nbpages = nbpages;
	}
	public int getNbtotal() {
		return nbtotal;
	}
	public void setNbtotal(int nbtotal) {
		this.nbtotal = nbtotal;
	}
	public int getNbrestant() {
		return nbrestant;
	}
	public void setNbrestant(int nbrestant) {
		this.nbrestant = nbrestant;
	}
	public int getIdouvrage() {
		return idouvrage;
	}
	public void setIdouvrage(int idouvrage) {
		this.idouvrage = idouvrage;
	}
	public OuvrageDTO() {
		super();
	}


}
