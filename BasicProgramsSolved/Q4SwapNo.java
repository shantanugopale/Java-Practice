package BasicPrograms;

import java.util.Scanner;

public class Q4SwapNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1'st No : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2'nd No : ");
		int num2 = sc.nextInt();
		System.out.println("Before swapping " + "\tFirst No : "+num1+"\tSecond No : "+num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping " + "\tFirst No : "+num1+"\tSecond No : "+num2);
		sc.close();
	}
}
