package monika;
class Teacher{
	void teach()
	{
	System.out.println("Teaching subject");	
	}
 }
class Student extends Teacher{
	void listen()
	{
		System.out.println("Listening");
	}
}
class homeTution extends Students{
	void explains()
	{
		System.out.println("Does homework");
	}
}
public class AssignmentMultilevel {

	public static void main(String[] args) {
		homeTution h=new homeTution();
        h.explains();
        h.listen();
        h.teach();
	}

}
