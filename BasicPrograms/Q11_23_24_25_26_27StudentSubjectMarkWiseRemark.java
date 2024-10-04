package BasicPrograms;

import java.util.Scanner;

public class Q11_23_24_25_26_27StudentSubjectMarkWiseRemark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of 5 Subjects of a Student :");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int sub4 = sc.nextInt();
		int sub5 = sc.nextInt();
		int Total = sub1 + sub2 + sub3 + sub4 + sub5;
		float per = Total / 5;
		System.out.println("Total Percentage of Student is :"+per);
		if ( per >= 75 )
		{
			System.out.println("You Got the Distinction");
		}
		else if( per >= 60 )
		{
			System.out.println("You Got the First Class");
		}
		else if( per >= 45 )
		{
			System.out.println("You Got the Second Class");
		}
		else if( per >= 35 )
		{
			System.out.println("You Are Pass..");
		}
		else
		{
			System.out.println("You are Failed");
		}
		sc.close();
	}

}
