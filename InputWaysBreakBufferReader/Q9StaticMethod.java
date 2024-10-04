package ClassPrograms;

class Forth
{
	// static block  ->> Always Executes without creating an Object
	static 
	{
		System.out.println("Hello....");
	}
	
	// Instance block
	{
		System.out.println("Hii...");
	}
}

class Q9StaticMethod {

	public static void main(String[] args) {
		Forth f1 = new Forth();
	}

}
