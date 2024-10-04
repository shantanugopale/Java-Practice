package BasicPrograms;

import java.util.Scanner;

public class Q1Add {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two No's");
		System.out.println("Enter 1'nd No's");
		int num1 = sc.nextInt();
		System.out.println("Enter 2'nd No's");
		int num2 = sc.nextInt();
		System.out.println("Addition is " + (num1 + num2));
		sc.close();
	}
}