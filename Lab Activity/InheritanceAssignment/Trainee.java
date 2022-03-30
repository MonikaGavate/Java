public class Trainee extends Employee{

		
        
		public Trainee(long id,String name,String address,long phone,double salary) {
			super(id, name, address,phone);
			this.e_id=id;
			this.e_name=name;
			this.e_address=address;
			this.e_phone=phone;
			this.basicSalary=salary;
		}
		public double calculateTransportAllownce() {
			double transportAllownce = 15*basicSalary/100;
			return transportAllownce;
			
		}
		
	}