package View;

import Controller.SearchMovieController;
import Repository.MovieDB;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SearchMovieView extends GuiBuilder {
    /**
     * @Param guiComponents - this static variable gives access to the GuiComponents class in order to generate different Java Swing components
     * @Param movieDB - MovieDB object instantiated in order to make SQL queries to the Movie Table
     * @Param jPanel - JPanel containing GUI components for the SearchMovieView
     * @Param searchMovie - JTextField for allowing user to enter a movie to search for
     * @Param searchMovieButton - Search button to handle action from user when they want to search for a specific movie
     * @Param listMoviesButton - A button to allow user to list all the available movies in the database
     * @Param movie1 - JButton that will be used to iterate through loop and display multiple movies
     * @Param movieSelected - String object to hold Ticket information as the user goes through all the steps of picking a movie, showtime, seats and payment
     * @Param movies - An arraylist to hold all the movies
     */
    private static GuiComponents guiComponents = new GuiComponents();
    private static MovieDB movieDB = new MovieDB();
    private static JPanel jPanel = guiComponents.createPanel();
    private JTextField searchMovie = guiComponents.editTextField(15);
    private JButton searchMovieButton = guiComponents.createButton("Search Movie");
    private JButton listMoviesButton = guiComponents.createButton("List All Movies");
    private JButton movie1;
    private static String movieSelected = "";
    ArrayList movies = new ArrayList();

    /**
     *
     * @return returns movieSelected string meant to hold Ticket Details
     */
    public static String getMovieSelected() {
        return movieSelected;
    }

    /**
     *
     * @param movieSelected takes in a string and sets the movieSelected string variable to the input parameter
     */
    public static void setMovieSelected(String movieSelected) {
        SearchMovieView.movieSelected = movieSelected;
    }

    /**
     *
     * @return returns a JPanel containing a subpanel with box layout, alignment setup and necessary GUI components added to it
     */
    public JPanel setupSearchMovieView() {
        JPanel subPanel = guiComponents.createPanel();
        BoxLayout boxLayout = new BoxLayout(subPanel, BoxLayout.Y_AXIS);
        setAlignments();
        addComponentsToPanel(subPanel, boxLayout);
        jPanel.add(subPanel);
        return jPanel;
    }

    /**
     * sets up the alignments of the search movie field, search button and background color for the search button
     */
    private void setAlignments() {
        searchMovie.setAlignmentX(Component.CENTER_ALIGNMENT);
        searchMovieButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        searchMovieButton.setBackground(Color.ORANGE);
    }

    /**
     *
     * @param panel - JPanel passed in as an input parameter
     * @param boxLayout - box layout passed in as 2nd input parameter
     *                  sets up all the GUI components using Box Layout and FlowLayout as needed.
     *                  Also, sets up the ActionListeners for 'search' and 'list all movies' buttons
     */
    private void addComponentsToPanel(JPanel panel, BoxLayout boxLayout) {
        movieDB.getMoviesList();
        movieDB.getMoviesCount();
        JPanel temp = guiComponents.createPanel();
        BoxLayout b1 = new BoxLayout(temp, BoxLayout.Y_AXIS);
        SearchMovieController searchMovieController = new SearchMovieController(this);
        movies = MovieDB.getMovies();
        panel.add(searchMovie);

        JPanel t1 = guiComponents.createPanel();
        t1.setLayout(new FlowLayout());
        t1.add(searchMovieButton);
        t1.add(Box.createRigidArea(new Dimension(5, 0)));
        t1.add(listMoviesButton);
        panel.add(t1);

        DefaultListModel demoList = new DefaultListModel();
        for(int i = 0; i < movies.size(); i++){
            demoList.addElement(movies.get(i).toString());
        }
        JList j1 = new JList();
        j1.setModel(demoList);


        listMoviesButton.addActionListener(e -> {
            temp.removeAll();
            getSearchMovie().setText("");
            for (int i = 0; i < movieDB.getMovieCount(); i++) {
                temp.add(Box.createRigidArea(new Dimension(200, 5)));
                movie1 = guiComponents.createButton(movies.get(i).toString());
                movie1.setAlignmentX(Component.CENTER_ALIGNMENT);
                movie1.addActionListener(searchMovieController);
                temp.add(movie1);
                temp.add(Box.createRigidArea(new Dimension(200, 5)));
                temp.setLayout(b1);
                temp.setBorder(BorderFactory.createTitledBorder("Movies Found"));
            }
            panel.add(Box.createRigidArea(new Dimension(0, 15)));
            panel.add(temp);
            panel.setLayout(boxLayout);
            panel.revalidate();
            panel.repaint();
        });

        searchMovieButton.addActionListener(e -> {
            String movieFound = movieDB.findMovie(getSearchMovie().getText());
            if(movieFound.equals("Movie Not Found")){
                showMessage(movieFound);
            }
            else{
                temp.removeAll();
                temp.add(Box.createRigidArea(new Dimension(200, 5)));
                movie1 = guiComponents.createButton(movieFound);
                movie1.setAlignmentX(Component.CENTER_ALIGNMENT);
                movie1.addActionListener(searchMovieController);
                temp.add(movie1);
                temp.add(Box.createRigidArea(new Dimension(200, 5)));
                panel.add(Box.createRigidArea(new Dimension(0, 15)));
                panel.add(temp);
                panel.setLayout(boxLayout);
                panel.revalidate();
                panel.repaint();
            }
        });
    }

    /**
     *
     * @param message - a string parameter as an input
     *                displays a popup dialog using the message received in the message parameter
     */
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     *
     * @return returns the guiComponents variable of this class
     */
    public GuiComponents getGuiComponents() {
        return guiComponents;
    }

    /**
     *
     * @param guiComponents - takes in a GuiComponents object as a parameter
     *                      sets the guiComponents variable to the object passed in
     */
    public void setGuiComponents(GuiComponents guiComponents) {
        this.guiComponents = guiComponents;
    }

    /**
     *
     * @return returns the jPanel object of this class
     */
    public static JPanel getjPanel() {
        return jPanel;
    }

    /**
     *
     * @param jPanel - takes in a JPanel object as a parameter
     *               sets the jPanel object to the class' jPanel object
     */
    public void setjPanel(JPanel jPanel) {
        this.jPanel = jPanel;
    }

    /**
     *
     * @return returns the JTextField object called searchMovie
     */
    public JTextField getSearchMovie() {
        return searchMovie;
    }
}
