package BasicPrograms;

import java.util.Scanner;

public class Q4MaxNoFromTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First No :");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second No :");
		int num2 = sc.nextInt();
		if(num1 > num2)
		{
			System.out.println(num1 + " is Greater than " + num2);
		}
		else
		{
			System.out.println(num2 + " is Greater than " + num1);
		}
		sc.close();
	}

}
