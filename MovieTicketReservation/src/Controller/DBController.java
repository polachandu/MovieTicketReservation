package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBController {

    private static Connection myConnection;
    private Statement statement;
    private static String connectInfo = "jdbc:mysql://localhost:3306/ticketreservation";
    private static String login = "root";
    private static String password = "rootmp9089";

    public Connection getMyConnection() {
        return myConnection;
    }

    public void setMyConnection(Connection myConnection) {
        this.myConnection = myConnection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    private static DBController dbController = null;

    private DBController() {
        try {
            myConnection = DriverManager.getConnection(connectInfo, login, password);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    public static DBController getDbController() {
        if (dbController == null) {
            dbController = new DBController();
        }
        return dbController;
    }


    public ResultSet getFromDB(String query) {
        ResultSet result = null;
        try {
            statement = myConnection.prepareStatement(query);
            result = statement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int insertOrDelete(String query) {
        try {
            statement = myConnection.createStatement();
            return statement.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }


}
