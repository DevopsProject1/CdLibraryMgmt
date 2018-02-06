package com.library.cd.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.cd.dao.CdDAO;
import com.library.cd.dao.CdDAOImpl;
import com.library.cd.dao.CdTrackDAO;
import com.library.cd.model.CD;
import com.library.cd.model.CdTrack;

@Service
public class CdLibraryManagerImpl implements CdLibraryManager {
	
	private static final Logger logger = LoggerFactory.getLogger(CdDAOImpl.class);

	@Autowired
	CdDAO cdDAO;

	@Autowired
	CdTrackDAO cdTrackDAO;

	public List<CD> getAllCds() {
		logger.debug("Inside CdLibraryManagerImpl getAllCds");
		
		return cdDAO.getAllCds();
	}

	public List<CdTrack> getAllTracksForCd(int cdId) {
		logger.debug("Inside CdLibraryManagerImpl getAllTracksForCd");
		
		return cdTrackDAO.getAllTracksForCd(cdId);
	}

}
