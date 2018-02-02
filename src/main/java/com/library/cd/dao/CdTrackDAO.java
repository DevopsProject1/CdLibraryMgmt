package com.library.cd.dao;

import java.util.List;

import com.library.cd.model.CdTrack;

public interface CdTrackDAO {
	public List<CdTrack> getAllTracksForCd(int cdId);
}
