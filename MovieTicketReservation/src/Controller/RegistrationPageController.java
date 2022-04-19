package Controller;

import View.RegistrationPageView;
import View.SearchMovieView;
import View.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.RegisteredUser;
import Repository.RegistrationDB;

/**
 * Class to handle the registration functionality
 */
public class RegistrationPageController implements ActionListener{

	RegistrationPageView registrationPageView;
	MainView mv = new MainView();
	private static SearchMovieView sv = new SearchMovieView();
	private static RegistrationDB registrationDB = new RegistrationDB();
	
	/**
     * Constructor method.
     * 
     * @param rv the RegistrationPageView
     */
	public RegistrationPageController(RegistrationPageView rv) {
		this.registrationPageView = rv;
	}
	
	/**
     * Method to handle actions from registrationPageView.
     */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Return to landing page
		if(e.getSource() == registrationPageView.getBackButton()) {
			mv.getCardLayout().show(mv.getCardPanel(),"LandingPage");
	        sv.getjPanel().setVisible(true);
		}
		// Handle registration functionality
		if(e.getSource() == registrationPageView.getRegisterButton()) {
			if(registrationPageView.getUsername().getText().equals("") ||
					registrationPageView.getPassword().getText().equals("") ||
					registrationPageView.getPaymentInfo().getText().equals("") ||
					registrationPageView.getEmail().getText().equals("")) {
				
				registrationPageView.showMessage("Please enter all information.");
			}
			else {
				RegisteredUser user = new RegisteredUser();
				
				user.setUsername(registrationPageView.getUsername().getText());
				user.setPassword(registrationPageView.getPassword().getText());
				user.setPaymentInfo(registrationPageView.getPaymentInfo().getText());
				user.setEmailAddress(registrationPageView.getEmail().getText());
				
				int reply = JOptionPane.showConfirmDialog(null, "There is a $20 annual fee to become a registered member that will be "
						+ "charged to your credit card. Would you like to continue?",
						"Confirm Payment", JOptionPane.YES_NO_OPTION);
				
				if(reply == JOptionPane.YES_OPTION) {
					if(registrationDB.register(user) > 0) {
						registrationPageView.showMessage("Registration successful.");
						registrationPageView.clearFields();
						mv.getCardLayout().show(mv.getCardPanel(),"LandingPage");
				        sv.getjPanel().setVisible(true);
					}
					else {
						registrationPageView.showMessage("Username and/or email address unavailable. Please try again.");
						registrationPageView.clearFields();
					}
				}
				else {
					registrationPageView.clearFields();
					mv.getCardLayout().show(mv.getCardPanel(),"LandingPage");
			        sv.getjPanel().setVisible(true);
				}
			}
		}
		
	}

	
}
