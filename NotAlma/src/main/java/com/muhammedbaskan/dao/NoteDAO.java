package com.muhammedbaskan.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoteDAO {

	@Autowired
	private  SessionFactory sessionFactory;
	
	//CRUD Ýþlemleri
	
	public Long insert(Note note){
		return (Long) sessionFactory.getCurrentSession().save(note);
	}
	
	public Long update(Note note){
		 sessionFactory.getCurrentSession().update(note);
	}
	
	public Long persist(Note note){
		 sessionFactory.getCurrentSession().persist(note);
	}
	
	public Long delete(Note note){
		 sessionFactory.getCurrentSession().delete(note);
	}
	
	
	//READ
	public Note getFindById(Long id){
		Query query =  sessionFactory.getCurrentSession().createQuery("FROM Note WHERE id=:id")
				.setLong("id",id);
		return (Note) query.getSingleResult();
	}
	
	public ArrayList<Note> getAll(){
		Query query =  sessionFactory.getCurrentSession().createQuery("FROM Note");
		return ArrayList<Note> query.getResultList();
	}
	
	public ArrayList<Note> getAll(Long user_id){
		Query query =  sessionFactory.getCurrentSession().createQuery("FROM Note WHERE user_id=:user_id order by id desc")
				.setLong("user_id", user_id);
		return ArrayList<Note> query.getResultList();
	}
	
	
}
