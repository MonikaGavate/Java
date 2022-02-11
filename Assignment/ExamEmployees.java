package monika;

class ExamEmployees {
private int id;
private String name;
private int salary;

	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ExamEmployees e1=new ExamEmployees();
 ExamEmployees e2=new ExamEmployees();
 ExamEmployees e3=new ExamEmployees();
  e1.setId(1);
  e1.setName("Monika");
  e1.setSalary(10000);
  e2.setId(2);
  e2.setName("Anuja");
  e2.setSalary(20000);
  e3.setId(3);
  e3.setName("Akash");
  e3.setSalary(30000);
  System.out.println("id is:"+e1.getId());
  System.out.println("name is:"+e1.getName());
  System.out.println("salary is:"+e1.getSalary());
  System.out.println("id is:"+e2.getId());
  System.out.println("name is:"+e2.getName());
  System.out.println("salary is:"+e2.getSalary());
  System.out.println("id is:"+e3.getId());
  System.out.println("name is:"+e3.getName());
  System.out.println("salary is:"+e3.getSalary());
	}

}
