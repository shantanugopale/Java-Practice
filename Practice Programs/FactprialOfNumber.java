package ClassPrograms;

import java.util.Scanner;

public class FactprialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number :");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=n; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial is :"+fact);
		sc.close();
	}

}
