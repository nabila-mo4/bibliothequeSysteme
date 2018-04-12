package org.openclass.projects.business.contract.manager;

import java.util.List;
import org.openclass.projects.webapplication.generated.model.EmpruntDTO;




import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

public interface MailManager {
	//void envoyerTestMail();
	void envoyerMail(String email, List<String> emprunts);
}
