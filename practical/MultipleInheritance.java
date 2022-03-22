package monika;
interface parent1{
	void display();
	
	}

interface parent2{
	void display1();
}

public class MultipleInheritance implements parent1,parent2 {

	public void display()
	{
		System.out.println("parent 1 executed");
	}
	public void display1()
	{
		System.out.println("parent 2 executed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultipleInheritance m=new MultipleInheritance();
m.display();
m.display1();
	}
	
}
