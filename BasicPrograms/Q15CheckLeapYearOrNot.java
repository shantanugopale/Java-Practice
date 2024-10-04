package BasicPrograms;

import java.util.Scanner;

public class Q15CheckLeapYearOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year Which you wanna Check Leap year or Not..?");
		int year = sc.nextInt();
		if( year % 4 == 0)
		{
			System.out.println(year + " Year is Leap Year");
		}
		else
		{
			System.out.println(year + " Year is Not a Leap Year");
		}
		sc.close();
	}

}
