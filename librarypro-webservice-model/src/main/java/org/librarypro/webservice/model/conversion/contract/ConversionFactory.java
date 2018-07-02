package org.librarypro.webservice.model.conversion.contract;



public interface ConversionFactory {
	
	OuvrageConversion getOuvrageConversion();
	void setOuvrageConversion(OuvrageConversion ouvrageConversion);
	
	AuteurConversion getAuteurConversion();
	void setAuteurConversion(AuteurConversion auteurConversion);
	
	EmpruntConversion getEmpruntConversion();
	void setEmpruntConversion(EmpruntConversion empruntConversion);
	
	UtilisateurConversion getUtilisateurConversion();
	void setUtilisateurConversion(UtilisateurConversion utilisateurConversion);

}
