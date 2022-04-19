package Controller;


import Repository.ScreenDB;
import Repository.SeatsDB;
import View.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 * Created a class called ShowTimeController where it operates by implementing ShowTime model and ShowTimeListView.
 */
public class ShowTimeController implements  ActionListener{
    ShowTimeListView showTimeListView;
    ArrayList seatIDs = new ArrayList();
    ScreenDB sDB = new ScreenDB();
    SeatsDB seatsDB = new SeatsDB();
    private static SeatsView sView = new SeatsView();

    /**
     * Constructor constructs the ShowTimeController by allowing the parameters mentioned below
     * @param: sltv
     */
    public ShowTimeController(ShowTimeListView sltv) {
        this.showTimeListView = sltv;
    }

    /**
     * Created a function called actionPerformed where it gives the information about show time, day of the show,
     * seat ID, screen ID and directs to seats. If the user selects "Go Back" button it redirects to searchMovieView GUI Page.
     * @param: e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // get Showtime ID here
        System.out.println("CLICKED ON A SHOWTIME");
        String day = (e.getActionCommand().split(" ")[0]);
        int dayNumber = 0;
        String time = (e.getActionCommand().split(" ")[1]);
        switch (day) {
            case "Monday":
                dayNumber = 0;
                break;
            case "Tuesday":
                dayNumber = 1;
                break;
            case "Wednesday":
                dayNumber = 2;
                break;
            case "Thursday":
                dayNumber = 3;
                break;
            case "Friday":
                dayNumber = 4;
                break;
            case "Saturday":
                dayNumber = 5;
                break;
            case "Sunday":
                dayNumber = 6;
                break;
        }
        System.out.println(day+" "+dayNumber);

        String screen = "";
        ArrayList tempHolder;
        for(int i = 0; i < showTimeListView.getShowTimeList().size(); i++){
            System.out.println(showTimeListView.getShowTimeList().get(i));
            tempHolder = (ArrayList) showTimeListView.getShowTimeList().get(i);
            int pos = (int) tempHolder.get(0);
            if(dayNumber == pos){
                screen = tempHolder.get(2).toString();
            }
        }
        ShowTimeListView.setShowTimeSelected(e.getActionCommand()+" - Screen:"+screen);

        System.out.println("Screen it is playing on - "+screen);
        sDB.getScreenID(screen);
        seatIDs = sDB.getSeatIDs();
        sView.setSeats(seatIDs);

        JPanel seatsPanel = sView.setupSeatsView();
        MainView.getCardPanel().add(seatsPanel,"Seats");
        MainView.getCardLayout().show(MainView.getCardPanel(),"Seats");
        ShowTimeListView.getjPanel().setVisible(false);

        if(e.getActionCommand().equals("Go Back")){
            MainView.getCardLayout().show(MainView.getCardPanel(),"LandingPage");
            SearchMovieView.getjPanel().setVisible(true);
            Controller.setTicketDetails("");
            ShowTimeListView.setShowTimeSelected("");
            SearchMovieView.setMovieSelected("");
        }

    }
}
