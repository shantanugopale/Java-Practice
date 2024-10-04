package BasicPrograms;

import java.util.Scanner;

public class Q2NoEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No you wanna Check Even or Odd");
		int no = sc.nextInt();
		if(no % 2 == 0)
		{
			System.out.println("No is Even");
		}
		else
		{
			System.out.println("No is Odd");
		}
		sc.close();
	}

}
