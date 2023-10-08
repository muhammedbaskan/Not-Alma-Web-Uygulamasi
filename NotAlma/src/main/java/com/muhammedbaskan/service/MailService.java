package com.muhammedbaskan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muhammedbaskan.notalma.HomeController;

@Service
public class MailService {

	@Autowired
	private JavaMailSender mailSender;
	
	public void registerMail(String mail,String key){
		
		SimpleMailMessage email = new SimpleMailMessage();
		email.setFrom("egitimeespring@gmail.com");
		email.setTo(mail);
		email.setSubject("�yeli�i Tamamla");
		email.setText("�yeli�i tamamlamak i�in a�a��daki linke t�klay�n�z.\n\n"
				+HomeController.url+"/reg/"+key);
		
		mailSender.send(email);
	}
}
