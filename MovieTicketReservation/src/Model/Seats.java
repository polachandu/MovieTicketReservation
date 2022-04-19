package Model;
/**
 * Created a class called Seats which has seatNumber,seatLocation.
 */
public class Seats {

    /**
     * @Param seatNumber - contains seat number of a given seat
     * @Param seatLocation - contains seat location of a given seat in the theater
     */
    private int seatNumber;
    private String seatLocation;

    /**
<<<<<<< HEAD
     * Constructor constructs the Seats by allowing the parameters mentioned below
     * @param seatNumber
     * @param seatLocation
=======
     *
     * @param seatNumber
     * @param seatLocation
     *
     * constructor takes in seatNumber and seatLocation and sets the 2 class variables
     * to the inputted parameters
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public Seats(int seatNumber, String seatLocation) {
        this.seatNumber = seatNumber;
        this.seatLocation = seatLocation;
    }
//<<<<<<< HEAD
    /**
     * Created a function called getSeatLocation. It returns the seatLocation
     * @param : no parameters passed
     * @return : seatLocation
=======

    /**
     *
     * @return returns the seatNumber
     */
    public int getSeatNumber() {
        return seatNumber;
    }

    /**
     *
     * @param seatNumber
     * takes in seatNumber as a parameter and sets it to the variable seatNumber
     */
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     *
     * @return returns the seatLocation
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public String getSeatLocation() {
        return seatLocation;
    }
//<<<<<<< HEAD
    /**
     * Created a function method called setSeatLocation.It updates the seatLocation which is given in the parameter.
     * @param: seatLocation
     * @return: no return value
=======

    /**
     *
     * @param seatLocation
     * takes in seatLocation as a parameter and sets it to the variable seatLocation of this class
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public void setSeatLocation(String seatLocation) {
        this.seatLocation = seatLocation;
    }
}
