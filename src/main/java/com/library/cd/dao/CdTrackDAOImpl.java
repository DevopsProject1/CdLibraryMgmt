package com.library.cd.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.cd.model.CdTrack;

@Repository
public class CdTrackDAOImpl implements CdTrackDAO {
	
	SessionFactory sessionFactory;
	
	Session session;
	
	public Session getSession() {
		return session;
	}

	@Autowired
	public CdTrackDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		session = sessionFactory.openSession();
	}

	public List<CdTrack> getAllTracksForCd(int cdId) {		
		SQLQuery sqlQuery = getSession().createSQLQuery("select trackId, title, authors, playingTime, cdId from CdTrack where cdId = " + cdId);
		sqlQuery.addEntity(CdTrack.class);
		List<CdTrack> cdTracks = sqlQuery.list();
		
		return cdTracks;
	}
	
}
