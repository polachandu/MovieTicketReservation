package Model;

/**
 * Created a class called Receipt which has transactionDate,movieName,theaterScreen,theaterLocation,paymentMethod,cardNumber,paymentAmount.
 */
public class Receipt {
    private String transactionDate;
    private String movieName;
    private String theaterScreen;
    private String theaterLocation;
    private String paymentMethod;
    private int cardNumber;
    private int paymentAmount;

    /**
     * Created a function called getTransactionDate. It returns the transactionDate
     * @param : no parameters passed
     * @return : transactionDate
     */
    public String getTransactionDate() {
        return transactionDate;
    }
    /**
     * Created a function method called setTransactionDate.It updates the transactionDate which is given in the parameter.
     * @param: transactionDate
     * @return: no return value
     */
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
    /**
     * Created a function called getMovieName. It returns the movieName
     * @param : no parameters passed
     * @return : movieName
     */
    public String getMovieName() {
        return movieName;
    }
    /**
     * Created a function method called setMovieName.It updates the movieName which is given in the parameter.
     * @param: movieName
     * @return: no return value
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    /**
     * Created a function called getTheaterScreen. It returns the theaterScreen
     * @param : no parameters passed
     * @return : theaterScreen
     */
    public String getTheaterScreen() {
        return theaterScreen;
    }
    /**
     * Created a function method called setTheaterScreen.It updates the theaterScreen which is given in the parameter.
     * @param: theaterScreen
     * @return: no return value
     */
    public void setTheaterScreen(String theaterScreen) {
        this.theaterScreen = theaterScreen;
    }
    /**
     * Created a function called getTheaterLocation. It returns the theaterLocation
     * @param : no parameters passed
     * @return : theaterLocation
     */
    public String getTheaterLocation() {
        return theaterLocation;
    }
    /**
     * Created a function method called setTheaterLocation.It updates the theaterLocation which is given in the parameter.
     * @param: theaterLocation
     * @return: no return value
     */
    public void setTheaterLocation(String theaterLocation) {
        this.theaterLocation = theaterLocation;
    }
    /**
     * Created a function called getPaymentMethod. It returns the paymentMethod
     * @param : no parameters passed
     * @return : paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }
    /**
     * Created a function method called setPaymentMethod.It updates the paymentMethod which is given in the parameter.
     * @param: paymentMethod
     * @return: no return value
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    /**
     * Created a function called getCardNumber. It returns the cardNumber
     * @param : no parameters passed
     * @return : cardNumber
     */
    public int getCardNumber() {
        return cardNumber;
    }
    /**
     * Created a function method called setCardNumber.It updates the cardNumber which is given in the parameter.
     * @param: cardNumber
     * @return: no return value
     */
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    /**
     * Created a function called getPaymentAmount. It returns the paymentAmount
     * @param : no parameters passed
     * @return : paymentAmount
     */
    public int getPaymentAmount() {
        return paymentAmount;
    }
    /**
     * Created a function method called setPaymentAmount.It updates the paymentAmount which is given in the parameter.
     * @param: paymentAmount
     * @return: no return value
     */
    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * Constructor constructs the Receipt by allowing the parameters mentioned below
     * @param transactionDate
     * @param movieName
     * @param theaterScreen
     * @param theaterLocation
     * @param paymentMethod
     * @param cardNumber
     * @param paymentAmount
     */
    public Receipt(String transactionDate, String movieName, String theaterScreen, String theaterLocation, String paymentMethod, int cardNumber, int paymentAmount) {
        this.transactionDate = transactionDate;
        this.movieName = movieName;
        this.theaterScreen = theaterScreen;
        this.theaterLocation = theaterLocation;
        this.paymentMethod = paymentMethod;
        this.cardNumber = cardNumber;
        this.paymentAmount = paymentAmount;
    }
}
