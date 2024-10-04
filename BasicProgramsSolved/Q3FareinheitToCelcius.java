package BasicPrograms;

import java.util.Scanner;

public class Q3FareinheitToCelcius {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temprature in Farenheit");
		float fartemp = sc.nextFloat();
		float celtemp = (fartemp - 32) * 5 / 9;
		System.out.println("The Temprature in Celcius is "+celtemp);
		sc.close();
	}
}
