/**
 *Tweet.java
 *@author Erich Harkema
 *PLEDGE:
 *Desc: The Tweet class checks a Tweet for validity before allowing it to be displayed in the toString method
 */

import java.util.Date;

public class Tweet {

    private int currentDate;  //sets the current Date variables to track the msg date
    private String message;  // creates the string value for a twitter message

    public Tweet() {
	this.currentDate = currentDate;
       
	
    }

    public static boolean isValidMessage(String message) {
	
	if (message.length() > 0 && message.length() <=140)
	    return true;
	else
	    return false;
    }

    
	public void setMessage(String message) {
        this.message = message;

	}

    public String toString() {

	return ("" + currentDate + "" + message);
    }
}