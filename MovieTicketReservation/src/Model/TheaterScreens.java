package Model;
/**
 * Created a class called TheaterScreens which has screenNumber,seats,showtimes.
 */
public class TheaterScreens {
    private int screenNumber;
    private Seats seats[];
    private ShowTime showtimes[];
    /**
     * Created a function called getSeats. It returns the seats
     * @param : no parameters passed
     * @return : seats
     */

    public Seats[] getSeats() {
        return seats;
    }
    /**
     * Created a function method called setSeats.It updates the seats which is given in the parameter.
     * @param: seats
     * @return: no return value
     */
    public void setSeats(Seats[] seats) {
        this.seats = seats;
    }

    /**
     * Constructor constructs the TheaterScreens by allowing the parameters mentioned below
     * @param screenNumber
     * @param seats
     */
    public TheaterScreens(int screenNumber, Seats seats[]) {
        this.screenNumber = screenNumber;
        this.seats = seats;
    }
    /**
     * Created a function called getScreenNumber. It returns the screenNumber
     * @param : no parameters passed
     * @return : screenNumber
     */
    public int getScreenNumber() {
        return screenNumber;
    }
    /**
     * Created a function method called setScreenNumber.It updates the screenNumber which is given in the parameter.
     * @param: screenNumber
     * @return: no return value
     */
    public void setScreenNumber(int screenNumber) {
        this.screenNumber = screenNumber;
    }
}
