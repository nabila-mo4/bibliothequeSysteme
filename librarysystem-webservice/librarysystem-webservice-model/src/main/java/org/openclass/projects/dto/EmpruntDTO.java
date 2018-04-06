package src.main.java.org.openclass.projects.dto;

import java.util.Date;

public class EmpruntDTO {
	
	private int idemprunt;
	private Date datedebut;
	private Date datefin;
	private Date dateretour;
	private Boolean prolonge;
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
