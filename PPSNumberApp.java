/*
A.O'Dwyer
PPSNumber.java
21.02.2024
*/
import java.util.*;
public class PPSNumberApp{
	public static void main(String  args[]){
		//Variables
		String message;
		String number;
		//Objects
		Scanner keyboard=new Scanner(System.in);
		PPSNumber myPPSNumber=new PPSNumber();
		//Inputs
		System.out.println("Please enter your PPS Number which should end in a Capital Vowel i.e. A,E,I,O and U");
		number=keyboard.nextLine();
		myPPSNumber.setNumber(number);
		//Compute
		myPPSNumber.compute();

		message=myPPSNumber.getMessage();
		System.out.println(message);


	}
}