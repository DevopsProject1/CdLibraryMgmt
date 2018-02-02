package com.library.cd.service;

import java.util.List;

import com.library.cd.model.CD;
import com.library.cd.model.CdTrack;

public interface CdLibraryManager {
	public List<CD> getAllCds();

	public List<CdTrack> getAllTracksForCd(int cdId);
}
