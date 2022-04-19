package Repository;

import Controller.DBController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MovieDB {
    /**
     * @Param db - a Singleton database Controller object meant to be sustained throughout the application
     * @Param c1 - a static Connection object used throughout this class and connects to local MySQL Database
     * @Param p1, p2, p3, p4 - Few prepared statements used in this class to make SQL queries
     * @Param r1, r2, r3, r4 - Few Result set objects used in this class to fetch data from SQL queries
     * @Param movies - an Array list of movies containing all the movies that are at this given theater
     * @Param movieCount - a counter variable that counts how many movies are there in this theater
     *
     */
    private static DBController db = DBController.getDbController();
    private static Connection c1 = db.getMyConnection();
    private static PreparedStatement p1, p2, p3, p4;
    private static ResultSet r1, r2, r3, r4;
    private static ArrayList movies;
    private static int movieCount;

    /**
     *
     * @return - returns the static ArrayList of movies
     */
    public static ArrayList getMovies() {
        return movies;
    }

    /**
     *
     * @return - returns the movieCount
     */
    public static int getMovieCount() {
        return movieCount;
    }

    /**
     * Runs a SQL query to count the number of movies in the database at this theater.
     * It then sets the static variable movieCount to the value returned by the SQL query.
     */
    public void getMoviesCount() {
        String query = "SELECT COUNT(movieName) FROM MOVIE;";
        try {
            p2 = c1.prepareStatement(query);
            r2 = p2.executeQuery();
            if (r2.next() == false) {
                throw new Exception("No movie found");
            } else {
                do {
                    movieCount = Integer.parseInt(r2.getString(1));
                }
                while (r2.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    /**
     * Runs a SQL query to find the list of movies that exist in the database at this theater
     * It then appends each movie to the Static movies variable of this class
     */
    public void getMoviesList() {
        String query = "SELECT movieName FROM MOVIE;";
        movies = new ArrayList();
        try {
            p1 = c1.prepareStatement(query);
            r1 = p1.executeQuery();
            if (r1.next() == false) {
                throw new Exception("No Movies found");
            } else {
                do {
                    movies.add(r1.getString("movieName"));
                }
                while (r1.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    /**
     *
     * @param movie - takes in a movie name to search for in the database
     * @return - returns the movie name if movie is found or else returns 'Movie Not Found' string
     */
    public String findMovie(String movie) {
        String query = "SELECT movieID, movieName FROM MOVIE WHERE movieName = ?;";
        try {
            p3 = c1.prepareStatement(query);
            p3.setString(1, movie);
            r3 = p3.executeQuery();
            if (r3.next() == false) {
                return "Movie Not Found";
            } else {
                return r3.getString("movieName");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return "Movie Not Found";
    }

    /**
     *
     * @param movie - Takes in a movie name
     * @return - returns the movieID of the movie name passed as the parameter or else returns 0
     */
    public int getMovieID(String movie) {
        String query = "SELECT movieID FROM MOVIE WHERE movieName = ?;";
        try {
            p4 = c1.prepareStatement(query);
            p4.setString(1, movie);
            r4 = p4.executeQuery();
            if (r4.next() == false) {
                return 0;
            } else {
                return r4.getInt("movieID");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return 0;
    }
}
