/*
A.O'Dwyer
Replace.java
12.03.2024
*/
//Application to replace a charachter 'a' with a star
public class Replace{
	//Variable
	private String word;
	private StringBuffer strBuff;
	private String newWord;
	//Constructor
	public Replace(){
		word="";
		strBuff=new StringBuffer();
		newWord="";
	}
	//Setter
	public void setWord(String word){
		this.word=word;
	}
	//Compute
	public void compute(){
		word=word.toLowerCase();//Changes word to same case toUpperCase() is the opposite.
		//Loop to get length of the word
		for(int i =0;i<word.length();i++){
			//Check word for a charachter 'a'.
			if(word.charAt(i)=='a'){
				strBuff.append('*');//Replace with a star
			}else{
				strBuff.append(word.charAt(i));
			}
		}
		//Converts the word in the StringBuffer to a word stored in newWord
		newWord=strBuff.toString();
	}
	public String getNewWord(){
		return newWord;
	}
}