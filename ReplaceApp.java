/*
A.O'Dwyer
ReplaceApp.java
12.03.2024
*/
import java.util.*;
public class ReplaceApp{
	public static void main(String [] args){
		//Variables
		String word, newWord;
		//Objects
		Scanner keyboard=new Scanner(System.in);
		Replace myReplace=new Replace();
		//Input
		System.out.println("Please enter your word");
		word=keyboard.nextLine();
		myReplace.setWord(word);
		//Compute
		myReplace.compute();
		//Output
		newWord=myReplace.getNewWord();
		System.out.println("Your new word is "+newWord);
	}
}