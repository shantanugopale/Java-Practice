package ClassPrograms;

import java.util.Scanner;

public class ReverseTheNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any No : ");
		int n = sc.nextInt();
		int rev= 0,temp = n, rem;
		while(temp>0)
		{
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		System.out.println(rev);
		sc.close();
	}

}
