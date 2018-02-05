package com.library.cd.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.Before;
import org.junit.Test;

import com.library.cd.model.CD;

public class CdDAOTest {

	private SessionFactory sessionFactory;

	private CdDAO cdDAO;

	@Before
	public void setUp() {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.addAnnotatedClass(CD.class);
		configuration.setProperty("hibernate.dialect",
				"org.hibernate.dialect.H2Dialect");
		configuration.setProperty("hibernate.connection.driver_class",
				"org.h2.Driver");
		configuration.setProperty("hibernate.connection.url",
				"jdbc:h2:mem:test");
		configuration.setProperty("hibernate.hbm2ddl.auto", "create");

		sessionFactory = configuration.buildSessionFactory();
		cdDAO = new CdDAOImpl(sessionFactory);
	}

	@Test
	public void testGetAllCds() {
		CD cd = new CD();
		cd.setId(1);
		cd.setTitle("Dil Chahta Hai");
		cd.setArtists("Shankar-Ehsaan-Loy");
		cd.setYearOfRelease(2001);
		cd.setNumberOfTracks(9);
		cd.setTotalPlayingTime("41:02");

		// storing the objects for the test in the database
		((CdDAOImpl) cdDAO).getSession().save(cd);

		List<CD> allCds = cdDAO.getAllCds();
		assertNotNull(allCds);
		assertEquals(1, allCds.size());

		CD row = allCds.get(0);
		assertEquals(1, row.getId());
		assertEquals("Dil Chahta Hai", row.getTitle());
		assertEquals("Shankar-Ehsaan-Loy", row.getArtists());
		assertEquals(2001, row.getYearOfRelease());
		assertEquals(9, row.getNumberOfTracks());
		assertEquals("41:02", row.getTotalPlayingTime());
		
		assertEquals("Cd [id=" + row.getId() + ", title=" + row.getTitle() + ", artists=" + row.getArtists()
				+ ", yearOfRelease=" + row.getYearOfRelease() + ", numberOfTracks="
				+ row.getNumberOfTracks() + ", totalPlayingTime=" + row.getTotalPlayingTime()
				+ "]", row.toString());
	}
}
