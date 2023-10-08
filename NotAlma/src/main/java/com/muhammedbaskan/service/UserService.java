package com.muhammedbaskan.service;

import java.util.UUID;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.muhammedbaskan.dao.UserDAO;
import com.muhammedbaskan.entity.User;

@Service
@Transactional
public class UserService {

	@Autowired
	private  MailService mailService;
	
	@Autowired
	private  UserDAO userDAO;
	
	public Long insert(User user){
		String uuid = UUID.randomUUID().toString();
		user.setKey(uuid);
		
		if(userDAO.insert(user)>0) {
			mailService.registerMail(user.getEmail(), user.getKey());
		}
		return 1l;
	}
	
	
	public void update(User user){
		userDAO.update(user);
	}
	
	public User getFindByUsernameAndPass(User user){
		return userDAO.getFindByUsernameAndPass(user.getUsername(),user.getPass());
	}
	
	public User getFindByUsername(String username){				
		return userDAO.getFindByUsername(username) ;
	}

	public boolean getFindByKey(String key){	
		User user = userDAO.getFindByKey(key);
		if(user != null) {
			user.setActive(true);
			update(user);
			return true;
		}
		else
			return false ;	
		
		
		
	}
}