package src.main.java.org.openclass.projects.conversion.impl;

import src.main.java.org.openclass.projects.conversion.contract.AuteurConversion;
import src.main.java.org.openclass.projects.conversion.contract.ConversionFactory;
import src.main.java.org.openclass.projects.conversion.contract.EmpruntConversion;
import src.main.java.org.openclass.projects.conversion.contract.OuvrageConversion;
import src.main.java.org.openclass.projects.conversion.contract.UtilisateurConversion;

public class ConversionFactoryImpl implements ConversionFactory {
	
	OuvrageConversion ouvrageConversion;
	AuteurConversion auteurConversion;
	UtilisateurConversion utilisateurConversion;
	EmpruntConversion empruntConversion;

	@Override
	public OuvrageConversion getOuvrageConversion() {
		
		return ouvrageConversion;
	}

	@Override
	public void setOuvrageConversion(OuvrageConversion ouvrageConversion) {
		this.ouvrageConversion = ouvrageConversion;
		
		
	}

	@Override
	public AuteurConversion getAuteurConversion() {
		
		return auteurConversion;
	}

	@Override
	public void setAuteurConversion(AuteurConversion auteurConversion) {
		this.auteurConversion=auteurConversion;
		
	}

	@Override
	public EmpruntConversion getEmpruntConversion() {
		
		return empruntConversion;
	}

	@Override
	public void setEmpruntConversion(EmpruntConversion empruntConversion) {
		this.empruntConversion=empruntConversion;
		
		
	}

	@Override
	public UtilisateurConversion getUtilisateurConversion() {
		
		return utilisateurConversion;
	}

	@Override
	public void setUtilisateurConversion(UtilisateurConversion utilisateurConversion) {
		this.utilisateurConversion= utilisateurConversion;
		
		
	}
	
	

}
