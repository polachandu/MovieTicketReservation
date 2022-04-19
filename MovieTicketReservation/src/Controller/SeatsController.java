package Controller;

import View.SearchMovieView;
import View.SeatsView;
import View.MainView;
import View.ShowTimeListView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//<<<<<<< HEAD
/**
 * Created a class called SeatsController where it operates by implementing Seats model and SeatsView.
 */
//=======
//>>>>>>> d73a9271d1659c2c2b50ae0161242561d95a098a
public class SeatsController implements ActionListener{
    SeatsView seatsView;
    /**
     * Constructor constructs the SeatsController by allowing the parameters mentioned below
     * @param: sv
     */
    public SeatsController(SeatsView sv) {
        this.seatsView = sv;
    }
    /**
     * Created a function called actionPerformed where it gives the information about seat ID.
     * If the user selects "Go Back" button it redirects to ShowTimeListView GUI Page.
     * @param: e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        SeatsView.setSeatSelected(e.getActionCommand());
        Controller.setTicketDetails(SearchMovieView.getMovieSelected()+" - "+ShowTimeListView.getShowTimeSelected()+" - Seat:"+SeatsView.getSeatSelected());
        System.out.println("Ticket details are - "+Controller.getTicketDetails());
        if(e.getActionCommand().equals("1")){
            MainView.getCardLayout().show(MainView.getCardPanel(),"Seats");
            ShowTimeListView.getjPanel().setVisible(false);

        }
        else if(e.getActionCommand().equals("Go Back")){
            MainView.getCardLayout().show(MainView.getCardPanel(),"ShowTimes");
            ShowTimeListView.getjPanel().setVisible(true);
            Controller.setTicketDetails("");
            SeatsView.setSeatSelected("");
        }


    }
}
