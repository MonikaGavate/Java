package monika;
import java.util.*;
public class TreeSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String>set=new TreeSet<String>();
set.add("Ravi");
set.add("Vijay");
set.add("Ravi");
set.add("Ajay");
Iterator<String> itr=set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
	}

}
