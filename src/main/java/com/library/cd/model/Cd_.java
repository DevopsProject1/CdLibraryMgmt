package com.library.cd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CD")
public class Cd_ {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String artists;
	private int yearOfRelease;
	private int numberOfTracks;
	private String totalPlayingTime;
	
	public Cd_() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtists() {
		return artists;
	}

	public void setArtists(String artists) {
		this.artists = artists;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	public String getTotalPlayingTime() {
		return totalPlayingTime;
	}

	public void setTotalPlayingTime(String totalPlayingTime) {
		this.totalPlayingTime = totalPlayingTime;
	}

	@Override
	public String toString() {
		return "Cd [id=" + id + ", title=" + title + ", artists=" + artists
				+ ", yearOfRelease=" + yearOfRelease + ", numberOfTracks="
				+ numberOfTracks + ", totalPlayingTime=" + totalPlayingTime
				+ "]";
	}

}
