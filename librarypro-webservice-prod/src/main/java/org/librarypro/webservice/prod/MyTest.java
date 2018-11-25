package org.librarypro.webservice.prod;

import java.util.Date;
import java.util.List;

import org.librarypro.webservice.business.contract.ManagerFactory;
import org.librarypro.webservice.model.dto.AuteurDTO;
import org.librarypro.webservice.model.dto.EmpruntDTO;
import org.librarypro.webservice.model.dto.OuvrageDTO;
import org.librarypro.webservice.model.entities.Ouvrage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	
	public static void main( String[] args )
    {    
        ApplicationContext vApplicationContext= new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");
        
        ManagerFactory managerFactory = (ManagerFactory) vApplicationContext.getBean("managerFactory");
        
       /* String email="nabila.mokadmi01@gmail.com";
        String mdp="nabila";
		System.out.println( managerFactory.getUtilisateurManager().valid(email, mdp));
        
        //System.out.println(managerFactory.getOuvrageManager().getById(2).getDomaine());
       // OuvrageDTO ouvrage;
        /*ouvrage=managerFactory.getOuvrageManager().getById(1);
        ouvrage.setIdouvrage(2);
        ouvrage.setDomaine("hgf");
        
        
        
        System.out.println(ouvrage.getIdouvrage());
        
        
        
        
        
        managerFactory.getOuvrageManager().update(ouvrage);
        /*OuvrageDTO ouvrage=new OuvrageDTO();
        AuteurDTO auteur1=  managerFactory.getAuteurManager().getById(1);
        int id=auteur1.getIdauteur();
        
        System.out.println(auteur1.getBiographie());
        ouvrage.setIdauteur(id);
        ouvrage.setDatepublication(new Date());
        ouvrage.setDomaine("dd");
        ouvrage.setEditeur("des");
       
        ouvrage.setIsbn("ftrd");
        ouvrage.setLangue("efde");
        ouvrage.setNbpages(5);
        ouvrage.setNbrestant(56);
        ouvrage.setNbtotal(56);
        ouvrage.setTitre("effffffffffff");
        managerFactory.getOuvrageManager().create(ouvrage);*/
        System.out.println("nabila");
        
        /*List<OuvrageDTO> o = managerFactory.getOuvrageManager().searchAuteur("yg");
        for(OuvrageDTO ouvrage:o) {
        System.out.println(ouvrage.getIsbn());*/
        
       managerFactory.getEmpruntManager().prolonger(5);
        System.out.println("n");
        
        }
        
        
                
    }

