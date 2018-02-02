package com.library.cd.model;

public class CdTrack {
	private int cdId;
	private String title;
	private String authors;
	private String playingTime;
	
	public CdTrack(int cdId, String title, String authors, String playingTime) {
		super();
		this.cdId = cdId;
		this.title = title;
		this.authors = authors;
		this.playingTime = playingTime;
	}

	public int getCdId() {
		return cdId;
	}

	public void setCdId(int cdId) {
		this.cdId = cdId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(String playingTime) {
		this.playingTime = playingTime;
	}

}
