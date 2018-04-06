package src.main.java.org.openclass.projects.conversion.contract;

public interface ConversionFactory {
	
	OuvrageConversion getOuvrageConversion();
	void setOuvrageConversion(OuvrageConversion ouvrageConversion);
	
	AuteurConversion getAuteurConversion();
	void setAuteurConversion(AuteurConversion auteurConversion);
	
	EmpruntConversion getEmpruntConversion();
	void setEmpruntConversion(EmpruntConversion empruntConversion);
	/*CitizenshipTransformer getCitizenshipTransformer();
	void setCitizenshipTransformer(CitizenshipTransformer citizenshipTransformer);
	MagazineTransformer getMagazineTransformer();
	void setMagazineTransformer(MagazineTransformer magazineTransformer);
	UserLightTransformer getUserLightTransformer();
	void setUserLightTransformer(UserLightTransformer userLightTransformer);
	ImageTransformer getImageTransformer();
	void setImageTransformer(ImageTransformer imageTransformer);
	UserAccountTransformer getUserAccountTransformer();
	void setUserAccountTransformer(UserAccountTransformer userAccountTransformer);*/

}
