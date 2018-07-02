package org.librarypro.webservice.model.dto;

import java.util.HashSet;
import java.util.Set;

public class UtilisateurDTO {
	
    private int idutilisateur;
	
	private String email;
	
	private String mdp;
	
	private String nom;

	private String prenom;
	
	private String addresse;
	
	
	private Set<EmpruntDTO> emprunts = new HashSet<>();


	public int getIdutilisateur() {
		return idutilisateur;
	}


	public void setIdutilisateur(int idutilisateur) {
		this.idutilisateur = idutilisateur;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAddresse() {
		return addresse;
	}


	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}


	public Set<EmpruntDTO> getEmprunts() {
		return emprunts;
	}


	public void setEmprunts(Set<EmpruntDTO> emprunts) {
		this.emprunts = emprunts;
	}


	public UtilisateurDTO() {
		super();
	}


}
