package ClassPrograms;

import java.util.Scanner;

public class CheckEnteredNoPerfectOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number to Check Perfect or Not :");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1 ; i<n/2; i++)
		{
			if( n%i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum == n)
		{
			System.out.println("Enter No is Perfect");
		}
		else
		{
			System.out.println("Enter No is Not Perfect");
		}
		sc.close();
	}

}
