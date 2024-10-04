package ClassPrograms;

import java.util.Scanner;

class First {
		int eid;
		String name;
		double salary;
		Scanner sc = new Scanner(System.in);
		void Accept()
		{
			System.out.println("Enter Eid\nName\nSalary");
			eid = sc.nextInt();
			name = sc.next();
			salary = sc.nextDouble();
		}
		
		void Display()
		{
			System.out.println("Eid :"+eid+"\tName :"+name+"\tSalary :"+salary);
		}

}

class Q6DefaultMethod
{
	public static void main(String[] args) {
		First m1 = new First();
		m1.Accept();
		m1.Display();
	}
}
