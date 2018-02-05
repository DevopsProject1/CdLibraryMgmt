package com.library.cd.service;

import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.library.cd.dao.CdDAO;
import com.library.cd.dao.CdTrackDAO;
import com.library.cd.model.CD;
import com.library.cd.model.CdTrack;

@RunWith(MockitoJUnitRunner.class)
public class CdLibraryManagerTest {
	
	@InjectMocks
	private CdLibraryManagerImpl cdLibraryManager;
	
	@Mock
	private CdDAO cdDAO;
	
	@Mock
	private CdTrackDAO cdTrackDAO;
		
	@Test
	public void testGetAllCds() {
		when(cdDAO.getAllCds())
			.thenReturn(Arrays.asList(new CD()));
		
		assertNotEquals(0, cdDAO.getAllCds().size());
	}
	
	@Test
	public void testGetAllTracksForCd() {
		when(cdTrackDAO.getAllTracksForCd(1))
			.thenReturn(Arrays.asList(new CdTrack()));
		
		assertNotEquals(0, cdTrackDAO.getAllTracksForCd(1).size());
	}

}
