package org.oc.librarypro_webservice.webinterface.webservices;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.librarypro.webservice.model.dto.EmpruntDTO;
import org.oc.librarypro_webservice.webinterface.AbstractService;
@WebService(serviceName = "NabilaService")
public class NabilaService {
	 
 
		
		@WebMethod
		public String empruntsByUtilisateur(int idutilisateur)
		{
			return new Date().toString();
		}
		
		

	}


