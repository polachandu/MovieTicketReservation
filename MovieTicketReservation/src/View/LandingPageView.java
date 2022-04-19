package View;

import Repository.MovieNewsDB;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LandingPageView extends GuiBuilder {

    /**
     * @Param guiComponent - this static variable gives access to the GuiComponents class in order to generate different Java Swing components
     * @Param jPanel - a static JPanel variable
     * @Param jLabel - a static JLabel variable
     * @Param newsPanel - a static JPanel variable for displaying news announcement for Registered Users
     * @Param loginButton - a static JButton variable for handling login events
     * @Param registerButton - a static JButton variable for handling user registration
     * @Param cancelTicketButton - a static JButton variable for handling Cancellation of Tickets
     * @Param searchMovie - a static JTextField variable for allowing user to enter a movie name
     * @Param newButton - a static JButton for displaying different news announcement items
     */
    private static GuiComponents guiComponents = new GuiComponents();
    private static JPanel jPanel = guiComponents.createPanel();
    private static JLabel jLabel = guiComponents.createLabel("Are you a Registered User?");
    private static JPanel newsPanel = guiComponents.createPanel();
    private static JButton loginButton = guiComponents.createButton("Login");
    private static JButton registerButton = guiComponents.createButton("Register");
    private static JButton cancelTicketButton = guiComponents.createButton("Cancel Ticket");
    private static JTextField searchMovie = guiComponents.editTextField(15);
    private JButton newsButton;

    /**
     * @return - returns the static newsPanel variable
     */
    public static JPanel getNewsPanel() {
        return newsPanel;
    }

    /**
     * @return - responsible for setting up the Landing Page of the Application.
     * Sets up the title, registration/login options, search movie options
     * Sets up the Box Layout for the subPanel created within the function.
     * Finally, adds the subPanel to the static jPanel class variable and returns
     * the jPanel object.
     */
    public JPanel setupLandingPage() {
        JPanel subPanel = guiComponents.createPanel();
        BoxLayout boxLayout = new BoxLayout(subPanel, BoxLayout.Y_AXIS);
        setAlignments();
        addComponentsToPanel(subPanel, boxLayout);
        addNewsToPanel(subPanel, boxLayout);
        newsPanel.setVisible(false);
        jPanel.add(subPanel);
        return jPanel;
    }

    /**
     * Responsible for setting up center alignment for the jLabel, login, register and cancel ticket
     * buttons
     */
    private void setAlignments() {
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        cancelTicketButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    /**
     * @param panel     - takes in a JPanel
     * @param boxLayout - takes in a BoxLayout object
     *                  creates a new jPanel with FlowLayout and adds login, register
     *                  and cancel ticket button and adds it to jPanel that is passed
     *                  in as a parameter.
     */
    private void addComponentsToPanel(JPanel panel, BoxLayout boxLayout) {
        panel.add(jLabel);
        JPanel t1 = guiComponents.createPanel();
        t1.setLayout(new FlowLayout());
        t1.add(loginButton);
        t1.add(Box.createRigidArea(new Dimension(5, 0)));
        t1.add(registerButton);
        panel.add(t1);
        t1.add(cancelTicketButton);
        panel.add(t1);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.setLayout(boxLayout);
    }

    /**
     * @param panel     - takes in a JPanel object
     * @param boxLayout - takes in a Box Layout object
     *                  using a MovieNewsDB object, the function first fetches all
     *                  the movie news as well as the number of movie news that exist
     *                  in the database.
     *                  Using that information it then creates a bunch of buttons using
     *                  a loop and adds them to the static newsPanel object of this
     *                  class.
     */
    private void addNewsToPanel(JPanel panel, BoxLayout boxLayout) {
        MovieNewsDB news = new MovieNewsDB();
        news.getMovieNews();
        news.getMovieNewsCount();
        BoxLayout b1 = new BoxLayout(newsPanel, BoxLayout.Y_AXIS);
        ArrayList movieNews = news.getMovieNewsList();
        for (int i = 0; i < news.getNewsCount(); i++) {
            newsPanel.add(Box.createRigidArea(new Dimension(200, 5)));
            newsButton = guiComponents.createButton(movieNews.get(i).toString());
            newsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            newsPanel.add(newsButton);
            newsPanel.add(Box.createRigidArea(new Dimension(200, 5)));
            newsPanel.setLayout(b1);
            newsPanel.setBorder(BorderFactory.createTitledBorder("News Available"));
        }
        panel.add(newsPanel);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.setLayout(boxLayout);
    }

    public static JPanel getjPanel() {
        return jPanel;
    }

    public static void setjPanel(JPanel jPanel) {
        LandingPageView.jPanel = jPanel;
    }

    public static JLabel getjLabel() {
        return jLabel;
    }

    public static JButton getLoginButton() {
        return loginButton;
    }

    public static JButton getRegisterButton() {
        return registerButton;
    }

    public static JButton getCancelTicketButton() {
        return cancelTicketButton;
    }

    public static void setCancelTicket(JButton cancelTicketButton) {
        LandingPageView.cancelTicketButton = cancelTicketButton;
    }


}
