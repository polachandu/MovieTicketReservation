package Repository;

import Controller.DBController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MovieNewsDB {
    /**
     * @Param db - a Singleton database Controller object meant to be sustained throughout the application
     * @Param c1 - a static Connection object used throughout this class and connects to local MySQL Database
     * @Param p1, p2 - Few prepared statements used in this class to make SQL queries
     * @Param r1, r2 - Few Result set objects used in this class to fetch data from SQL queries
     * @Param movieNewsList - an Array list of movieNews containing all the news content that is in the database at this theater
     * @Param newsCount - a counter variable that counts how many different news stories are there in the database
     *
     */
    private static DBController db = DBController.getDbController();
    private static Connection c1 = db.getMyConnection();
    private static PreparedStatement p1,p2;
    private static ResultSet r1,r2;
    private static ArrayList movieNewsList;
    private static int newsCount;

    /**
     *
     * @return - returns the Arraylist movieNewsList containing all the news announcement
     */
    public static ArrayList getMovieNewsList() {
        return movieNewsList;
    }

    /**
     *
     * @return - returns the Static newsCount variable
     */
    public static int getNewsCount() {
        return newsCount;
    }

    /**
     * This function finds the count of different news announcements from the Database.
     * It then sets the Static newCount variable to that value.
     */
    public void getMovieNewsCount() {
        String query = "SELECT COUNT(news) FROM MOVIE_NEWS;";
        try {
            p2 = c1.prepareStatement(query);
            r2 = p2.executeQuery();
            if (r2.next() == false) {
                throw new Exception("No movie found");
            } else {
                do {
                    newsCount = Integer.parseInt(r2.getString(1));
                }
                while (r2.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    /**
     * This function finds all the news announcements and sets each of them to the movieNewsList static variable
     */
    public void getMovieNews(){
        String query = "SELECT news FROM MOVIE_NEWS;";
        movieNewsList = new ArrayList();
        try{
            p1 = c1.prepareStatement(query);
            r1 = p1.executeQuery();
            if(r1.next() == false){
                throw new Exception("No Movie News");
            }else{
                do{
                    movieNewsList.add(r1.getString("news"));
                }
                while(r1.next());
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
