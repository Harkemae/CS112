/**
 *Twitter.java
 *@author Erich Harkema
 *PLEDGE:
 *Desc: The Twitter class creates an array of valid tweets and invalid tweets, then outputs the valid and invalid 
 *tweets
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Twitter {

    public static void main (String []args) {
	Scanner scan;
	File Tweetdoc;
	 

	ArrayList<Tweet> Tweet;
	ArrayList<String> invalid;

	Tweet = new ArrayList();
	invalid = new ArrayList();
	

		try {
		 scan = new Scanner(Tweetdoc);
            	 Tweetdoc = new File ("Tweets.txt");
		
		}

`		catch(FileNotFoundException e) {
		e.printStackTrace(System.err);
		}


