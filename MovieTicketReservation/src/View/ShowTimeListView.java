package View;
import Controller.ShowTimeController;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created a class called ShowTimeListView which shows GUI for show times for a movie.
 */
public class ShowTimeListView {
    private static GuiComponents guiComponents = new GuiComponents();

    /**
     * It creates a panel which contains the components and assigned it to jPanel
     */
    private static JPanel jPanel = guiComponents.createPanel();
    /**
     * It creates a label with text as "Show Timings" and assigned it to jLabel
     */
    private static JLabel jLabel = guiComponents.createLabel("Show Timings");
    /**
     * It creates a button with text as "Go Back" and assigned it to back
     */
    private static JButton back = guiComponents.createButton("Go Back");
    private JButton showtimes;
//<<<<<<< HEAD
    /**
     * Created a function called getShowTimeList. It returns the showTimeList
     * @param : no parameters passed
     * @return : showTimeList
     */
//=======
    private static String showTimeSelected = "";

    public static String getShowTimeSelected() {
        return showTimeSelected;
    }

    public static void setShowTimeSelected(String showTimeSelected) {
        ShowTimeListView.showTimeSelected = showTimeSelected;
    }

//>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
    public static ArrayList getShowTimeList() {
        return showTimeList;
    }

    private static ArrayList showTimeList = new ArrayList();
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
     * Created a function called getShowtimes. It returns the showtimes
     * @param : no parameters passed
     * @return : showtimes
     */
    public JButton getShowtimes() {
        return showtimes;
    }
    /**
     * Created a function method called setShowTimeList.It updates the showTimes which is given in the parameter.
     * @param: showTimes
     * @return: no return value
     */
    public static void setShowTimeList(ArrayList showTimes){
        showTimeList = showTimes;
    }

    /**
     * Created a function called setupShowTimesListView. It setup a panel, layout, alignments for a show list timings
     * @return :jPanel
     */
    public JPanel setupShowTimesListView() {
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
     * Created a function called addComponentsToPanel. It adds the components like jLabel, back button, and show timings buttons,
     *buttons dimension, panel dimension, subpanel title along with alignments to panel.
     * @param panel
     * @param boxLayout
     */
    private void addComponentsToPanel(JPanel panel, BoxLayout boxLayout) {
        JPanel temp = guiComponents.createPanel();
        jPanel.removeAll();
        panel.removeAll();
        temp.removeAll();
        BoxLayout b1 = new BoxLayout(temp, BoxLayout.Y_AXIS);
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};
        ShowTimeController showTimeController = new ShowTimeController(this);
        ArrayList tempHolder;
        String day = "";

        for (int i = 0; i < showTimeList.size(); i++) {
            tempHolder = (ArrayList) showTimeList.get(i);
            int pos = (int) tempHolder.get(0);
            temp.add(Box.createRigidArea(new Dimension(200, 5)));
            showtimes = guiComponents.createButton(days[pos]+" "+tempHolder.get(1));
            showtimes.setAlignmentX(Component.CENTER_ALIGNMENT);
            showtimes.addActionListener(showTimeController);
            temp.add(showtimes);
            temp.add(Box.createRigidArea(new Dimension(200, 5)));
        }
        
        temp.setLayout(b1);
        temp.setBorder(BorderFactory.createTitledBorder("Show Times Found"));
        panel.add(jLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.add(temp);
        panel.add(back);
        panel.setLayout(boxLayout);
    }


}



