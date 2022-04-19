package Controller;

import View.LandingPageView;
import View.LoginPageView;
import View.MainView;
import View.SearchMovieView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.RegisteredUser;
import Repository.LoginDB;

/**
 * Class to handle the login functionality.
 */
public class LoginPageController implements ActionListener {
    LoginPageView loginPageView;
    MainView mv = new MainView();
    private static SearchMovieView sv = new SearchMovieView();
    private static LoginDB loginDB = new LoginDB();

    /**
     * Constructor method.
     * 
     * @param lv the LoginPageView
     */
    public LoginPageController(LoginPageView lv){
        this.loginPageView = lv;
    }

    /**
     * Method to handle actions from loginPageView.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
    	// Return to landing page
    	if(e.getSource() == loginPageView.getBackButton()) {
    		mv.getCardLayout().show(mv.getCardPanel(),"LandingPage");
            sv.getjPanel().setVisible(true);
    	}
    	// Provide login functionality
    	else if(e.getSource() == loginPageView.getLoginButton()) {
    		if(loginPageView.getUsername().getText().equals("") ||loginPageView.getPassword().getText().equals("")) {
				loginPageView.showMessage("Please enter all information.");
			}
    		else {
    			RegisteredUser user = new RegisteredUser();
    			user.setUsername(loginPageView.getUsername().getText());
    			user.setPassword(loginPageView.getPassword().getText());
    			
    			if(loginDB.validateLogin(user)) {
    				Controller.setTheUser(loginDB.login(user));
    				loginPageView.clearFields();
    				loginPageView.showMessage("Login successful.");
					LandingPageView.getjLabel().setVisible(false);
					LandingPageView.getLoginButton().setVisible(false);
					LandingPageView.getRegisterButton().setVisible(false);
					LandingPageView.getNewsPanel().setVisible(true);
					// Show Movie News here
    				mv.getCardLayout().show(mv.getCardPanel(),"LandingPage");
			        sv.getjPanel().setVisible(true);
//					LandingPageView.getjPanel().setVisible(false);

    			}
    			else {
    				loginPageView.clearFields();
    				loginPageView.showMessage("Invalid credentials, please try again.");
    			}
    		}
    	}
        
    }
}
