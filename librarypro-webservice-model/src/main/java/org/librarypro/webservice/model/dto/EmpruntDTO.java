package org.librarypro.webservice.model.dto;

import java.util.Date;

public class EmpruntDTO {
	private int idutilisateur;
	public EmpruntDTO(int idutilisateur) {
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
	public EmpruntDTO(UtilisateurDTO utilisateurDTO) {
		super();
		this.utilisateurDTO = utilisateurDTO;
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
	private UtilisateurDTO utilisateurDTO;
	private OuvrageDTO ouvrageDTO;
	public EmpruntDTO() {
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
	public UtilisateurDTO getUtilisateurDTO() {
		return utilisateurDTO;
	}
	public void setUtilisateurDTO(UtilisateurDTO utilisateurDTO) {
		this.utilisateurDTO = utilisateurDTO;
	}
	public OuvrageDTO getOuvrageDTO() {
		return ouvrageDTO;
	}
	public void setOuvrageDTO(OuvrageDTO ouvrageDTO) {
		this.ouvrageDTO = ouvrageDTO;
	}

}
