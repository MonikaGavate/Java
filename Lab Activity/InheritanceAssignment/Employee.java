
class Employee {
	public long e_id;
	public String e_name;
	public String e_address;
	public long e_phone;
	public double basicSalary;
	public double specialAllownced=250.80;
	public double Hra=1000.50;
	
	public Employee(long e_id, String e_name, String e_address, long e_phone) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_address = e_address;
		this.e_phone = e_phone;
	}
	double salary;
	public double calculateSalary() {
	salary = basicSalary+(basicSalary*specialAllownced/100)+(basicSalary*Hra/100);
		return salary;
		}
	
	public double calculateTransportAllownce() {
		double transportAllownce = 10/100*basicSalary;
			return transportAllownce;
		
	}
	

	
	
}

