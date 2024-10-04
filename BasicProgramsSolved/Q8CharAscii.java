package BasicPrograms;

import java.util.Scanner;

public class Q8CharAscii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char entchar = sc.next().charAt(0);
		int asciivalue = (int) entchar;
		System.out.println("ASCII Value of Character : "+asciivalue);
		sc.close();
	}
}
