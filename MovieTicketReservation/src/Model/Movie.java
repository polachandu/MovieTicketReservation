package Model;

/**
 * Created a class called Movie which has movieName, movieReleaseDate, movieCast[], movieSynopsis of string datatype.
 */
public class Movie {
    /**
     * @Param movieName - name of the movie
     * @Param movieReleaseDate - release date of the given movie
     * @Param movieCast - movie cast details
     * @Param movieSynopsis - brief description of the movie
     */
    private String movieName;
    private String movieReleaseDate;
    private String movieCast;
    private String movieSynopsis;

    /**
<<<<<<< HEAD
     * Constructor constructs the Movie by allowing the parameters mentioned below
=======
     *
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     * @param movieName
     * @param movieReleaseDate
     * @param movieCast
     * @param movieSynopsis
<<<<<<< HEAD
     */
    public Movie(String movieName, String movieReleaseDate, String[] movieCast, String movieSynopsis) {}
//=======
    /**
     * constructor takes in 4 parameters and sets the class variables to the inputted parameters
     */
    public Movie(String movieName, String movieReleaseDate, String movieCast, String movieSynopsis) {
//>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
        this.movieName = movieName;
        this.movieReleaseDate = movieReleaseDate;
        this.movieCast = movieCast;
        this.movieSynopsis = movieSynopsis;
    }

    /**
<<<<<<< HEAD
     * Created a function called getMovieName. It returns the movieName
     * @param : no parameters passed
     * @return : movieName
=======
     *
     * @return returns movie name
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public String getMovieName() {
        return movieName;
    }

    /**
<<<<<<< HEAD
     * Created a function method called setMovieName.It updates the movieName which is given in the parameter.
     * @param: movieName
     * @return: no return value
=======
     *
     * @param movieName
     * sets movie name to the inputted movieName parameter
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    /**
     * Created a function called getMovieReleaseDate. It returns the movieReleaseDate
     * @param : no parameters passed
     * @return : movieReleaseDate
     */

    /**
     *
     * @return returns movieReleaseDate
     */
    public String getMovieReleaseDate() {
        return movieReleaseDate;
    }
//<<<<<<< HEAD
    /**
     * Created a function method called setMovieReleaseDate.It updates the movieReleaseDate which is given in the parameter.
     * @param: setMovieReleaseDate
     * @return: no return value
=======

    /**
     *
     * @param movieReleaseDate
     * sets movie release date to the inputted movieReleaseDate parameter
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public void setMovieReleaseDate(String movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    /**
<<<<<<< HEAD
     * Created a function called getMovieCast. It returns the movieCast
     * @param : no parameters passed
     * @return : movieCast
     */

    public String[] getMovieCast() {}
//=======
    /* *
     * @return returns movieCast
     *
     */
    public String getMovieCast() {
//>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
       return movieCast;
    }

    /**
<<<<<<< HEAD
     * Created a function method called setMovieCast.It updates the movieCast which is given in the parameter.
     * @param: movieCast
     * @return: no return value
     */

    public void setMovieCast(String[] movieCast) {
        this.movieCast = movieCast;
    }

    /**
     * Created a function called getMovieSynopsis. It returns the movieSynopsis
     * @param : no parameters passed
     * @return : movieSynopsis
=======
     *
     * @param movieCast
     * sets movie cast info to the inputted movieCast parameter
     */
    public void setMovieCast(String movieCast) {
        this.movieCast = movieCast;
    }


    /**
     *
     * @return returns movieSynopsis
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public String getMovieSynopsis() {
        return movieSynopsis;
    }

    /**
<<<<<<< HEAD
     * Created a function method called setMovieSynopsis.It updates the movieSynopsis which is given in the parameter.
     * @param: movieSynopsis
     * @return: no return value
=======
     *
     * @param movieSynopsis
     * sets the movie synopsis details to the inputted movie synopsis parameter
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public void setMovieSynopsis(String movieSynopsis) {
        this.movieSynopsis = movieSynopsis;
    }
}

