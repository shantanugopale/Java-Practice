package BasicPrograms;

import java.util.Scanner;

public class Q9AvgPer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 Number's");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		float total = num1 + num2 + num3 + num4 + num5;
		float avg = total/5;
		System.out.println("Average is : "+avg);
		float per = (total / (5 * 100)) * 100;
		
		System.out.println("Percentage is : "+per);
		sc.close();
	}

}
