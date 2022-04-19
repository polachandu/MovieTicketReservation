/**
 * The Movie Ticket Reservation implements an application that
 * allows a user to select a movie, showtime, seats and buy a movie ticket.
 * Users can also sign up to become Registered Users in order to get priority when picking seats
 * or book tickets in advance for unreleased movies
 *
 * @author Cameron Pepper
 * @author Aastha Patel
 * @author Meet Pandya
 * @author Chandrahas Reddy
 * @version 1.0
 * @since 2021-12-08
 */


package Controller;
import View.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.RegisteredUser;

public class Controller implements ActionListener {
    private static MainView mainView;
    private static RegisteredUser theUser = new RegisteredUser();
    private static String ticketDetails = "";


    public static void main(String[] args) {
        theUser.setUsername("ZZZ");
        mainView = new MainView();
        mainView.setupMainView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static RegisteredUser getTheUser() {
        return theUser;
    }

    public static void setTheUser(RegisteredUser theUser) {
        Controller.theUser = theUser;
    }

    public static String getTicketDetails() {
        return ticketDetails;
    }

    public static void setTicketDetails(String ticketDetails) {
        Controller.ticketDetails = ticketDetails;
    }
}
