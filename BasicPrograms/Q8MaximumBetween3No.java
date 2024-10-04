package BasicPrograms;

import java.util.Scanner;

public class Q8MaximumBetween3No {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1'st Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2'nd Number");
		int num2 = sc.nextInt();
		System.out.println("Enter the 3'rd Number");
		int num3 = sc.nextInt();
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(num1 + " Maximum than "+ num2 +" and " + num3);
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println(num2 + " Maximum than "+ num1 +" and " + num3);
		}
		else
		{
				System.out.println(num3 + " Maximum than "+ num1 +" and " + num2);
		}
		sc.close();
	}

}
