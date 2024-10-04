package ClassPrograms;


class Employee {
	
	int eid;
	String name;
	int salary;
	void getData()
	{
		eid = 101;
		name = "Shantanu";
		salary = 9000000;
		System.out.println("Eid :"+eid+"\tName :"+name+"\tSalary :"+salary);
	}
	
	void getData(int eid, String name, int salary)
	{
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		
		System.out.println("Eid :"+eid+"\tName :"+name+"\tSalary :"+salary);
	}
	
	void getData(String name)
	{
		this.name = name;
		System.out.println("Name :"+name);
	}
}
public class Q1MethodOverloading {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.getData();
		e1.getData(101,"ShantanuGopale",9999999);
		e1.getData("ShantanuDnyaneshwarGopale");
	}

}
