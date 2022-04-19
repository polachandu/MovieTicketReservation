package Model;
/**
 * Created a class called ShowTime which has day,time.
 */
public class ShowTime {
    private String day;
    private String time;

    /**
     * Constructor constructs the ShowTime by allowing the parameters mentioned below
     * @param day
     * @param time
     */
    public ShowTime(String day, String time) {
        this.day = day;
        this.time = time;
    }
    /**
     * Created a function called getDay. It returns the day
     * @param : no parameters passed
     * @return : day
     */
    public String getDay() {
        return day;
    }
    /**
     * Created a function method called setDay.It updates the day which is given in the parameter.
     * @param: day
     * @return: no return value
     */
    public void setDay(String day) {
        this.day = day;
    }
    /**
     * Created a function called getTime. It returns the time
     * @param : no parameters passed
     * @return : time
     */
    public String getTime() {
        return time;
    }
    /**
     * Created a function method called setTime.It updates the time which is given in the parameter.
     * @param: time
     * @return: no return value
     */
    public void setTime(String time) {
        this.time = time;
    }
}
