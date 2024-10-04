package ClassPrograms;

import java.util.Scanner;

public class Q10ScNextLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details....\nRno\nName\nMarks");
		int rno = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		int marks = sc.nextInt();
		System.out.println("Rno :"+rno + "\tName "+name+"\tMarks :"+marks);
		sc.close();
	}
}
