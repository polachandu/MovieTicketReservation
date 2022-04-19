package Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import Controller.DBController;
import Model.RegisteredUser;

public class LoginDB {

	private static DBController db = DBController.getDbController();
	
	public RegisteredUser login(RegisteredUser user) {
//    	DBController db = new DBController();
    	String query = "SELECT * FROM REGISTERED_USER WHERE username = '"+user.getUsername()+"' AND uPassword = '"+user.getPassword()+"'";
    	ResultSet result = db.getFromDB(query);
    	try {
			if(result.next()) {
				RegisteredUser ru = new RegisteredUser();
				ru.setUsername(result.getString("username"));
				ru.setPassword(result.getString("uPassword"));
				ru.setPaymentInfo(result.getString("paymentInfo"));
				ru.setEmailAddress(result.getString("email"));
				ru.setRegistrationDate(result.getString("registrationDate"));
				
				return ru;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return null;
    }
    
    public boolean validateLogin(RegisteredUser user) {
//    	DBController db = new DBController();
    	String query = "SELECT * FROM REGISTERED_USER WHERE username = '"+user.getUsername()+"' AND uPassword = '"+user.getPassword()+"'";
    	ResultSet result = db.getFromDB(query);
    	try {
			if(result.next()) {				
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return false;
    }
}
