package BasicPrograms;

import java.util.Scanner;

public class Q3userSalaryPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary of User :");
		int sal = sc.nextInt();
		if(sal > 15000)
		{
			sal += 3000;
		}
		else
		{
			sal +=1000;
		}
		System.out.println("The Final Salary is :"+sal);
		sc.close();
	}

}
