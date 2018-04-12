package org.openclass.projects.batch.business.impl.manager;

import java.util.List;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;

import org.springframework.mail.SimpleMailMessage;
import org.openclass.projects.batch.business.contract.manager.MailManager;
import org.openclass.projects.batch.business.impl.AbstractManagerImpl;
import import org.openclass.projects.webapplication.generated.model.EmpruntDTO;

public class MailManagerImpl extends AbstractManagerImpl implements MailManager {
	
	public void envoyerMail(String email, List<String> emprunts) {
		MimeMessage mimeMessage = getMailSender().createMimeMessage();
		try {
			mimeMessage.setFrom(new InternetAddress("nabila.mokadmi01@gmail.com", "nereplay@library.com"));

			mimeMessage.setRecipients(Message.RecipientType.TO,
		              InternetAddress.parse(email));
			mimeMessage.setSubject("Retard d'emprunt");
			StringBuilder content = new StringBuilder();
			content.append(
					"<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n" + 
					"<head>\r\n" + 
					"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n" + 
					"    <title>Mail de confirmation</title>\r\n" + 
					"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n" + 
					"</head>\r\n" + 
					"<body style=\"margin: 0; padding: 0;\">\r\n" + 
					"<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n" + 
					"    <tr>\r\n" + 
					"        <table align=\"center\"  cellpadding=\"0\" cellspacing=\"0\" width=\"600\">\r\n" + 
					"            <tr>\r\n" + 
					"                <td align=\"center\" bgcolor=\"#307fff\" style=\"padding: 40px 0 30px 0; color: #E6E6E6;\">\r\n" + 
					"					<h1>Systeme de bibliotheque</h1>\r\n" + 
					"                </td>\r\n" + 
					"            </tr>\r\n" + 
					"            <tr>\r\n" + 
					"                <td bgcolor=\"#ffffff\" cellspacing=\"0\" style=\"padding: 40px 30px 40px 30px;\">\r\n" + 
					"                    <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n" + 
					"                        <tr>\r\n" + 
					"                            <td align=\"center\">\r\n" + 
					"                                <h1>Retour de prêt en retard</h1>\r\n" + 
					"\r\n" + 
					"                            </td>\r\n" + 
					"                        </tr>\r\n" + 
					"                        <tr>\r\n" + 
					"                            <td align=\"center\">\r\n" + 
					"                                <p>Bonjour  Concernant vos emprunts dans votre bibliothèque .</p>\r\n" + 
					"\r\n" + 
					"                               \r\n" + 
					"\r\n" + 
					"                            </td>\r\n" + 
					"                        </tr>\r\n" + 
					"                        <tr>\r\n" + 
					"                            <td align=\"center\">\r\n" + 
					"                                <table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n" + 
					"                                    <thead>\r\n" + 
					"                                        <tr bgcolor=\"#307fff\" style=\"color: #E6E6E6\">\r\n" + 
					"                                            <th>Titre</th>\r\n" + 
					"                                             
					"                                        </tr>\r\n" + 
					"                                    </thead>\r\n" + 
					"                                    <tbody>\r\n" );
			
			
			content.append("                                    </tbody>\r\n" + 
					"                                </table>\r\n" + 
					"                            </td>\r\n" + 
					"                        </tr>\r\n" + 
					"						
					"                    </table>\r\n" + 
					"                </td>\r\n" + 
					"            </tr>\r\n" + 
					"            <tr>\r\n" + 
					"                
					"    </tr>\r\n" + 
					"</table>\r\n" + 
					"</body>\r\n" + 
					"</html>");
			mimeMessage.setContent(content.toString(), "text/html; charset=utf-8");
			getMailSender().send(mimeMessage);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}
	
	
}
