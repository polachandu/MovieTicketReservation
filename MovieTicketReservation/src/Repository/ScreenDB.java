package Repository;

import Controller.DBController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ScreenDB {
    /**
     * @Param db - a Singleton database Controller object meant to be sustained throughout the application
     * @Param c1 - a static Connection object used throughout this class and connects to local MySQL Database
     * @Param p1, p2 - Few prepared statements used in this class to make SQL queries
     * @Param r1, r2 - Few Result set objects used in this class to fetch data from SQL queries
     * @Param seatIDs - an Array list of Seat IDs containing all the unique seat IDs for the given scenario
     *
     */
    private static DBController db = DBController.getDbController();
    private static Connection c1 = db.getMyConnection();
    private static PreparedStatement p1,p2;
    private static ResultSet r1,r2;
    private static ArrayList seatIDs = new ArrayList();

    /**
     *
     * @return returns the static seatIDs Arraylist
     */
    public static ArrayList getSeatIDs() {
        return seatIDs;
    }

    /**
     *
     * @param screen - takes in a Screen name as a string object
     *               For that given screen name, it finds all the Seats that are assigned to it.
     *               It then seats those seatIDs to the seatIDs static arraylist of this class
     */
    public void getScreenID(String screen){
        String query = "SELECT screenID FROM SCREEN WHERE screenName = ?;";
        int screenID = 0;
        seatIDs = new ArrayList();
        try{
            p1 = c1.prepareStatement(query);
            p1.setString(1,screen);
            r1 = p1.executeQuery();
            if(r1.next() == false){
                throw new Exception("No Seats Found");
            }
            else{
                screenID = r1.getInt("screenID");
                String query2 = "SELECT seatID FROM SCREEN_SEATS WHERE screenID = ?;";
                p2 = c1.prepareStatement(query2);
                p2.setInt(1,screenID);
                r2 = p2.executeQuery();
                if(r2.next() == false){
                    throw new Exception("No Seats Found");
                }
                else{
                    do {
                        seatIDs.add(r2.getInt("seatID"));
                    }
                    while(r2.next());
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

}
