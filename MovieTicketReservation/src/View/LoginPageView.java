package View;

import javax.swing.*;
import java.awt.*;

/**
 * Class for the login GUI.
 */
public class LoginPageView extends GuiBuilder{
    private static GuiComponents guiComponents = new GuiComponents();

    private static JPanel jPanel = guiComponents.createPanel();
    private static JLabel jLabel = guiComponents.createLabel("LOGIN");
    private static JLabel usernameLabel = guiComponents.createLabel("Username");
    private static JLabel passwordLabel = guiComponents.createLabel("Password");

    private static JTextField username = guiComponents.editTextField(10);
    private static JTextField password = guiComponents.editTextField(10);
    private static JButton loginButton = guiComponents.createButton("Login");
    private static JButton backButton = guiComponents.createButton("Go Back");

    /**
     * Method to setup the JPanel.
     * 
     * @return jPanel the JPanel.
     */
    public JPanel setupLoginPage() {
        JPanel subPanel = guiComponents.createPanel();
        BoxLayout boxLayout = new BoxLayout(subPanel, BoxLayout.Y_AXIS);
        setAlignments();
        addComponentsToPanel(subPanel, boxLayout);
        jPanel.add(subPanel);
        jPanel.setBorder(BorderFactory.createTitledBorder("Login"));
        return jPanel;
    }

    /**
     * Method to set up the alignment of the GUI.
     */
    private void setAlignments() {
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        usernameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        passwordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        username.setAlignmentX(Component.CENTER_ALIGNMENT);
        password.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    /**
     * Method to add the components to the JPanel.
     * 
     * @param panel the JPanel.
     * @param boxLayout the BoxLayout.
     */
    private void addComponentsToPanel(JPanel panel, BoxLayout boxLayout) {
        panel.add(usernameLabel);
        panel.add(username);
        panel.add(passwordLabel);
        panel.add(password);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(loginButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(backButton);
        panel.setLayout(boxLayout);
    }
    
    /**
     * Method to clear the input fields on the GUI.
     */
    public void clearFields() {
    	username.setText(null);
    	password.setText(null);
    }
    
    /**
     * Method to display a message to the user.
     * 
     * @param message the message.
     */
    public void showMessage(String message) {
    	JOptionPane.showMessageDialog(null, message);
    }
    
    // Getters and setters
    public static JPanel getjPanel() {
        return jPanel;
    }

    public static void setjPanel(JPanel jPanel) {
        LoginPageView.jPanel = jPanel;
    }

    public static JLabel getjLabel() {
        return jLabel;
    }

    public static void setjLabel(JLabel jLabel) {
        LoginPageView.jLabel = jLabel;
    }

    public static JTextField getUsername() {
        return username;
    }

    public static void setUsername(JTextField username) {
        LoginPageView.username = username;
    }

    public static JTextField getPassword() {
        return password;
    }

    public static void setPassword(JTextField password) {
        LoginPageView.password = password;
    }

    public static JButton getLoginButton() {
        return loginButton;
    }

    public static JButton getBackButton() {
        return backButton;
    }

    public static void setLoginButton(JButton loginButton) {
        LoginPageView.loginButton = loginButton;
    }


}
