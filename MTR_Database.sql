DROP DATABASE IF EXISTS TICKETRESERVATION;
CREATE DATABASE TICKETRESERVATION;
USE TICKETRESERVATION;

SELECT username, uPassword FROM REGISTERED_USER;

DROP TABLE IF EXISTS REGISTERED_USER;
CREATE TABLE REGISTERED_USER(
    username varchar(30) not null,
    uPassword varchar(30) not null,
    paymentInfo varchar(30) not null,
    email varchar(50) not null,
    registrationDate varchar(10) not null
);

DROP TABLE IF EXISTS MOVIE;
CREATE TABLE MOVIE(
	movieID integer not null,
    movieName varchar(30) not null,
    movieReleaseDate varchar(30) not null,
    movieCast varchar(50) not null,
    movieSynopsis varchar(200) not null,
    primary key (movieID)
);
INSERT INTO MOVIE(movieID, movieName, movieReleaseDate, movieCast, movieSynopsis)
VALUES
(101,'The Dark Knight','July 14, 2008','Christian Bale, Michael Caine', 'Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.'),
(102,'Inception','July 16, 2010','Leonardo DiCaprio, Michael Caine', 'A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task'),
(103,'The Hangover','June 5, 2009','Bradley Cooper, Ed Helms', 'Three buddies wake up from a bachelor party in Las Vegas, with no memory of the previous night'),
(104,'Avengers Endgame','April 26, 2019','Robert Downey Jr., Chris Evans', 'With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos'' action'),
(105,'Tenet','September 3, 2020','John David Washington, Robert Pattinson', 'Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.');

DROP TABLE IF EXISTS MOVIE_UNRELEASED;
CREATE TABLE MOVIE_UNRELEASED(
	movieID integer not null,
    movieName varchar(30) not null,
    movieReleaseDate varchar(30) not null,
    movieCast varchar(100) not null,
    movieSynopsis varchar(200) not null,
    primary key (movieID)
);
INSERT INTO MOVIE_UNRELEASED(movieID, movieName, movieReleaseDate, movieCast, movieSynopsis)
VALUES
(101,'Moonfall','February 4, 2022','Halle Berry, Patrick Wilson, John Bradley, Michael Pena', ''),
(102,'The 355','January 7, 2022','Jessica Chastain, Lupita Nyong''o', ''),
(103,'Deep Water','Januar 14, 2022','Ben Affleck, Ana de Armas', ''),
(104,'Scream','January 14, 2022','Neve Campbell, Courteney Cox, David Arquetter', ''),
(105,'Deadlock','December 20, 2021','Bruce Willis', ''),
(106,'The Matrix Resurrections','December 22, 2021','Keanu Reeves, Carrie Ann Moss', '');

DROP TABLE IF EXISTS THEATER;
CREATE TABLE THEATER(
	theaterID integer not null,
    theaterName varchar(30) not null,
    theaterLocation varchar(30) not null,
    theaterPhoneNumber varchar(15) not null,
    primary key (theaterID)
);
INSERT INTO THEATER(theaterID, theaterName, theaterLocation, theaterPhoneNumber)
VALUES
(201,'SE Cineplex','Southeast Calgary','123-000-1100');

DROP TABLE IF EXISTS SCREEN;
CREATE TABLE SCREEN(
	screenID integer not null,
    screenName varchar(1) not null,
    primary key (screenID)
);
INSERT INTO SCREEN(screenID, screenName)
VALUES
(301,'A'),
(302,'B'),
(303,'C'),
(304,'D'),
(305,'E'),
(306,'F'),
(307,'G');

DROP TABLE IF EXISTS SHOWTIME;
CREATE TABLE SHOWTIME(
	showtimeID integer not null,
	showDay integer not null,
    showTime varchar(30) not null,
    screenName varchar(1) not null,
    primary key (showtimeID)
    -- foreign key (screenName) references SCREEN(screenName)
);
INSERT INTO SHOWTIME(showtimeID, showDay, showTime, screenName)
VALUES
(401,0,'10:00am','A'),
(402,1,'11:00am','B'),
(403,3,'1:30pm','B'),
(404,4,'2:00pm','C'),
(405,5,'2:30pm','D'),
(406,5,'5:00pm','E'),
(407,6,'5:00pm','F'),
(408,5,'5:30pm','G'),
(409,5,'6:30pm','B'),
(410,5,'7:00pm','C'),
(411,0,'8:00pm','D'),
(412,1,'8:30pm','A'),
(413,3,'9:30pm','G'),
(414,5,'10:30pm','A'),
(415,6,'10:45pm','E'),
(416,5,'10:00am','E'),
(417,5,'11:00am','A'),
(418,5,'1:30pm','C'),
(419,1,'2:00pm','D'),
(420,3,'2:30pm','E'),
(421,3,'5:00pm','F'),
(422,4,'5:00pm','G'),
(423,0,'5:30pm','A'),
(424,0,'6:30pm','B'),
(425,1,'7:00pm','C'),
(426,5,'8:00pm','D'),
(427,6,'8:30pm','E'),
(428,5,'9:30pm','G'),
(429,0,'10:30pm','F'),
(430,2,'10:45pm','C');


DROP TABLE IF EXISTS MOVIE_SHOWTIMES;
CREATE TABLE MOVIE_SHOWTIMES(
	entryID integer not null,
    movieID integer not null,
    showtimeID integer not null,
    primary key(entryID),
	foreign key (movieID) references MOVIE(movieID),
    foreign key (showtimeID) references SHOWTIME(showtimeID)
);
INSERT INTO MOVIE_SHOWTIMES(entryID, movieID, showtimeID)
VALUES
(1,101,401),
(2,101,402),
(3,101,403),
(4,101,404),
(5,101,405),
(6,102,406),
(7,102,407),
(8,102,408),
(9,102,409),
(10,102,410),
(11,103,411),
(12,103,412),
(13,103,413),
(14,103,414),
(15,103,415),
(16,104,416),
(17,104,417),
(18,104,418),
(19,104,419),
(20,104,420),
(21,105,421),
(22,105,422),
(23,105,423),
(24,105,424),
(25,105,425);

DROP TABLE IF EXISTS THEATER_SCREENS;
CREATE TABLE THEATER_SCREENS(
	entryID integer not null,
	screenID integer not null,
    theaterID integer not null,
    primary key (entryID),
    foreign key (screenID) references SCREEN(screenID),
    foreign key (theaterID) references THEATER(theaterID)
);

DROP TABLE IF EXISTS SEAT;
CREATE TABLE SEAT(
	seatID integer not null,
	seatNumber integer not null,
    seatLocation varchar(30) not null,
    seatAvailable integer not null,
    primary key (seatID)
);
INSERT INTO SEAT(seatID, seatNumber, seatLocation, seatAvailable)
VALUES
(701,1,'A',0),
(702,2,'A',0),
(703,3,'A',0),
(704,4,'A',0),
(705,5,'A',0),
(706,6,'A',0),
(707,1,'B',0),
(708,2,'B',1),
(709,3,'B',0),
(710,4,'B',0),
(711,5,'B',0),
(712,6,'B',1),
(713,1,'C',0),
(714,2,'C',0),
(715,3,'C',0),
(716,4,'C',1),
(717,5,'C',0),
(718,6,'C',0),
(719,1,'D',1),
(720,2,'D',0),
(721,3,'D',0),
(722,4,'D',0),
(723,5,'D',0),
(724,6,'D',0),
(725,1,'E',1),
(726,2,'E',0),
(727,3,'E',0),
(728,4,'E',0),
(729,5,'E',0),
(730,6,'E',0),
(731,1,'F',0),
(732,2,'F',0),
(733,3,'F',0),
(734,4,'F',0),
(735,5,'F',0),
(736,6,'F',0),
(737,1,'G',0),
(738,2,'G',0),
(739,3,'G',0),
(740,4,'G',0),
(741,5,'G',0),
(742,6,'G',0);


DROP TABLE IF EXISTS SCREEN_SEATS;
CREATE TABLE SCREEN_SEATS(
	entryID integer not null,
	screenID integer not null,
    seatID integer not null,
    primary key (entryID),
    foreign key (screenID) references SCREEN(screenID),
    foreign key (seatID) references SEAT(seatID)
);
INSERT INTO SCREEN_SEATS(entryID, screenID, seatID)
VALUES
(801,301,701),
(802,301,707),
(803,301,710),
(804,301,712),
(805,301,705),
(806,301,706),
(807,302,702),
(808,302,708),
(809,302,709),
(810,302,703),
(811,302,711),
(812,302,704),
(813,303,713),
(814,303,714),
(815,303,715),
(816,303,716),
(817,303,717),
(818,303,718),
(819,304,719),
(820,304,727),
(821,304,721),
(822,304,728),
(823,304,723),
(824,304,724),
(825,305,725),
(826,305,726),
(827,305,720),
(828,305,722),
(829,305,729),
(830,305,730),
(831,306,737),
(832,306,732),
(833,306,733),
(834,306,734),
(835,306,735),
(836,306,736),
(837,307,731),
(838,307,738),
(839,307,739),
(840,307,740),
(841,307,741),
(842,307,742);

DROP TABLE IF EXISTS MOVIE_NEWS;
CREATE TABLE MOVIE_NEWS(
	newsID integer not null,
	news varchar(100) not null,
    newsDate varchar(30) not null,
    movieID integer not null,
	primary key (newsID),
    foreign key (movieID) references MOVIE_UNRELEASED(movieID)
);
INSERT INTO MOVIE_NEWS (newsID, news, newsDate, movieID)
VALUES 
(8810,"Keanu Reeves starring Matrix releasing during Holiday season","December 1, 2021",106),
(8811,"Scream in the new years with the scariest movie yet made","November 30, 2021",104),
(8812,"Bruce Willis action thriller releasing right before christmas","December 4, 2021",105),
(8813,"Deep Water coming right after new years for a thrill","December 5, 2021",103),
(8814,"All female lead action thriller to take your breath away","November 29, 2021",102),
(8815,"Sci-Fi is where it is at, must watch Moonfall","November 25, 2021",101);


DROP TABLE IF EXISTS TICKET;
CREATE TABLE TICKET(
	ticketID integer not null,
    seatID integer not null,
    primary key (ticketID),
    foreign key (seatID) references SEAT(seatID)
);

DROP TABLE IF EXISTS PAYMENT;
CREATE TABLE PAYMENT(
	paymentID integer not null,
    amount double not null,
    primary key(paymentID)
);

DROP TABLE IF EXISTS RECEIPT;
CREATE TABLE RECEIPT(
	receiptID integer not null,
    transactionID integer not null,
    primary key (receiptID),
    foreign key (transactionID) references PAYMENT(paymentID)
);