package Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import Controller.DBController;
import Model.RegisteredUser;

public class RegistrationDB {

	private static DBController db = DBController.getDbController();
	
	public int register(RegisteredUser user) {
    	if(validateRegistration(user)) {
//    		DBController db = new DBController();
    		LocalDate date = LocalDate.now();
    		String query = "INSERT INTO REGISTERED_USER (username, uPassword, paymentInfo, email, registrationDate)"
    				+ "VALUES ('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getPaymentInfo()+"','"+user.getEmailAddress()+"','"+date.toString()+"')";
    		
    		return db.insertOrDelete(query);
    	}
    	return -1; 	
    }
	
	private boolean validateRegistration(RegisteredUser user) {
//    	DBController db = new DBController();
    	
    	String query = "SELECT * FROM REGISTERED_USER WHERE username = '"+user.getUsername()+"' OR email = '"+user.getEmailAddress()+"'";
    	
    	ResultSet result = db.getFromDB(query);
    	
    	try {
			if(result.next()) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return true;
    }
}
