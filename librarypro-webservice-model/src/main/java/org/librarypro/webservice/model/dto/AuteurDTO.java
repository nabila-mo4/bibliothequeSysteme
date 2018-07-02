package org.librarypro.webservice.model.dto;

public class AuteurDTO {
	
    private int idauteur;
	
	private String nom;
	
	private String prenom;
	
	private String biographie;
	
	//private Set<OuvrageDTO> ouvrages = new HashSet<>(); 
	
	private String nationalite;

	public AuteurDTO(int idauteur, String nom, String prenom, String biographie,
			String nationalite) {
		super();
		this.idauteur = idauteur;
		this.nom = nom;
		this.prenom = prenom;
		this.biographie = biographie;
		//this.ouvrages = ouvrages;
		this.nationalite = nationalite;
	}

	

	public int getIdauteur() {
		return idauteur;
	}

	public void setIdauteur(int idauteur) {
		this.idauteur = idauteur;
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

	public String getBiographie() {
		return biographie;
	}

	public void setBiographie(String biographie) {
		this.biographie = biographie;
	}

	/*public Set<OuvrageDTO> getOuvrages() {
		return ouvrages;
	}

	public void setOuvrages(Set<OuvrageDTO> ouvrages) {
		this.ouvrages = ouvrages;
	}*/

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public AuteurDTO() {
		super();
	}



	public AuteurDTO(int idauteur) {
		super();
		this.idauteur = idauteur;
	}
	
	


}
