

package org.openclass.projects.business.contract.manager;

import java.util.List;
import org.openclass.projects.batch.business.contract.manager.EmpruntManager;

import org.openclass.projects.batch.business.contract.manager.MailManager;


public interface ManagerFactory {
	EmpruntManager getEmpruntanager();
	void setEmpruntManager(EmpruntManager borrowManager);
	MailManager getMailManager();
	void setMailManager(MailManager mailManager);
}
