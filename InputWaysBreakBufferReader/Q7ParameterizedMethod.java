package ClassPrograms;

class Second
{
	int eid;
	String name;
	double salary;
	void Accept(int eid, String name, double salary)
	{
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	void Display()
	{
		System.out.println("Eid :"+eid+"\tName :"+name+"\tSalary :"+salary);
	}
}

class Q7ParameterizedMethod {

	public static void main(String[] args) {
		Second f1 = new Second();
		f1.Accept(101,"Shantanu",2172291);
		f1.Display();

	}

}
