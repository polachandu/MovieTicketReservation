package Controller;

import Repository.MovieDB;
import Repository.ShowTimesDB;
import View.MainView;
import View.SearchMovieView;
import View.ShowTimeListView;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SearchMovieController implements ActionListener {
    SearchMovieView searchMovieView;
    MovieDB movieDB = new MovieDB();
    ShowTimesDB showTimesDB = new ShowTimesDB();
    private static ShowTimeListView showTimeListView = new ShowTimeListView();


    public SearchMovieController(SearchMovieView sv){
        this.searchMovieView = sv;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        SearchMovieView.setMovieSelected(e.getActionCommand());
        int movieID = movieDB.getMovieID(e.getActionCommand());
        showTimesDB.showTimeIDs(movieID);
        System.out.println("Movie ID is - "+movieID);
        ArrayList temp = showTimesDB.getShowTimes();

        ShowTimeListView.setShowTimeList(temp);


        JPanel showMovieTimesPanel = showTimeListView.setupShowTimesListView();
        MainView.getCardPanel().add(showMovieTimesPanel,"ShowTimes");
        MainView.getCardLayout().show(MainView.getCardPanel(),"ShowTimes");
        SearchMovieView.getjPanel().setVisible(false);
    }
}
