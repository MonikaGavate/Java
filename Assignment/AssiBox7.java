package monika;

public class AssiBox7 {

	 int width;
	 int height; 
	int length; 
	} 
	class mainclass 
	{
	 public static void main(String args[]) 
	{
	 AssiBox7 obj = new AssiBox7(); 
	obj.width = 10; 
	obj.height = 2;
	 obj.length = 10;
	 int y = obj.width * obj.height * obj.length;
	 System.out.print(y); 
	} }