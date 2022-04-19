package Repository;

import Controller.DBController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 * Created a class called SeatsDB where it connects the SEAT Database
 */
public class SeatsDB {
    /**
     * @Param db - a Singleton database Controller object meant to be sustained throughout the application
     * @Param c1 - a static Connection object used throughout this class and connects to local MySQL Database
     * @Param p1, p2, p3 - Few prepared statements used in this class to make SQL queries
     * @Param r1, r2, r3 - Few Result set objects used in this class to fetch data from SQL queries
     * @Param seatLocation - an Array list of seat locations containing all the different seats tied to a seatID
     * @Param seatNumber - a counter variable that counts how many movies are there in this theater
     *
     */
    private static DBController db = DBController.getDbController();
    private static Connection c1 = db.getMyConnection();
    private static PreparedStatement p1, p2, p3, p4;
    private static ResultSet r1, r2, r3, r4;
    private static int rows, cols;
    private static ArrayList seatLocation, seatNumber;
    /**
     * Created a function called getRows. It returns the rows
     * @param : no parameters passed
     * @return : rows
     */
    public static int getRows() {
        return rows;
    }
    /**
     * Created a function called getCols. It returns the cols
     * @param : no parameters passed
     * @return : cols
     */
    public static int getCols() {
        return cols;
    }
//<<<<<<< HEAD
    /**
     * Created a function called getSeatLocation. It returns the seatLocation
     * @param : no parameters passed
     * @return : seatLocation
=======

    /**
     *
     * @return - returns the seatLocation Static Arraylist variable
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public static ArrayList getSeatLocation() {
        return seatLocation;
    }
    /**
     * Created a function called getSeatNumber. It returns the seatNumber
     * @param : no parameters passed
     * @return : seatNumber
     */
    public static ArrayList getSeatNumber() {
        return seatNumber;
    }
    /**
     * Created a function called getSeatLocationAndNumberCount. It gets the seat location and number count from database.
     * @param : seatIDs
     * @return : no return value
     */

    public static void getSeatLocationAndNumberCount(ArrayList seatIDs) {
        rows = 0;
        cols = 0;
        //MySQL query for selecting the seatLocation
        String query = "SELECT COUNT( DISTINCT seatLocation) FROM SEAT WHERE seatID = ? AND seatAvailable = ?;";
        //MySQL query for selecting the seatNumber
        String query2 = "SELECT COUNT( DISTINCT seatNumber) FROM SEAT WHERE seatID = ? AND seatAvailable = ?;";
        for (int i = 0; i < seatIDs.size(); i++) {
            //preparing and executing the queriers.
            try {
                p1 = c1.prepareStatement(query);
                p1.setInt(1, (int) seatIDs.get(i));
                p1.setInt(2, 0);
                p2 = c1.prepareStatement(query2);
                p2.setInt(1, (int) seatIDs.get(i));
                p2.setInt(2, 0);
                r1 = p1.executeQuery();
                r2 = p2.executeQuery();
                if (r1.next() == false) {
                    throw new Exception("No seats Found");
                } else {
                    do {
//                        rows += Integer.parseInt(r1.getString(1));
//                        System.out.print(r1.getString(1));
                    }
                    while (r1.next());
                }
                if (r2.next() == false) {
                    throw new Exception("Sorry, could not find that animal");
                } else {
                    do {
//                        cols += Integer.parseInt(r2.getString(1));
//                        System.out.println(r2.getString(1));
                    }
                    while (r2.next());
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }
//<<<<<<< HEAD
    /**
     * Created a function called getSeatsAndLocations.
     * @param : no parameters passed
     * @return : no return value
     */
    public static void getSeatsAndLocations() {
        String query = "SELECT DISTINCT seatLocation FROM SEAT;";
        String query2 = "SELECT DISTINCT seatNumber FROM SEAT;";
        seatLocation = new ArrayList();
        seatNumber = new ArrayList();
        try {
            p3 = c1.prepareStatement(query);
            p4 = c1.prepareStatement(query2);
            r3 = p3.executeQuery();
            r4 = p4.executeQuery();
            if (r3.next() == false) {
                throw new Exception("Sorry, no seats found");
            } else {
                do {
                    seatLocation.add(r3.getString("seatLocation"));

                }
                while (r3.next());
            }
            if (r4.next() == false) {
                throw new Exception("Sorry, no seats found");
            } else {
                do {
                    seatNumber.add(r4.getString("seatNumber"));
                }
                while (r4.next());
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    /**
     * Created a function called getMovieName.
     * @param : seatIDs
     * @return : no return value
=======

    /**
     *
     * @param seatIDs - takes in an ArrayList of seatIDs which are then used to fetch all the location and number of each seatID.
     *                The function then appends these seat location and number values to the seatLocation Static Arraylist
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public static void getSeatsAndLocations(ArrayList seatIDs) {
//        String query = "SELECT DISTINCT seatLocation FROM SEAT WHERE seatID = ? AND seatAvailable = ?;";
//        String query2 = "SELECT seatNumber FROM SEAT WHERE seatID = ? AND " +
//                "seatLocation = ? AND seatAvailable = ?;";
        String q1 = "SELECT seatLocation, seatNumber FROM SEAT WHERE seatID = ? AND seatAvailable = ?";

        seatLocation = new ArrayList();
        seatNumber = new ArrayList();

        for (int i = 0; i < seatIDs.size(); i++) {
            try {
                p3 = c1.prepareStatement(q1);
                p3.setInt(1, (int) seatIDs.get(i));
                p3.setInt(2, 0);
                r3 = p3.executeQuery();
                if (r3.next() == false) {
                    System.out.println("Sorry, no seats found");
                } else {
                    String seatPos = r3.getString("seatLocation") + r3.getInt("seatNumber");
                    seatLocation.add(seatPos);
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }

        System.out.println("Printing combined seat locations");
        for (int i = 0; i < seatLocation.size(); i++) {
            System.out.print(i + " --> ");
            System.out.println(seatLocation.get(i));
        }

    }
}
