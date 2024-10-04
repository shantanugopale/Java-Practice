package BasicPrograms;

import java.util.Scanner;

public class Q10IfNoPositiveCheckEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		if(num == 0)
		{
			System.out.println("Number is Zero...It's neither positive nor negative");
		}
		else if( num > 0)
		{
			System.out.println("Number is Positive");
			if(num % 2 == 0)
			{
				System.out.println("Number is Even");
			}
			else
			{
				System.out.println("Number is Odd");
			}
		}
		else
		{
			System.out.println("Number is Negative");
		}
		sc.close();
	}

}
