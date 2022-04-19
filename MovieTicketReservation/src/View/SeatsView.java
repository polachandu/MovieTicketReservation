package View;

import Controller.DBController;
import Controller.SeatsController;
import Repository.SeatsDB;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 * Created a class called SeatsView which shows GUI for seats for show times.
 */
public class SeatsView {
    private static GuiComponents guiComponents = new GuiComponents();
    private static DBController dbController = DBController.getDbController();

    SeatsDB seatDatabase = new SeatsDB();
    /**
     * It creates a panel which contains the components and assigned it to jPanel
     */
    private static JPanel jPanel = guiComponents.createPanel();
    /**
     * It creates a label with text as "Seats Available" and assigned it to jLabel
     */
    private static JLabel jLabel = guiComponents.createLabel("Seats Available");
    /**
     * It creates a button with text as "Go Back" and assigned it to back
     */
    private static JButton back = guiComponents.createButton("Go Back");
    private JButton seats;
    private static int rows = 0;
    private static int cols = 0;
<<<<<<< HEAD
    /**
     * Created a function called getRows. It returns the rows
     * @param : no parameters passed
     * @return : rows
     */
    public static int getRows() {
        return rows;
    }
    /**
     * Created a function method called setRows.It updates the rows which is given in the parameter.
     * @param: rows
     * @return: no return value
     */
    public static void setRows(int rows) {
        SeatsView.rows = rows;
    }
    /**
     * Created a function called getCols. It returns the cols
     * @param : no parameters passed
     * @return : cols
     */
    public static int getCols() {
        return cols;
    }
    /**
     * Created a function method called setCols.It updates the cols which is given in the parameter.
     * @param: cols
     * @return: no return value
     */
    public static void setCols(int cols) {
        SeatsView.cols = cols;
    }
    /**
     * Created a function called getjPanel. It returns the jPanel
     * @param : no parameters passed
     * @return : jPanel
     */
    public static JPanel getjPanel() {
        return jPanel;
    }
    /**
     * Created a function called getjLabel. It returns the jLabel
     * @param : no parameters passed
     * @return : jLabel
     */
    public static JLabel getjLabel() {
        return jLabel;
    }
    /**
     * Created a function called getBack. It returns the back
     * @param : no parameters passed
     * @return : back
     */
    public static JButton getBack() {
        return back;
    }
    /**
     * Created a function called getShowtimes. It returns the seats
     * @param : no parameters passed
     * @return : seats
     */
    public JButton getShowtimes() {
        return seats;
    }

    /**
     * Created a seats of JButton type.
     */
    private JButton seats;
=======
    private static String seatSelected = "";

    public static String getSeatSelected() {
        return seatSelected;
    }

    public static void setSeatSelected(String seatSelected) {
        SeatsView.seatSelected = seatSelected;
    }
    public static JPanel getjPanel() {
        return jPanel;
    }

    public static JLabel getjLabel() {
        return jLabel;
    }

    public static JButton getBack() {
        return back;
    }

    public JButton getShowtimes() {
        return seats;
    }
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a

    private ArrayList seatsList = new ArrayList();
    /**
     * Created a function called getSeatsList. It returns the seatsList
     * @param : no parameters passed
     * @return : seatsList
     */
    public ArrayList getSeatsList() {
        return seatsList;
    }
<<<<<<< HEAD
    /**
     * Created a function method called setSeats.It updates the seatsList which is given in the parameter.
     * @param: seatsList
     * @return: no return value
     */
    public void setSeats(ArrayList sL){
=======

    public void setSeats(ArrayList sL) {
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
        seatsList = sL;
    }
    /**
     * Created a function called setupSeatsView. It setup a panel, layout, alignments for a seats.
     * @return :jPanel
     */
    public JPanel setupSeatsView() {
        JPanel subPanel = guiComponents.createPanel();
        BoxLayout boxLayout = new BoxLayout(subPanel, BoxLayout.Y_AXIS);
        setAlignments();
        addComponentsToPanel(subPanel, boxLayout);
        jPanel.add(subPanel);
        return jPanel;
    }
    /**
     * Created a method called setAlignments. It sets the alignment, background color and foreground color.
     * @return: no return value
     */

    private void setAlignments() {
        jPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
    }
    /**
     * Created a function called addComponentsToPanel. It adds the components like back button, and shows seat buttons,
     *buttons dimension, panel dimension, subpanel title.
     * @param panel
     * @param boxLayout
     */
    private void addComponentsToPanel(JPanel panel, BoxLayout boxLayout) {
        JPanel temp = guiComponents.createPanel();
        jPanel.removeAll();
        panel.removeAll();
        temp.removeAll();
        seatDatabase.getSeatLocationAndNumberCount(getSeatsList());
        seatDatabase.getSeatsAndLocations(getSeatsList());
        int rows = seatDatabase.getRows();
        int cols = seatDatabase.getCols();
        ArrayList seatLocation = seatDatabase.getSeatLocation();
        ArrayList seatNumber = seatDatabase.getSeatNumber();
        SeatsController seatsController = new SeatsController(this);
        System.out.println("Column count is" + cols);

        GridLayout g1 = new GridLayout(6, cols);
<<<<<<< HEAD
        for (int i = 0; i < seatLocation.size(); i++){

                seats = guiComponents.createButton(seatLocation.get(i).toString());
                temp.add(seats);

=======
        for (int i = 0; i < seatLocation.size(); i++) {
            seats = guiComponents.createButton(seatLocation.get(i).toString());
            seats.addActionListener(seatsController);
            temp.add(seats);
>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
        }
        temp.setLayout(g1);
        temp.setBorder(BorderFactory.createTitledBorder("Seats"));
        panel.add(jLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.add(temp);
        panel.add(back);
        panel.setLayout(boxLayout);
    }
}