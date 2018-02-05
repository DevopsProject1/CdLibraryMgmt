package com.library.cd.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.View;

import com.library.cd.model.CD;
import com.library.cd.model.CdTrack;
import com.library.cd.service.CdLibraryManager;

public class CdLibraryControllerTest {
	
	@InjectMocks
	private CdLibraryController cdLibraryController;
	
	@Mock
	private CdLibraryManager cdLibraryManager;
	
	@Mock
	View mockView;
	
	MockMvc mockMvc;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(cdLibraryController)
				.setSingleView(mockView).build();
	}
	
	@Test
	public void testGetAllCds() throws Exception {
		List<CD> allCds = Arrays.asList(new CD());
		when(cdLibraryManager.getAllCds()).thenReturn(allCds);
		
		mockMvc.perform(get("/cdLibrary/allCds"))
					.andExpect(status().isOk())
					.andExpect(model().attribute("cdList", allCds))
					.andExpect(view().name("CdListDisplay"));
		
	}
	
	@Test
	public void testGetAllTracks() throws Exception {
		List<CdTrack> allTracks = Arrays.asList(new CdTrack());
		when(cdLibraryManager.getAllTracksForCd(1)).thenReturn(allTracks);
		
		mockMvc.perform(get("/cdTracks/1"))
		.andExpect(status().isOk())
		.andExpect(model().attribute("cdTracks", allTracks))
		.andExpect(view().name("CdTracksDisplay"));
	}
}
