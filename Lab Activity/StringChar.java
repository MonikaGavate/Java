//Java program to count the total number of characters in a string?
public class StringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Monika Gavate";
int count=0;
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)!=' ')
	count++;
}
System.out.println("Total no of character "+count);
	}

}
