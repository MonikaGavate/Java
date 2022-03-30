
public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	      Manager m=new Manager(126534,"Peter","Chennai India",237844,65000);
       System.out.println("Calculated Salary for Manager="+m.calculateSalary());
     Trainee t=new Trainee(29846, "Jack", "Mumbai India",442085,45000);
       System.out.println("Calculated Salary for Trainee="+t.calculateSalary());
       System.out.println("calculated transport allownce salary for manager="+m.calculateTransportAllownce());

       //System.out.println("calculated transport allownce salary for trainee="+t.calculateTransportAllownce());
    		 
	}

}
