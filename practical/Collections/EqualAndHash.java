package monika;

 class EqualAndHash {

	public static void main(String[] args) {
		EqualsAndHashCodeMethod g1=new EqualsAndHashCodeMethod("b",1);
		EqualsAndHashCodeMethod g2=new EqualsAndHashCodeMethod("b",1);
if(g1.hashCode()==g2.hashCode())
{
	if(g1.equals(g2))
		System.out.println("Both objects are equal.");
	else
		System.out.println("Both objects are not equal.");
}
else
	System.out.println("Both is objects are not equal.");

	}

}
