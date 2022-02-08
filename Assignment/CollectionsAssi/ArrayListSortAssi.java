package monika;
import java.util.*;
public class ArrayListSortAssi {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();//Creating arraylist
		list.add("Ravi");//Adding object in arrayList
		list.add("Akash");
		list.add("Ravi");//arraylist can be used to store duplicate data
		list.add("Ajay");
		list.add("Monika");
		list.add("Sakshi");
		list.add("Anuja");
	Collections.sort(list);   
		//Traversing list through iterator
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
			}

		}

