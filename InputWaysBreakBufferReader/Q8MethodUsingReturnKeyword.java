package ClassPrograms;


class Third
{
	int add(int a, int b)
	{
		return(a+b);
	}
}
class Q8MethodUsingReturnKeyword {

	public static void main(String[] args) {
		Third t1 = new Third();
		//System.out.println(t1.add(10, 20));
		int c = t1.add(22, 20);
		System.out.println("Addition :"+c);
		if(c % 2 == 0)
		{
			System.out.println("Ans is Even");
		}
		else
		{
			System.out.println("Ans is Odd");
		}
			

	}

}
