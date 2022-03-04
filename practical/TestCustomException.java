//Eg of user define compile time Exception
package com;

class InvalidException extends Exception{
	
	public InvalidException(String str) {
		
		super(str);
	}
}

public class TestCustomException {
	
	static void validate(int age) throws InvalidException{
		
		if(age <=18) {
			throw new InvalidException("you cannot be enrolled into Anudip Training");
		}
		else {
			System.out.println("Welcome to Anudip Training center");
		}
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	
		try {
			validate(1);
		} catch (InvalidException e) {
		// TODO Auto-generated catch block
		
			System.out.println(e);
		   }

}

}

