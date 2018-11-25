package org.librarypro.webservice.business.impl.manager;

import org.librarypro.webservice.business.contract.manager.AbstractManager;
import org.librarypro.webservice.consumer.contract.DaoFactory;
import org.librarypro.webservice.model.conversion.contract.ConversionFactory;

public class AbstractManagerImpl implements AbstractManager {
	
	private DaoFactory daoFc;
	private  ConversionFactory convfac; 
	
	

	public ConversionFactory getConvfac() {
		return convfac;
	}

	public void setConvfac(ConversionFactory convfac) {
		this.convfac = convfac;
	}

	public DaoFactory getDaoFc() {
		return daoFc;
	}

	public void setDaoFc(DaoFactory daoFc) {
		this.daoFc = daoFc;
	}
	
	
	

}
