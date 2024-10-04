package BasicPrograms;

import java.util.Scanner;

public class Q11SqaureRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num = sc.nextInt();
		System.out.println("Square Root of a Number " + (Math.sqrt(num)));
		sc.close();
	}
}
