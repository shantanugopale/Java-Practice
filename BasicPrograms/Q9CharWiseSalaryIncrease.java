package BasicPrograms;

import java.util.Scanner;

public class Q9CharWiseSalaryIncrease {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character :");
		char c = sc.next().charAt(0);
		System.out.println("Enter the Salary :");
		int sal = sc.nextInt();
		if ( c == 'f' || c == 'F')
		{
			sal+=1900;
			System.out.println("Salary Increased by 1900");
			System.out.println("Total Salary is "+sal);
		}
		else if( c == 'm' || c == 'M')
		{
			sal+=1500;
			System.out.println("Salary Increased by 1500");
			System.out.println("Total Salary is "+sal);
		}
		else
		{
			System.out.println("Total Salary is "+sal);
		}
		sc.close();
	}

}
