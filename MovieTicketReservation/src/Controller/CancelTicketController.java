package Controller;

import View.CancelTicketView;
import View.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.RegisteredUser;
import Model.Ticket;

public class CancelTicketController implements ActionListener {
	CancelTicketView cancelTicketView;
    MainView mv = new MainView();

    public CancelTicketController(CancelTicketView ctv){
        this.cancelTicketView = ctv;
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
    	Ticket cancelTicket = new Ticket();
    	
    	if(e.getSource() == cancelTicketView.getBackButton()) {
			mv.getCardLayout().show(mv.getCardPanel(),"LandingPage");
	      }
    	else if(e.getSource() == cancelTicketView.getSubmitButton()) { 
    		
    		if(Integer.toString(cancelTicketView.getTicketID()).equals("") ) {				
    			cancelTicketView.showMessage("Please enter valid id");
			}
    		else  if(cancelTicket.cancelTicket(cancelTicketView.getTicketID()) == true) {					
        			cancelTicketView.showMessage("Ticket ID is  matched :: "+cancelTicketView.getTicketID()+"Hour is "+LocalDateTime.now().getHour());
        		}
        		else {
        			cancelTicketView.showMessage("Ticket ID is not matched");
        		} 
			}	
		}
    
}
