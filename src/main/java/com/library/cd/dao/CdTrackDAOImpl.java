package com.library.cd.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.cd.model.CdTrack;

@Repository
public class CdTrackDAOImpl implements CdTrackDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<CdTrack> getAllTracksForCd(int cdId) {		
		switch (cdId) {
		case 1:
			return fetchData(cdId);
		case 2:
			return fetchData(cdId);
		case 3:
			return fetchData(cdId);
		case 4:
			return fetchData(cdId);
		case 5:
			return fetchData(cdId);
		default:
			return new ArrayList<CdTrack>();
		}		
	}
	
	@SuppressWarnings("unchecked")
	private List<CdTrack> fetchData(int cdId) {
		Session session = this.sessionFactory.openSession();
		SQLQuery sqlQuery = session.createSQLQuery("select trackId, title, authors, playingTime, cdId from CdTrack where cdId = " + cdId);
		sqlQuery.addEntity(CdTrack.class);
		List<CdTrack> cdTracks = sqlQuery.list();
		session.close();
		
		return cdTracks;
	}
}
