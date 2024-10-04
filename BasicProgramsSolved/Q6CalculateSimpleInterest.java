package BasicPrograms;

import java.util.Scanner;

public class Q6CalculateSimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle : ");
		float principle = sc.nextInt();
		System.out.println("Enter the RateOfInterest : ");
		float roi = sc.nextInt();
		System.out.println("Enter the Time : ");
		int time = sc.nextInt();
		float si = (principle * roi * time) / 100;
		System.out.println("Simple Interest "+ si);
		sc.close();
	}

}
