package View;

import javax.swing.*;
import java.awt.*;

/**
 * Class for the registration GUI.
 */
public class RegistrationPageView extends GuiBuilder{
	private static GuiComponents guiComponents = new GuiComponents();
	
	private static JPanel jPanel = guiComponents.createPanel();
    private static JLabel usernameLabel = guiComponents.createLabel("Username");
    private static JLabel passwordLabel = guiComponents.createLabel("Password");
    private static JLabel paymentInfoLabel = guiComponents.createLabel("Payment Information");
    private static JLabel emailLabel = guiComponents.createLabel("Email Address");

    private static JTextField username = guiComponents.editTextField(15);
    private static JTextField password = guiComponents.editTextField(15);
    private static JTextField paymentInfo = guiComponents.editTextField(15);
    private static JTextField email = guiComponents.editTextField(15);
    
    private static JButton registerButton = guiComponents.createButton("Register");
    private static JButton backButton = guiComponents.createButton("Go Back");

    /**
     * Method to setup the JPanel.
     * 
     * @return jPanel the JPanel.
     */
    public JPanel setupRegistrationPage() {
        JPanel subPanel = guiComponents.createPanel();
        BoxLayout boxLayout = new BoxLayout(subPanel, BoxLayout.Y_AXIS);
        setAlignments();
        addComponentsToPanel(subPanel, boxLayout);
        jPanel.add(subPanel);
        jPanel.setBorder(BorderFactory.createTitledBorder("Register"));
        return jPanel;
    }
    
    /**
     * Method to set up the alignment of the GUI.
     */
    private void setAlignments() {
        usernameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        passwordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        paymentInfoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        username.setAlignmentX(Component.CENTER_ALIGNMENT);
        password.setAlignmentX(Component.CENTER_ALIGNMENT);
        paymentInfo.setAlignmentX(Component.CENTER_ALIGNMENT);
        email.setAlignmentX(Component.CENTER_ALIGNMENT);
        registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
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
        panel.add(paymentInfoLabel);
        panel.add(paymentInfo);
        panel.add(emailLabel);
        panel.add(email);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(registerButton);
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
    	paymentInfo.setText(null);
    	email.setText(null);
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
	public static GuiComponents getGuiComponents() {
		return guiComponents;
	}

	public static void setGuiComponents(GuiComponents guiComponents) {
		RegistrationPageView.guiComponents = guiComponents;
	}

	public static JPanel getjPanel() {
		return jPanel;
	}

	public static void setjPanel(JPanel jPanel) {
		RegistrationPageView.jPanel = jPanel;
	}

	public static JLabel getUsernameLabel() {
		return usernameLabel;
	}

	public static void setUsernameLabel(JLabel usernameLabel) {
		RegistrationPageView.usernameLabel = usernameLabel;
	}

	public static JLabel getPasswordLabel() {
		return passwordLabel;
	}

	public static void setPasswordLabel(JLabel passwordLabel) {
		RegistrationPageView.passwordLabel = passwordLabel;
	}

	public static JLabel getPaymentInfoLabel() {
		return paymentInfoLabel;
	}

	public static void setPaymentInfoLabel(JLabel paymentInfoLabel) {
		RegistrationPageView.paymentInfoLabel = paymentInfoLabel;
	}

	public static JLabel getEmailLabel() {
		return emailLabel;
	}

	public static void setEmailLabel(JLabel emailLabel) {
		RegistrationPageView.emailLabel = emailLabel;
	}

	public static JTextField getUsername() {
		return username;
	}

	public static void setUsername(JTextField username) {
		RegistrationPageView.username = username;
	}

	public static JTextField getPassword() {
		return password;
	}

	public static void setPassword(JTextField password) {
		RegistrationPageView.password = password;
	}

	public static JTextField getPaymentInfo() {
		return paymentInfo;
	}

	public static void setPaymentInfo(JTextField paymentInfo) {
		RegistrationPageView.paymentInfo = paymentInfo;
	}

	public static JTextField getEmail() {
		return email;
	}

	public static void setEmail(JTextField email) {
		RegistrationPageView.email = email;
	}

	public static JButton getRegisterButton() {
		return registerButton;
	}

	public static void setRegisterButton(JButton registerButton) {
		RegistrationPageView.registerButton = registerButton;
	}

	public static JButton getBackButton() {
		return backButton;
	}

	public static void setBackButton(JButton backButton) {
		RegistrationPageView.backButton = backButton;
	}
    
    
}
