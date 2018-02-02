package com.library.cd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.cd.dao.CdDAO;
import com.library.cd.dao.CdTrackDAO;
import com.library.cd.model.CD;
import com.library.cd.model.CdTrack;

@Service
public class CdLibraryManagerImpl implements CdLibraryManager {

	@Autowired
	CdDAO cdDAO;

	@Autowired
	CdTrackDAO cdTrackDAO;

	@Override
	public List<CD> getAllCds() {
		return cdDAO.getAllCds();
	}

	@Override
	public List<CdTrack> getAllTracksForCd(int cdId) {
		return cdTrackDAO.getAllTracksForCd(cdId);
	}

}
