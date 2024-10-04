package BasicPrograms;

import java.util.Scanner;

public class Q7EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Per Day Salary : ");
		float psal = sc.nextInt();
		System.out.println("Enter the Monthly Day : ");
		int mday = sc.nextInt();
		float msal = psal * mday;
		System.out.println("Monthly Salary : " + msal);
		System.out.println("Enter the Absent Day : ");
		int aday = sc.nextInt();
		float asal = aday * psal;
		System.out.println("Final Salary is : "+( msal - asal));
		sc.close();
	}

}
