package Model;

public class Theater {
    private String theaterName;
    private String theaterLocation;
    private TheaterScreens screens[];
    private String theaterPhoneNumber;
    private String theaterMoviesPlaying[];

    public Theater(String theaterName,
                   String theaterLocation,
                   String theaterPhoneNumber,
                   String[] theaterMoviesPlaying,
                   TheaterScreens[] screens) {
        this.theaterName = theaterName;
        this.theaterLocation = theaterLocation;
        this.theaterPhoneNumber = theaterPhoneNumber;
        this.theaterMoviesPlaying = theaterMoviesPlaying;
        this.screens = screens;
    }

    public TheaterScreens[] getScreens() {
        return screens;
    }

    public void setScreens(TheaterScreens[] screens) {
        this.screens = screens;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getTheaterLocation() {
        return theaterLocation;
    }

    public void setTheaterLocation(String theaterLocation) {
        this.theaterLocation = theaterLocation;
    }

    public String getTheaterPhoneNumber() {
        return theaterPhoneNumber;
    }

    public void setTheaterPhoneNumber(String theaterPhoneNumber) {
        this.theaterPhoneNumber = theaterPhoneNumber;
    }

    public String[] getTheaterMoviesPlaying() {
        return theaterMoviesPlaying;
    }

    public void setTheaterMoviesPlaying(String[] theaterMoviesPlaying) {
        this.theaterMoviesPlaying = theaterMoviesPlaying;
    }
}
