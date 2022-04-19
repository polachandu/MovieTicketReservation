package Model;

/**
<<<<<<< HEAD
 * Created a class called RegisteredUser which has username,password,paymentInfo,emailAddress,registrationDate.
=======
 * Model class for a registered user.
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
 */
public class RegisteredUser {
    private String username;
    private String password;
    private String paymentInfo;
    private String emailAddress;
    private String registrationDate;

    /**
<<<<<<< HEAD
     * Created a empty constructor
=======
     * Default constructor.
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public RegisteredUser() {

    }
//<<<<<<< HEAD

    /**
     * Constructor constructs the RegisteredUser by allowing the parameters mentioned below
     * @param username
     * @param password
     * @param paymentInfo
     * @param emailAddress
     * @param registrationDate
=======
    
    /**
     * All parameters constructor.
     * 
     * @param username the username.
     * @param password the password.
     * @param paymentInfo the credit card number.
     * @param emailAddress the email address.
     * @param registrationDate the registration date.
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
     */
    public RegisteredUser(String username, String password, String paymentInfo, String emailAddress, String registrationDate) {
        this.username = username;
        this.password = password;
        this.paymentInfo = paymentInfo;
        this.emailAddress = emailAddress;
        this.registrationDate = registrationDate;
    }
//<<<<<<< HEAD
    /**
     * Created a function called getUsername. It returns the username
     * @param : no parameters passed
     * @return : username
     */
    public String getUsername() {
//=======

    // Getters and setters.
	public String getUsername() {
//>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
        return username;
    }
    /**
     * Created a function method called setUsername.It updates the username which is given in the parameter.
     * @param: username
     * @return: no return value
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Created a function called getPassword. It returns the password
     * @param : no parameters passed
     * @return : password
     */
    public String getPassword() {
        return password;
    }
    /**
     * Created a function method called setPassword.It updates the password which is given in the parameter.
     * @param: password
     * @return: no return value
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Created a function called getPaymentInfo. It returns the paymentInfo
     * @param : no parameters passed
     * @return : paymentInfo
     */
    public String getPaymentInfo() {
        return paymentInfo;
    }
    /**
     * Created a function method called setPaymentInfo.It updates the paymentInfo which is given in the parameter.
     * @param: paymentInfo
     * @return: no return value
     */
    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }
    /**
     * Created a function called getEmailAddress. It returns the emailAddress
     * @param : no parameters passed
     * @return : emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }
    /**
     * Created a function method called setEmailAddress.It updates the emailAddress which is given in the parameter.
     * @param: emailAddress
     * @return: no return value
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    /**
     * Created a function called getRegistrationDate. It returns the registrationDate
     * @param : no parameters passed
     * @return : registrationDate
     */
    public String getRegistrationDate() {
        return registrationDate;
    }
    /**
     * Created a function method called setRegistrationDate.It updates the registrationDate which is given in the parameter.
     * @param: registrationDate
     * @return: no return value
     */
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }
}
