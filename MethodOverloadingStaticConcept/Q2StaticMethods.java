package ClassPrograms;

class First
{
	static int rno = 101;
	String name = "Shantanu";
	int marks = 99;
	
	static void getData()
	{
//		System.out.println(rno + " " + name + " " + marks);  Static Method Always Access only Static Data Members
	}
}
public class Q2StaticMethods {
	public static void main(String[] args)
	{
		First.getData(); // If static method in another class, then we have to call it in main method through its ClassName.StaticMethodName 
	}
}
