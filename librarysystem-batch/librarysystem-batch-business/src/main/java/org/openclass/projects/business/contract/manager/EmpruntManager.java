package org.openclass.projects.business.contract.manager;

import java.util.List;
import org.openclass.projects.webapplication.generated.model.EmpruntDTO;

public interface EmpruntManager {
	List<EmpruntDTO> EmpruntsEnRetard();
	
}
