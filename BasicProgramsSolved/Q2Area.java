package BasicPrograms;

import java.util.Scanner;

public class Q2Area {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("For Cicle");
		System.out.println("Enter Radius :- ");
		int radius = sc.nextInt();
		float carea = 3.14f * radius * radius;
		System.out.println("Area Of Circle is " + carea);
		System.out.println("For Rectangle");
		System.out.println("Enter the Height");
		int height = sc.nextInt();
		System.out.println("Enter the Breadth");
		int breadth = sc.nextInt();
		int rarea = height * breadth;
		System.out.println("Area of Rectangle " + rarea);
		System.out.println("For Triangle");
		System.out.println("Enter the Height");
		int heightTri = sc.nextInt();
		System.out.println("Enter the Breadth");
		int breadthTri = sc.nextInt();
		float tarea = 0.5f * heightTri * breadthTri;
		System.out.println("Area of Triangle " + tarea);
		System.out.println("For Square");
		System.out.println("Enter the Side");
		int side = sc.nextInt();
		float sarea = side * side;
		System.out.println("Area of Square " + sarea);
		sc.close();
	}
}
