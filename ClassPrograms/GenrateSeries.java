package ClassPrograms;

import java.util.Scanner;

public class GenrateSeries {

	public static void main(String[] args) {
		int i, n, x;
		float sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number :");
		x = sc.nextInt();
		System.out.println("Enter the No of Terms :");
		n = sc.nextInt();
		for( i=1; i<n; i++)
		{
			System.out.println(x + " / " + x + " ^ " + i + " + ");
			sum = (float) (sum + x / Math.pow(x, i));
		}
		System.out.printf("Sum = %2f", sum);
		sc.close();
	}

}
