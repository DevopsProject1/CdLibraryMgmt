package com.library.cd.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.library.cd.model.CdTrack;

@Repository
public class CdTrackDAOImpl implements CdTrackDAO {

	@Override
	public List<CdTrack> getAllTracksForCd(int cdId) {		
		switch (cdId) {
		case 1:
			return getCd1Tracks();
		case 2:
			return getCd2Tracks();
		case 3:
			return getCd3Tracks();
		case 4:
			return getCd4Tracks();
		case 5:
			return getCd5Tracks();
		default:
			return new ArrayList<CdTrack>();
		}		
	}
	
	private List<CdTrack> getCd1Tracks() {
		List<CdTrack> cd1Tracks = new ArrayList<CdTrack>();
		
		cd1Tracks.add(new CdTrack(1, "Dil Chahta Hai", "Shankar Mahadevan", "5:10"));
		cd1Tracks.add(new CdTrack(1, "Jaane Kyon Log Pyar", "Udit Narayan, Alka Yagnik", "4:50"));
		cd1Tracks.add(new CdTrack(1, "Woh Ladki Hai Kahan", "Shaan, Kavita Subrahmanyam", "5:06"));
		cd1Tracks.add(new CdTrack(1, "Kaisi Hai Ye Rut", "Srinivas", "5:28"));
		cd1Tracks.add(new CdTrack(1, "Koi Kahe Kehta Rahe", "Shankar Mahadevan, Shaan, KK", "5:47"));
		cd1Tracks.add(new CdTrack(1, "Akash'S Love Theme", "Mike Harvey", "2:11"));
		cd1Tracks.add(new CdTrack(1, "Tanhayee", "Sonu Nigam", "6:10"));
		cd1Tracks.add(new CdTrack(1, "Dil Chahta Hai(Reprise)", "Shankar Mahadevan", "4:17"));
		cd1Tracks.add(new CdTrack(1, "Rockin' Goa (Instrumental)", "", "2:03"));
		
		return cd1Tracks;
	}
	
	private List<CdTrack> getCd2Tracks() {
		List<CdTrack> cd2Tracks = new ArrayList<CdTrack>();
		
		cd2Tracks.add(new CdTrack(2, "Yeh Tara Woh Tara", "A.R. Rahman, Baby Pooja, Master Vignesh, Kids", "7:11"));
		cd2Tracks.add(new CdTrack(2, "Saanwariya Saanwariya", "A.R. Rahman", "5:17"));
		cd2Tracks.add(new CdTrack(2, "Yun Hi Chala Chal", "A.R. Rahman, Kailash Kher, Hariharan", "7:27"));
		cd2Tracks.add(new CdTrack(2, "Aahista Aahista", "A.R. Rahman, Sadhana Sargam", "6:48"));
		cd2Tracks.add(new CdTrack(2, "Yeh Jo Des Hai Tera", "A.R. Rahman", "6:27"));
		cd2Tracks.add(new CdTrack(2, "Pal Pal Hai Bhaari", "A.R. Rahman, Vijay Prakash, Ashutosh Gowarikar", "6:49"));
		cd2Tracks.add(new CdTrack(2, "Dekho Na", "A.R. Rahman, Alka Yagnik", "5:45"));
		cd2Tracks.add(new CdTrack(2, "Pal Pal Hai Bhaari (Flute)", "A.R. Rahman, Vijay Prakash, Ashutosh Gowarikar, Instrumental", "3:38"));
		cd2Tracks.add(new CdTrack(2, "Yeh Jo Des Hai Tera (Shehnai)", "A.R. Rahman, Instrumental", "3:53"));
		
		return cd2Tracks;
	}
	
	private List<CdTrack> getCd3Tracks() {
		List<CdTrack> cd3Tracks = new ArrayList<CdTrack>();
		
		cd3Tracks.add(new CdTrack(3, "Haanikaarak Bapu", "Sarwar Khan", "4:22"));
		cd3Tracks.add(new CdTrack(3, "Dhaakad", "Raftaar", "2:56"));
		cd3Tracks.add(new CdTrack(3, "Gilehriyaan", "Jonita Gandhi", "3:40"));
		cd3Tracks.add(new CdTrack(3, "Dangal", "Daler Mehndi", "4:59"));
		cd3Tracks.add(new CdTrack(3, "Naina", "Arijit Singh", "3:45"));
		cd3Tracks.add(new CdTrack(3, "Dhaakad - Aamir Khan Version", "Aamir Khan", "2:56"));
		cd3Tracks.add(new CdTrack(3, "Idiot Banna", "Jyoti Nooran, Sultana Nooran", "4:08"));
		
		return cd3Tracks;
	}
	
	private List<CdTrack> getCd4Tracks() {
		List<CdTrack> cd4Tracks = new ArrayList<CdTrack>();
		
		cd4Tracks.add(new CdTrack(4, "Phir Bhi Dil Hai Hindustani", "Udit Narayan", "4:00"));
		cd4Tracks.add(new CdTrack(4, "Banke Tera Jogi", "Alka Yagnik, Sonu Nigam", "4:43"));
		cd4Tracks.add(new CdTrack(4, "I Am the Best", "Abhijeet", "4:17"));
		cd4Tracks.add(new CdTrack(4, "Aur Kya", "Abhijeet, Alka Yagnik", "5:03"));
		cd4Tracks.add(new CdTrack(4, "Kuch To Bata", "Abhijeet, Alka Yagnik", "4:32"));
		cd4Tracks.add(new CdTrack(4, "I Am the Best - 1", "Jaspinder Narula", "4:18"));
		cd4Tracks.add(new CdTrack(4, "Vande Mataram", "Shankar Mahadevan", "4:39"));
		cd4Tracks.add(new CdTrack(4, "Aao Na Aao Na", "Jatin Pandit", "1:53"));
		
		return cd4Tracks;
	}
	
	private List<CdTrack> getCd5Tracks() {
		List<CdTrack> cd5Tracks = new ArrayList<CdTrack>();
		
		cd5Tracks.add(new CdTrack(5, "Ghanan Ghanan", "Sukhwinder Singh, Sehar, Shankar Mahadevan, Shaan, Udit Narayan, A.R. Rahman, Alka Yagnik", "6:11"));
		cd5Tracks.add(new CdTrack(5, "Mitwa", "Sukhwinder Singh, Srinivas, Udit Narayan, A.R. Rahman, Alka Yagnik", "6:46"));
		cd5Tracks.add(new CdTrack(5, "Radha Kaise Na Jale", "Asha Bhosle, Udit Narayan, Vaishali Samant, A.R. Rahman", "5:36"));
		cd5Tracks.add(new CdTrack(5, "O Rey Chhori", "Vasundhara Das, Udit Narayan, A.R. Rahman, Alka Yagnik", "5:59"));
		cd5Tracks.add(new CdTrack(5, "Chale Chalo", "Srinivas, A.R. Rahman", "6:40"));
		cd5Tracks.add(new CdTrack(5, "Waltz for a Romance (In 'A' Major)", "A.R. Rahman", "2:28"));
		cd5Tracks.add(new CdTrack(5, "O Paalanhaare", "Lata Mangeshkar, Udit Narayan, A.R. Rahman", "5:18"));
		cd5Tracks.add(new CdTrack(5, "Lagaan..... Once Upon a Time in India", "A.R. Rahman, Anuradha Sriram", "4:11"));
		
		return cd5Tracks;
	}
}
