package ClassPrograms;

import java.util.Scanner;

public class SumOfFirstNNo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number :");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum is :"+sum);
		sc.close();
	}
}
