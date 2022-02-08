package monika;

import java.util.*;

public class LinkedListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>al=new LinkedList<String>();//Creating arraylist
al.add("Ravi");//Adding object in arrayList
al.add("Vijay");
al.add("Ravi");
al.add("Ajay");
//Traversing list through iterator
Iterator<String> itr=al.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
	}
	}
}
