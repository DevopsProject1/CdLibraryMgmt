package com.library.cd.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.Before;
import org.junit.Test;

import com.library.cd.model.CdTrack;

public class CdTrackDAOTest {
	
	private SessionFactory sessionFactory;
	
	private CdTrackDAO cdTrackDAO;
	
	@Before
	public void setUp() {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.addAnnotatedClass(CdTrack.class);
		configuration.setProperty("hibernate.dialect",
				"org.hibernate.dialect.H2Dialect");
		configuration.setProperty("hibernate.connection.driver_class",
				"org.h2.Driver");
		configuration.setProperty("hibernate.connection.url",
				"jdbc:h2:mem:test");
		configuration.setProperty("hibernate.hbm2ddl.auto", "create");

		sessionFactory = configuration.buildSessionFactory();
		cdTrackDAO = new CdTrackDAOImpl(sessionFactory);
	}

	@Test
	public void getAllTracksForCd() {
		CdTrack track1 = new CdTrack();
		track1.setAuthors("Shaan, Kavita Subrahmanyam");
		track1.setCdId(1);
		track1.setPlayingTime("5:06");
		track1.setTitle("Woh Ladki Hai Kahan");
		track1.setTrackId(3);
		
		CdTrack track2 = new CdTrack();
		track2.setAuthors("Udit Narayan, Alka Yagnik");
		track2.setCdId(1);
		track2.setPlayingTime("4:50");
		track2.setTitle("Jaane Kyon Log Pyar");
		track2.setTrackId(2);
		
		((CdTrackDAOImpl) cdTrackDAO).getSession().save(track1);
		((CdTrackDAOImpl) cdTrackDAO).getSession().save(track2);
		
		List<CdTrack> allTracksForCd = cdTrackDAO.getAllTracksForCd(1);
		assertNotNull(allTracksForCd);
		assertEquals(2, allTracksForCd.size());
		
		CdTrack row = allTracksForCd.get(0);
		assertEquals(1, row.getCdId());
		assertEquals(1, row.getTrackId());
		assertEquals("Woh Ladki Hai Kahan", row.getTitle());
		assertEquals("Shaan, Kavita Subrahmanyam", row.getAuthors());
		assertEquals("5:06", row.getPlayingTime());
		
		assertEquals("CdTrack [trackId=" + row.getTrackId() + ", title=" + row.getTitle()
				+ ", authors=" + row.getAuthors() + ", playingTime=" + row.getPlayingTime()
				+ ", cdId=" + row.getCdId() + "]", row.toString());
		
		row = allTracksForCd.get(1);
		assertEquals(1, row.getCdId());
		assertEquals(2, row.getTrackId());
		assertEquals("Jaane Kyon Log Pyar", row.getTitle());
		assertEquals("Udit Narayan, Alka Yagnik", row.getAuthors());
		assertEquals("4:50", row.getPlayingTime());
		
	}
	
}
