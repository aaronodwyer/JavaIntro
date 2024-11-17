/*
A.O'Dwyer
Switch.java
18.02.2024
*/

import java.util.*;
public class Switch{
	private String month;
	private String answer;

	//Constructor
	public Switch(){
		month="";
		answer="";
	}

	public void setMonth(String monthPassedIn){
		this.month=monthPassedIn;
	}

	public void compute(){
		switch(month.toLowerCase()){
			case "Jan":
			answer= "31 Days";
			break;
			case "Feb":
			answer= "28 Days";
			break;
			case "Mar":
			answer= "31 Days";
			break;
			case "Apr":
			answer="31 Days";
			break;
			case "Jun":
			answer="30 Days" ;
			break;
			case "Jul":
			answer= "31 Days" ;
			break;
			case "Aug":
			answer= "31 Days" ;
			break;
			case "Sep":
			answer= "30 Days";
			break;
			case "Oct":
			answer= "31 Days" ;
			break;
			case "Nov":
			answer=  "31 Days";
			break;
			case "Dec":
			answer= "31 Days";

		}
	}

		public String getAnswer(){
			return answer;

	}


}