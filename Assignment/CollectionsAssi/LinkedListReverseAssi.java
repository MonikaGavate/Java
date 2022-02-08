package monika;
import java.util.*;

public class LinkedListReverseAssi {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	LinkedList<String>al=new LinkedList<String>();//Creating arraylist
	al.add("Ravi");//Adding object in arrayList
	al.add("Vijay");
	al.add("Ravi");
	al.add("Ajay");
	al.add("Monika");
	//Traversing list through iterator
	Iterator<String> itr=al.descendingIterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
		}
		}
	}


