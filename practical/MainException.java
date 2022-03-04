//Eg of Runtime User define Exception
package com;

import java.util.ArrayList;
import java.util.Arrays;

// CustomException/MyException representing user defined 
class MyException extends RuntimeException{
	public MyException(String msg) {
		// call constructor
		super(msg);
	}
	
}

public class MainException {
	ArrayList<String> langs = new ArrayList<>(Arrays.asList("Java","Python","CSS","HTML","PHP"));
	
	//check exception condition
	public void check(String lang) throws MyException {
		
		//throw exeception if language already present in list
	if(langs.contains(lang)) {
		throw new MyException(lang + "  language already exists in list");
	}
	else {
		//insert(add) language to Arraylist
		langs.add(lang);
		System.out.println(lang +" added to list");
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainException obj = new MainException();
			 //check language already exists or not
			obj.check("React JS");
			obj.check("DotNet");  
	     	obj.check("CSS");		
		
	}
}
