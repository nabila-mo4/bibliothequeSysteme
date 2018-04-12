package org.openclass.projects.batch.business.impl;

import org.openclass.projects.batch.business.contract.ManagerFactory;
import org.openclass.projects.batch.business.contract.manager.EmpruntManager;
import org.openclass.projects.batch.business.contract.manager.MailManager;

public class ManagerFactoryImpl implements ManagerFactory {
	EmpruntManager empruntManager;
	MailManager mailManager;

	public EmpruntManager getEmpruntManager() {
		return empruntManager;
	}

	public void setEmpruntManager(EmpruntManager empruntManager) {
		this.empruntManager = empruntManager;
	}

	public MailManager getMailManager() {
		return mailManager;
	}

	public void setMailManager(MailManager mailManager) {
		this.mailManager = mailManager;
	}
	
}
