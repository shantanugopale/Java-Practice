package BasicPrograms;

import java.util.Scanner;

public class Q1NoPositiveNeg {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NO which you wanna Check : ");
		int no = sc.nextInt();
		if(no == 0)
		{
			System.out.println("No is Neither be +'ve nor -'ve");
		}
		else if(no > 0)
		{
			System.out.println("No is Positive");
		}
		else
		{
			System.out.println("No is Negative");
		}
		sc.close();
	}

}
