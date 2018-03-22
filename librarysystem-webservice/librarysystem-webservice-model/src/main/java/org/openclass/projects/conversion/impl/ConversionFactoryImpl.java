package src.main.java.org.openclass.projects.conversion.impl;

import src.main.java.org.openclass.projects.conversion.contract.ConversionFactory;
import src.main.java.org.openclass.projects.conversion.contract.OuvrageConversion;

public class ConversionFactoryImpl implements ConversionFactory {
	
	OuvrageConversion ouvrageConversion;

	@Override
	public OuvrageConversion getOuvrageConversion() {
		
		return ouvrageConversion;
	}

	@Override
	public void setOuvrageConversion(OuvrageConversion ouvrageConversion) {
		this.ouvrageConversion = ouvrageConversion;
		
		
	}
	
	

}
