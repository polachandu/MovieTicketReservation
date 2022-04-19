package Repository;

import Controller.DBController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 * Created a class called ShowTimesDB where it connects the MOVIE_SHOWTIMES Database
 */
public class ShowTimesDB {
    /**
     * @Param db - a Singleton database Controller object meant to be sustained throughout the application
     * @Param c1 - a static Connection object used throughout this class and connects to local MySQL Database
     * @Param p1, p2 - Few prepared statements used in this class to make SQL queries
     * @Param r1, r2 - Few Result set objects used in this class to fetch data from SQL queries
     * @Param showTimes - an Array list of movies containing all the showTimes tied to a given selected movie by the user
     *
     */
    private static DBController db = DBController.getDbController();
    private static Connection c1 = db.getMyConnection();
    private static PreparedStatement p1, p2;
    private static ResultSet r1, r2;
    private static ArrayList showTimes = new ArrayList();
//<<<<<<< HEAD
    private static int showTimesCount;
    /**
     * Created a function called getShowTimes. It returns the showTimes
     * @param : no parameters passed
     * @return : showTimes
=======

    /**
     *
     * @return - returns the showTimes Static Arraylist containing all the showTimes
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public static ArrayList getShowTimes() {
        return showTimes;
    }

    /**
<<<<<<< HEAD
     * Created a function called showTimeIDs. It setups according to queries given and it prepares and execute the given queries
     * related to MOVIE_SHOWTIMES database.
     * @param movieID
=======
     *
     * @param movieID - takes in a movieID
     *                It then fetches showTimeID and subsequently using that it gets the showDay, showTime and screenName
     *                for that particular movie
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public void showTimeIDs(int movieID){
        showTimes = new ArrayList();
        String query = "SELECT showtimeID FROM MOVIE_SHOWTIMES WHERE movieID = ?;";
        try {
            p2 = c1.prepareStatement(query);
            p2.setInt(1, movieID);
            r2 = p2.executeQuery();
            if (r2.next() == false) {
                throw new Exception("No Showtime Found");
            } else {
                do {
                    int sID = r2.getInt(1);
                    String query2 = "SELECT showDay, showTime, screenName FROM SHOWTIME WHERE showtimeID = ?;";
                    ArrayList individualShow = new ArrayList();
                    p1 = c1.prepareStatement(query2);
                    p1.setInt(1,sID);
                    r1 = p1.executeQuery();
                    if(r1.next() == false){
                        throw new Exception("No Showtime Found");
                    }
                    else{
                        do{
                            individualShow.add(r1.getInt(1));
                            individualShow.add(r1.getString(2));
                            individualShow.add(r1.getString(3));
                            showTimes.add(individualShow);
                            individualShow = new ArrayList();
                        }
                        while(r1.next());
                    }
                }
                while (r2.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
