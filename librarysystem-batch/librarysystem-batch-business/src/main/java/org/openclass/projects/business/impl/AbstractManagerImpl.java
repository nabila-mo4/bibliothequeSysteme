package org.openclass.projects.batch.business.impl;

import org.springframework.mail.javamail.JavaMailSender;



public class AbstractManagerImpl {
	private DaoFactory daoFactory;
	private JavaMailSender mailSender;

	public DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	public JavaMailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
}
