//write a program to sort string objects in reverse order
package monika;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverseAssi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> list=new ArrayList<String>();
     list.add("Ajay");
     list.add("vijay");
     list.add("Ravi");
     list.add("monika");
     list.add("Akash");
     list.add("Anuja");
Collections.reverse(list);
System.out.println(list);
	}

}
