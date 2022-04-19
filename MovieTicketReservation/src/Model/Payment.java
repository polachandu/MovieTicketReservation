package Model;

/**
 * Created a class called Payment which has email, ticket, receipt.
 */
public class Payment {
    private String email;
    private Ticket ticket;
    private Receipt receipt;

    /**
     * Constructor constructs the Payment by allowing the parameters mentioned below
     * @param email
     * @param ticket
     * @param receipt
     */
    public Payment(String email, Ticket ticket, Receipt receipt) {
        this.email = email;
        this.ticket = ticket;
        this.receipt = receipt;
    }

    /**
     * Created a function called getEmail. It returns the email
     * @param : no parameters passed
     * @return : email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Created a function method called setEmail.It updates the email which is given in the parameter.
     * @param: email
     * @return: no return value
     */

    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Created a function called getTicket. It returns the ticket
     * @param : no parameters passed
     * @return : ticket
     */
    public Ticket getTicket() {
        return ticket;
    }
    /**
     * Created a function method called setTicket.It updates the ticket which is given in the parameter.
     * @param: ticket
     * @return: no return value
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    /**
     * Created a function called getReceipt. It returns the receipt
     * @param : no parameters passed
     * @return : receipt
     */
    public Receipt getReceipt() {
        return receipt;
    }

    /**
     * Created a function method called setReceipt.It updates the receipt which is given in the parameter.
     * @param: receipt
     * @return: no return value
     */
    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }


}
