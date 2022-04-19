package View;

import javax.swing.*;
import java.awt.*;

public class GuiComponents {

    /**
     *
     * @param columns - takes in an integer variable which will define the width of the JTextField object
     * @return - returns a JTextField object which is non-editable
     */
    public JTextField nonEditTextField(int columns){
        JTextField j1 = new JTextField(columns);
        j1.setEditable(false);
        return j1;
    }

    /**
     *
     * @param columns - takes in an integer variable which will define the width of the JTextField object
     * @return - returns a JTextField with width of size 'columns'
     */
    public JTextField editTextField(int columns){
        JTextField j1 = new JTextField(columns);
        return j1;
    }

    /**
     *
     * @param rows - number of rows the JTextArea will take up
     * @param columns - number of columns the JTextArea will take up
     * @return - returns a non-editable JTextArea using the given rows and columns as its size
     */
    public JTextArea nonEditTextArea(int rows, int columns){
        JTextArea j1 = new JTextArea(rows, columns);
        j1.setEditable(false);
        return j1;
    }

    /**
     *
     * @param buttonText - string input that will be used to set the JButton's text
     * @return - returns a JButton with the buttonText as its text label
     */
    public JButton createButton(String buttonText){
        JButton j1 = new JButton(buttonText);
        return j1;
    }

    /**
     *
     * @return - returns a new JPanel object
     */
    public JPanel createPanel(){
        JPanel j1 = new JPanel();
        return j1;
    }

    /**
     *
     * @param cl - CardLayout is passed in as a parameter
     * @return - returns a JPanel object created using the CardLayout object called cl
     */
    public JPanel createPanelWithLayout(CardLayout cl){
        JPanel j1 = new JPanel(cl);
        return j1;
    }

    /**
     *
     * @param labelText - labelText is the text inputted for the JLabel that this function returns
     * @return - returns a new JLabel with the label taken from the input variable and sets the Font
     *           to Calibri, Bold with Size of 40
     */
    public JLabel createTitleLabel(String labelText){
        JLabel j1 = new JLabel(labelText);
        j1.setFont(new Font("Calibri", Font.BOLD, 40));
        return j1;
    }

    /**
     *
     * @param labelText - labelText is the text inputted for the JLabel that this function returns
     * @return - returns a new JLabel with the label taken from the input variable
     */
    public JLabel createLabel(String labelText){
        JLabel j1 = new JLabel(labelText);
        return j1;
    }

}
