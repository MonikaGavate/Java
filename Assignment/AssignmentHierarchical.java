package monika;
class Teacher1{
	void teach()
	{
		System.out.println("Teaching Subject");
	}
}
class Student1 extends Teacher1{
	void listen()
	{
		System.out.println("Listening");
	}
}
class Principal extends Teacher1{
	void evaluate()
	{
		System.out.println("Evaluating");
	}
}
public class AssignmentHierarchical {
    public static void main(String[] args) {
	 Principal p=new Principal();
	 p.evaluate();
	 p.teach();
	 //p.listen(); will produce an error
	}
}
