package BasicPrograms;

import java.util.Scanner;

public class Q5CheckDivisbleBy3or7 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number you wanto check Divisible by 3 or 7");
		int num = sc.nextInt();
		if(num % 3 == 0 || num % 7 == 0)
		{
			System.out.println("is Divisible by 3 or 7");
		}
		else
		{
			System.out.println("is Not Divisible by 3 or 7");

		}
		sc.close();
	}
}
