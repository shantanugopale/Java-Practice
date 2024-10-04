package ClassPrograms;

import java.util.Scanner;

public class PrimeNoFromRange {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x,n,i,count;
		System.out.println("Enter the Last Limit :");
		n = sc.nextInt();
		for(x = 2 ; x <= n ; x++)
		{
			count=0;
			for(i=2 ; i<= x/2 ; i++)
			{
				if(x % i == 0)
				{
					count ++;
				}
			}
			if(count == 0)
			{
				System.out.println(x);
			}
		}
	}
}
