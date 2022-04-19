package Controller;

import View.LandingPageView;
import View.MainView;
import View.SearchMovieView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LandingPageController implements ActionListener {
    LandingPageView landingPageView;
    MainView mv = new MainView();
    private static SearchMovieView sv = new SearchMovieView();

    public LandingPageController(LandingPageView lv){
        this.landingPageView = lv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == landingPageView.getLoginButton()) {
    		mv.getCardLayout().show(mv.getCardPanel(),"LoginPage");
            sv.getjPanel().setVisible(false);
    	}
    	else if(e.getSource() == landingPageView.getRegisterButton()) {
    		mv.getCardLayout().show(mv.getCardPanel(), "RegistrationPage");
    		sv.getjPanel().setVisible(false);
    	}
    	else if(e.getSource() == landingPageView.getCancelTicketButton()) {
    		mv.getCardLayout().show(mv.getCardPanel(),"CancelTicketPage");    		
    	}
        
        
    }
}
