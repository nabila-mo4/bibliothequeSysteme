package org.librarypro.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.librarypro.webservice.business.contract.manager.UtilisateurManager;
import org.librarypro.webservice.model.dto.UtilisateurDTO;
import org.librarypro.webservice.model.dto.UtilisateurDTO;
import org.librarypro.webservice.model.entities.Utilisateur;
import org.springframework.stereotype.Service;

@Service
public class  UtilisateurManagerImpl extends AbstractManagerImpl implements UtilisateurManager {

	
	public List<UtilisateurDTO> list() {
		List<Utilisateur> utilisateurs = getDaoFc().getUtilisateurDao().list();
		List<UtilisateurDTO> utilisateursDTO = new ArrayList<>();
		for(Utilisateur utilisateur : utilisateurs)
		{
			
			UtilisateurDTO utilisateurDTO = new UtilisateurDTO();
			utilisateurDTO = getConvfac().getUtilisateurConversion().toUtilisateurDTO(utilisateur, true, utilisateurDTO.getClass().getName());
			utilisateursDTO.add(utilisateurDTO);
		}
		
		return utilisateursDTO;
	}
	
	
	public boolean valid(String email, String mdp) {
		
		boolean var=false;
		
		List<Utilisateur> utilisateurs = getDaoFc().getUtilisateurDao().list();
		
		
		for (Utilisateur u : utilisateurs) {
			System.out.println(u.getEmail());
		}
		for (Utilisateur u : utilisateurs) {
			if (u.getEmail().equals(email)) {
				if (u.getMdp().equals(mdp)) {
					var = true;
				} else {
					var = false;
					
				}
				
		}
		}

		
		return var;
	}
	
	
	public UtilisateurDTO utilisateursparmail(String email) {
		 UtilisateurDTO utilisateurDTO = new UtilisateurDTO();
		 Utilisateur utilisateur= getDaoFc().getUtilisateurDao().getUtilisateurByEmail(email);
		 return getConvfac().getUtilisateurConversion().toUtilisateurDTO(utilisateur, true, utilisateurDTO.getClass().getName());
		
	}

}
