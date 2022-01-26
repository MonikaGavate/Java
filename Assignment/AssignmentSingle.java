
package monika;
class Teacher{
	void teach()
	{
		System.out.println("Teaching subjects");
	}
}
class Students extends Teacher{
	void listen()
	{
		System.out.println("Listening to teacher");
	}
}
public class AssignmentSingle {
       public static void main(String[] args) {
	   Students s1=new Students();
	   s1.teach();
	   s1.listen();
	}
}


*****o/p*****
Teaching subject
Listening to teacher
