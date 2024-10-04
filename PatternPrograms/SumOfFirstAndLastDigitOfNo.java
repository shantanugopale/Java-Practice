package ClassPrograms;

import java.util.Scanner;

public class SumOfFirstAndLastDigitOfNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int n = sc.nextInt();
		int sum = 0;
		int ld,fd;
		fd = n;
		ld = n % 10;
		System.out.println("Last Digit :"+ld);
		while ( n > 0)
		{
			fd = n % 10;
			n = n / 10;
		}
		System.out.println("First Digit :"+fd);
		sum = ld + fd;
		System.out.println("Ans :"+sum);
		sc.close();
	}

}
