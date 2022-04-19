package Model;
/**
 * Created a class called Ticket which has ticketID,movieName,showtime,theater.
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import Controller.DBController;
import View.CancelTicketView;

public class Ticket {
    private int ticketID;
    private String movieName;
    private ShowTime showtime;
    private Theater theater;
  
    CancelTicketView ct;

    /**
     * Constructor constructs the Ticket by allowing the parameters mentioned below
     * @param ticketID
     * @param movieName
     * @param showtime
     * @param theater
     */
    public Ticket(int ticketID, String movieName, ShowTime showtime, Theater theater) {
        this.ticketID = ticketID;
        this.movieName = movieName;
        this.showtime = showtime;
        this.theater = theater;
    }

    /**
     * Created a empty constructor
     */
	public Ticket() {
		// TODO Auto-generated constructor stub
	}
    
    public boolean cancelTicket(int ticket) {
    	DBController db = DBController.getDbController();
    	//DBController db = new DBController();    	
    	String query = "SELECT ticketID FROM TICKET WHERE ticketID = '"+ticket+"'";
    	
    	ResultSet result = db.getFromDB(query);
    	try {
			if(result.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return false;
    	
    }
    /**
     * Created a function called getTicketID. It returns the ticketID
     * @param : no parameters passed
     * @return : ticketID
     */

    public int getTicketID() {
        return ticketID;
    }
    /**
     * Created a function method called setTicketID.It updates the ticketID which is given in the parameter.
     * @param: ticketID
     * @return: no return value
     */
    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }
    /**
     * Created a function called getMovieName. It returns the movieName
     * @param : no parameters passed
     * @return : movieName
     */
    public String getMovieName() {
        return movieName;
    }
    /**
     * Created a function method called setMovieName.It updates the movieName which is given in the parameter.
     * @param: movieName
     * @return: no return value
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    /**
     * Created a function called getShowtime. It returns the showtime
     * @param : no parameters passed
     * @return : showtime
     */
    public ShowTime getShowtime() {
        return showtime;
    }
    /**
     * Created a function method called setShowtime.It updates the showtime which is given in the parameter.
     * @param: showtime
     * @return: no return value
     */
    public void setShowtime(ShowTime showtime) {
        this.showtime = showtime;
    }
    /**
     * Created a function called getTheater. It returns the theater
     * @param : no parameters passed
     * @return : theater
     */
    public Theater getTheater() {
        return theater;
    }
    /**
     * Created a function method called setTheater.It updates the theater which is given in the parameter.
     * @param: theater
     * @return: no return value
     */
    public void setTheater(Theater theater) {
        this.theater = theater;
    }


}
