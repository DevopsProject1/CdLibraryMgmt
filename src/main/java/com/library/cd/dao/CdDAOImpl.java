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
	
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<CD> getAllCds() {
		List<CD> cdList = new ArrayList<CD>();
		
		Session session = this.sessionFactory.openSession();
		cdList = session.createQuery("from CD").list();
		session.close();
		
		return cdList;
		
	}

}
