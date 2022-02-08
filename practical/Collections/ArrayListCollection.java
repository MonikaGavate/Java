package monika;

import java.util.*;

public class ArrayListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>list=new ArrayList<String>();//Creating arraylist
list.add("Ravi");//Adding object in arrayList
list.add("Vijay");
list.add("Ravi");
list.add("Ajay");
//Traversing list through iterator
Iterator<String> itr=list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
	}

}