package com.library.cd.service;

import java.util.List;

import com.library.cd.model.Cd;
import com.library.cd.model.CdTrack;

public interface CdLibraryManager {
	public List<Cd> getAllCds();

	public List<CdTrack> getAllTracksForCd(int cdId);
}
