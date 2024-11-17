/*
A.O'Dwyer
Switch.java
18.02.2024
*/

import java.util.*;
public class SwitchApp{
	public static void main(String [] args){
		//Variables
		String answer;
		String month;

		//Objects
		Scanner keyboard= new Scanner(System.in);
		Switch mySwitch= new Switch();

		//Inputs
		System.out.println("Please enter the month you are inquiring about.");
		month=keyboard.nextLine();
		mySwitch.setMonth(month);

		mySwitch.compute();

		answer=mySwitch.getAnswer();
		System.out.println(answer);
	}

}