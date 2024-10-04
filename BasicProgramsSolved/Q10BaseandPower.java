package BasicPrograms;

import java.util.Scanner;

public class Q10BaseandPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Base : ");
		int base = sc.nextInt();
		System.out.println("Enter the Power : ");
		int power = sc.nextInt();
		double result = Math.pow(base, power);
		System.out.println("The Result is : " + result);
		sc.close();

	}

}
