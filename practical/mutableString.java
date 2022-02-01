package monika;

public class mutableString {
   private String a;
	public mutableString(String a) {
		this.a=a;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mutableString m=new mutableString("MONIKA");
		System.out.println(m.getA());
		m.setA("GAVATE");
		System.out.println(m.getA());
		
		
	}

}
