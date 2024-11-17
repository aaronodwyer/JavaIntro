/*
A.O'Dwyer
PPSNumber.java
21.02.2024
*/
public class PPSNumber{
	private String number;
	private String message;

		//Variables

		//Constructor
	public PPSNumber(){
		this.number="";
		this.message="";
	}//public closed
	//Setters
	public void setNumber(String number){
		this.number=number;
	}

	//Compute
	public void compute(){
		for(int i=0;i<number.length();i++){
			if(number.length()=='8'){
				if((number.charAt(number.length()-1)=='A'||number.charAt(number.length()-1)=='E'||number.charAt(number.length()-1)=='I'||number.charAt(number.length()-1)=='O'||number.charAt(number.length()-1)=='U')){
					message="This is a valid PPS Number";
				}else{
					message="This is not a valid PPS Number";
				}//Second if done
			}else{
				message="This is not a valid PPS Number";
			}//first of done
		}//for closed
	}//Compute closed
	//Getters
	public String getMessage(){
		return message;
	}
}//Class closed