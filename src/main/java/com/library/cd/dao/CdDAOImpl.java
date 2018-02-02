package com.library.cd.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.cd.model.Cd;

@Repository
public class CdDAOImpl implements CdDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Cd> getAllCds() {
		List<Cd> cdList = new ArrayList<Cd>();
		
		Session session = this.sessionFactory.getCurrentSession();
		cdList = session.createQuery("from CD").list();
		
//		cdList.add(new Cd(1, "Dil Chahta Hai", "Shankar-Ehsaan-Loy", 2001, 9, "41:02"));
//		cdList.add(new Cd(2, "Swades", "A.R. Rahman", 2004, 9, "53:15"));
//		cdList.add(new Cd(3, "Dangal", "Pritam Chakraborty", 2016, 7, "26:46"));
//		cdList.add(new Cd(4, "Phir Bhi Dil Hai Hindustani", "Jatin-Lalit", 1999, 8, "33:25"));
//		cdList.add(new Cd(5, "Lagaan", "A.R. Rahman", 2001, 8, "43:09"));
//		
		return cdList;
		
	}

}
