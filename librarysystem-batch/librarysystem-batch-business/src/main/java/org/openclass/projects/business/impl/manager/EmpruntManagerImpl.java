package org.openclass.projects.business.impl.manager;

import java.util.List;

import org.openclass.projects.batch.business.contract.manager.EmpruntManager;
import org.openclass.projects.batch.business.impl.AbstractManagerImpl;
import org.openclass.projects.webapplication.generated.model.EmpruntDTO;






public class EmpruntManagerImpl extends AbstractManagerImpl implements EmpruntManager   {
	public List<EmpruntDTO> EmpruntsEnRetard() {
		return getDaoFactory().getEmpruntDao().empruntsEnRetard();
	}
}
