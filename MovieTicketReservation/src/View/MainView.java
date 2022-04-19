package View;

import Controller.LandingPageController;
import Controller.CancelTicketController;
import Controller.LoginPageController;
import Controller.RegistrationPageController;
import Controller.ShowTimeController;
import Controller.SeatsController;

import javax.swing.*;
import java.awt.*;

public class MainView {
    /**
     * @Param guiComponent - this static variable gives access to the GuiComponents class in order to generate different Java Swing components
     * @Param landingPageView - a static LandingPageView object
     * @Param loginPageView - a static LoginPageView object
     * @Param searchMovieView - a static SearchMovieView object
     * @Param loginPageView - a static LoginPageView object
     * @Param registrationPageView - a static RegistrationPageView object
     * @Param showTimeListView - a static ShowTimeListView object
     * @Param seatsView - a static SeatsView object
     * @Param cancelTicketPageView - a static CancelTicketPageView object
     * @Param frame - a JFrame object that will be the parent GUI component of the entire application
     * @Param appLabel - a JLabel object containing the app's main Title
     * @Param cardLayout - a CardLayout object with 10 and 10 as the horizontal and vertical gap values
     * @Param cardPanel - sets up the jPanel using card layout
     * @Param landingPagePanel - sets up the landingPagePanel by using landingPageView object and calling a class method
     * @Param loginPagePanel - sets up the loginPagePanel by using loginPageView object and calling a class method
     * @Param searchMoviePanel - sets up the searchMoviePanel by using searchMovieView object and calling a class method
     * @Param registrationPagePanel - sets up the registrationPagePanel by using registrationPageView object and calling a class method
     * @Param cancelTicketPanel - sets up the cancelTicketPanel by using cancelTicketPageView object and calling a class method
     *
     */
    private static GuiComponents guiComponents = new GuiComponents();

    private static LandingPageView landingPageView = new LandingPageView();
    private static LoginPageView loginPageView = new LoginPageView();
    private static SearchMovieView searchMovieView = new SearchMovieView();
    private static RegistrationPageView registrationPageView = new RegistrationPageView();
    private static TheaterView theaterView = new TheaterView();
    private static ShowTimeListView showTimeListView = new ShowTimeListView();
    private static SeatsView seatsView = new SeatsView();
    private static CancelTicketView cancelTicketPageView = new CancelTicketView();
    private static PaymentPageView paymentPageView = new PaymentPageView();

    private JFrame frame = new JFrame("Movie Ticket Reservation");
    private JLabel appLabel = guiComponents.createTitleLabel("Welcome to Movie Reservation App");
    private static CardLayout cardLayout = new CardLayout(10, 10);

    private static JPanel cardPanel = guiComponents.createPanelWithLayout(cardLayout);
    private static JPanel landingPagePanel = landingPageView.setupLandingPage();
    private static JPanel loginPagePanel = loginPageView.setupLoginPage();
    private static JPanel searchMoviePanel = searchMovieView.setupSearchMovieView();
    private static JPanel registrationPagePanel = registrationPageView.setupRegistrationPage();
    private static JPanel cancelTicketPanel = cancelTicketPageView.setupCancelTicketPage();
    private static JPanel paymentPanel = paymentPageView.setupPaymentPage();


    /**
     * responsible for setting up the Main View of the application using card layout.
     * It sets up the jFrame using FlowLayout and a screen size
     * With card layout it is easy to switch between different JPanels.
     * It also calls addControllers() to setup all the action Listeners needed
     */
    public void setupMainView() {
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 850);
        frame.setLocationRelativeTo(null);
        frame.add(appLabel);

        JPanel j1 = guiComponents.createPanel();
        BoxLayout boxLayout = new BoxLayout(j1, BoxLayout.Y_AXIS);
        j1.setLayout(boxLayout);

        JPanel temp = guiComponents.createPanel();
        cardPanel.add(landingPagePanel, "LandingPage");
        cardPanel.add(loginPagePanel, "LoginPage");
        cardPanel.add(registrationPagePanel, "RegistrationPage");
        cardPanel.add(registrationPagePanel, "RegistrationPage");
        cardPanel.add(cancelTicketPanel, "CancelTicketPage");
        temp.add(cardPanel);

        JPanel subPanel = guiComponents.createPanel();
        subPanel.add(searchMoviePanel);
        j1.add(temp);
        j1.add(subPanel);

        addControllers();

        frame.add(j1, BorderLayout.CENTER);
        frame.setVisible(true);
    }


    /**
     * responsible for setting up all the action listeners for
     * landingPageView, loginPageView, registrationPageView, showTimeListView, seatsView and cancelTicketPageView
     */
    private void addControllers() {
        LandingPageController landingPageCTRL = new LandingPageController(landingPageView);
        landingPageView.getLoginButton().addActionListener(landingPageCTRL);
        landingPageView.getRegisterButton().addActionListener(landingPageCTRL);
        landingPageView.getCancelTicketButton().addActionListener(landingPageCTRL);

        LoginPageController loginCTRL = new LoginPageController(loginPageView);
        loginPageView.getBackButton().addActionListener(loginCTRL);
        loginPageView.getLoginButton().addActionListener(loginCTRL);

        RegistrationPageController registrationCTRL = new RegistrationPageController(registrationPageView);
        registrationPageView.getBackButton().addActionListener(registrationCTRL);
        registrationPageView.getRegisterButton().addActionListener(registrationCTRL);

//        TheaterViewController theaterCTRL = new TheaterViewController(theaterView);
//        theaterView.getBack().addActionListener(theaterCTRL);

        ShowTimeController showtimesCTRL = new ShowTimeController(showTimeListView);
        showTimeListView.getBack().addActionListener(showtimesCTRL);

        SeatsController seatsCTRL = new SeatsController(seatsView);
        seatsView.getBack().addActionListener(seatsCTRL);

        CancelTicketController cancelTicketCTRL = new CancelTicketController(cancelTicketPageView);
        cancelTicketPageView.getBackButton().addActionListener(cancelTicketCTRL);
        cancelTicketPageView.getSubmitButton().addActionListener(cancelTicketCTRL);

    }

    /**
     *
     * @return returns the cardLayout static variable
     */
    public static CardLayout getCardLayout() {
        return cardLayout;
    }

    /**
     *
     * @return returns the cardPanel static variable
     */
    public static JPanel getCardPanel() {
        return cardPanel;
    }
}
