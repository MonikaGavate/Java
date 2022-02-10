//write a program to sort string objects in order
package monika;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingAssi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("Monika");
al.add("Anuja");
al.add("Sakshi");
al.add("Pooja");
al.add("Manisha");
al.add("Rani");
Collections.sort(al);
System.out.println(al);
	}

}
