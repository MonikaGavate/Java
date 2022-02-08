package monika;
import java.util.*;
public class ArrayListCollectionsAssi {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	ArrayList<String>list=new ArrayList<String>();//Creating arraylist
	list.add("Red");//Adding object in arrayList
	list.add("Green");
	list.add("Yellow");
	list.add("Orange");
	list.add("Purple");
	//Traversing list through iterator
	Iterator<String> itr=list.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	}
}
}

