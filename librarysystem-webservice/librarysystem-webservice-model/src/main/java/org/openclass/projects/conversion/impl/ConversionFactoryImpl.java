package src.main.java.org.openclass.projects.conversion.impl;

import src.main.java.org.openclass.projects.conversion.contract.AuteurConversion;
import src.main.java.org.openclass.projects.conversion.contract.ConversionFactory;
import src.main.java.org.openclass.projects.conversion.contract.OuvrageConversion;

public class ConversionFactoryImpl implements ConversionFactory {
	
	OuvrageConversion ouvrageConversion;
	AuteurConversion auteurConversion;

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
	
	

}
