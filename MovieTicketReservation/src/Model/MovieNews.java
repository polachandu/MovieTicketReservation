package Model;

/**
 * Created a class called MovieNews which has movie, news and newsDate.
 */

public class MovieNews {
    private String news;
    private Movie movie;
    private String newsDate;

    /**
     * Constructor constructs the MovieNews by allowing the parameters mentioned below
     * @param news
     * @param movie
     * @param newsDate
     */
    public MovieNews(String news, Movie movie, String newsDate) {
        this.news = news;
        this.movie = movie;
        this.newsDate = newsDate;
    }

    /**
     * Created a function called getNews. It returns the news
     * @param : no parameters passed
     * @return : news
     */

    public String getNews() {
        return news;
    }

    /**
     * Created a function method called setNews.It updates the news which is given in the parameter.
     * @param: news
     * @return: no return value
     */
    public void setNews(String news) {
        this.news = news;
    }

    /**
     * Created a function called getMovie. It returns the movie
     * @param : no parameters passed
     * @return : movie
     */

    public Movie getMovie() {
        return this.movie;
    }

    /**
     * Created a function method called setMovie.It updates the movie which is given in the parameter.
     * @param: movie
     * @return: no return value
     */

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    /**
     * Created a function called getNewsDate. It returns the newsDate
     * @param : no parameters passed
     * @return : newsDate
     */

    public String getNewsDate() {
        return newsDate;
    }

    /**
     * Created a function method called setNewsDate.It updates the newsDate which is given in the parameter.
     * @param: newsDate
     * @return: no return value
     */

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }
}
