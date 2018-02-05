package com.library.cd.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.cd.model.CD;

@Repository
public class CdDAOImpl implements CdDAO {
	
	SessionFactory sessionFactory;
	Session session;
	
	public Session getSession() {
		return session;
	}

	@Autowired
	public CdDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();
	}

	@SuppressWarnings("unchecked")
	public List<CD> getAllCds() {
		List<CD> cdList = new ArrayList<CD>();
		
		cdList = getSession().createQuery("from CD").list();
		getSession().close();
		
		return cdList;
		
	}

}
