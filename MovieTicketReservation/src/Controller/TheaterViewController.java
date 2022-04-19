package Controller;

import View.LandingPageView;
import View.MainView;
import View.SearchMovieView;
import View.TheaterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheaterViewController implements ActionListener {
    TheaterView theaterView;

    public TheaterViewController(TheaterView tv) {
        this.theaterView = tv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("SE Cineplex")){
            MainView.getCardLayout().show(MainView.getCardPanel(),"ShowTimes");
            TheaterView.getjPanel().setVisible(false);
        }
        else if(e.getActionCommand().equals("Go Back")){
            MainView.getCardLayout().show(MainView.getCardPanel(),"LandingPage");
            LandingPageView.getjPanel().setVisible(true);
            SearchMovieView.getjPanel().setVisible(true);
        }


    }
}
