DROP TABLE IF EXISTS CdTrack;

DROP TABLE IF EXISTS CD;

CREATE TABLE CD (
   id			INT		NOT NULL AUTO_INCREMENT,
   title		VARCHAR(100)	NOT NULL,
   artists		VARCHAR(100)	NOT NULL,
   yearOfRelease	INT		NOT NULL,
   numberOfTracks	INT		NOT NULL,
   totalPlayingTime	VARCHAR(5)	NOT NULL,

   PRIMARY KEY (id)
) ;

INSERT INTO CD (id,title,artists,yearOfRelease,numberOfTracks,totalPlayingTime) VALUES (1, "Dil Chahta Hai", "Shankar-Ehsaan-Loy", 2001, 9, "41:02");
INSERT INTO CD (id,title,artists,yearOfRelease,numberOfTracks,totalPlayingTime) VALUES (2, "Swades", "A.R. Rahman", 2004, 9, "53:15");
INSERT INTO CD (id,title,artists,yearOfRelease,numberOfTracks,totalPlayingTime) VALUES (3, "Dangal", "Pritam Chakraborty", 2016, 7, "26:46");
INSERT INTO CD (id,title,artists,yearOfRelease,numberOfTracks,totalPlayingTime) VALUES (4, "Phir Bhi Dil Hai Hindustani", "Jatin-Lalit", 1999, 8, "33:25");
INSERT INTO CD (id,title,artists,yearOfRelease,numberOfTracks,totalPlayingTime) VALUES (5, "Lagaan", "A.R. Rahman", 2001, 8, "43:09");

CREATE TABLE CdTrack (
   trackId		INT		NOT NULL AUTO_INCREMENT,
   title		VARCHAR(100)	NOT NULL,
   authors		VARCHAR(100)	NOT NULL,
   playingTime		VARCHAR(5)	NOT NULL,
   cdId			INT,

   PRIMARY KEY (trackId),
   FOREIGN KEY (cdId)   REFERENCES CD(id)
) ;

INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (1, "Dil Chahta Hai", "Shankar Mahadevan", "5:10", 1);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (2, "Jaane Kyon Log Pyar", "Udit Narayan, Alka Yagnik", "4:50", 1);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (3, "Woh Ladki Hai Kahan", "Shaan, Kavita Subrahmanyam", "5:06", 1);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (4, "Kaisi Hai Ye Rut", "Srinivas", "5:28", 1);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (5, "Koi Kahe Kehta Rahe", "Shankar Mahadevan, Shaan, KK", "5:47", 1);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (6, "Akash'S Love Theme", "Mike Harvey", "2:11", 1);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (7, "Tanhayee", "Sonu Nigam", "6:10", 1);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (8, "Dil Chahta Hai(Reprise)", "Shankar Mahadevan", "4:17", 1);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (9, "Rockin' Goa (Instrumental)", "", "2:03", 1);

INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (10, "Yeh Tara Woh Tara", "A.R. Rahman, Baby Pooja, Master Vignesh, Kids", "7:11", 2);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (11, "Saanwariya Saanwariya", "A.R. Rahman", "5:17", 2);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (12, "Yun Hi Chala Chal", "A.R. Rahman, Kailash Kher, Hariharan", "7:27", 2);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (13, "Aahista Aahista", "A.R. Rahman, Sadhana Sargam", "6:48", 2);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (14, "Yeh Jo Des Hai Tera", "A.R. Rahman", "6:27", 2);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (15, "Pal Pal Hai Bhaari", "A.R. Rahman, Vijay Prakash, Ashutosh Gowarikar", "6:49", 2);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (16, "Dekho Na", "A.R. Rahman, Alka Yagnik", "5:45", 2);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (17, "Pal Pal Hai Bhaari (Flute)", "A.R. Rahman, Vijay Prakash, Ashutosh Gowarikar, Instrumental", "3:38", 2);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (18, "Yeh Jo Des Hai Tera (Shehnai)", "A.R. Rahman, Instrumental", "3:53", 2);

INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (19, "Haanikaarak Bapu", "Sarwar Khan", "4:22", 3);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (20, "Dhaakad", "Raftaar", "2:56", 3);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (21, "Gilehriyaan", "Jonita Gandhi", "3:40", 3);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (22, "Dangal", "Daler Mehndi", "4:59", 3);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (23, "Naina", "Arijit Singh", "3:45", 3);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (24, "Dhaakad - Aamir Khan Version", "Aamir Khan", "2:56", 3);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (25, "Idiot Banna", "Jyoti Nooran, Sultana Nooran", "4:08", 3);

INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (26, "Phir Bhi Dil Hai Hindustani", "Udit Narayan", "4:00", 4);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (27, "Banke Tera Jogi", "Alka Yagnik, Sonu Nigam", "4:43", 4);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (28, "I Am the Best", "Abhijeet", "4:17", 4);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (29, "Aur Kya", "Abhijeet, Alka Yagnik", "5:03", 4);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (30, "Kuch To Bata", "Abhijeet, Alka Yagnik", "4:32", 4);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (31, "I Am the Best - 1", "Jaspinder Narula", "4:18", 4);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (32, "Vande Mataram", "Shankar Mahadevan", "4:39", 4);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (33, "Aao Na Aao Na", "Jatin Pandit", "1:53", 4);

INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (34, "Ghanan Ghanan", "Sukhwinder Singh, Sehar, Shankar Mahadevan, Shaan, Udit Narayan, A.R. Rahman, Alka Yagnik", "6:11", 5);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (35, "Mitwa", "Sukhwinder Singh, Srinivas, Udit Narayan, A.R. Rahman, Alka Yagnik", "6:46", 5);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (36, "Radha Kaise Na Jale", "Asha Bhosle, Udit Narayan, Vaishali Samant, A.R. Rahman", "5:36", 5);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (37, "O Rey Chhori", "Vasundhara Das, Udit Narayan, A.R. Rahman, Alka Yagnik", "5:59", 5);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (38, "Chale Chalo", "Srinivas, A.R. Rahman", "6:40", 5);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (39, "Waltz for a Romance (In 'A' Major)", "A.R. Rahman", "2:28", 5);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (40, "O Paalanhaare", "Lata Mangeshkar, Udit Narayan, A.R. Rahman", "5:18", 5);
INSERT INTO CdTrack (trackId,title,authors,playingTime,cdId) VALUES (41, "Lagaan..... Once Upon a Time in India", "A.R. Rahman, Anuradha Sriram", "4:11", 5);