package ClassPrograms;

public class first10NoUsingFor {

	public static void main(String[] args) {
		// First Way
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		// Second Way
		int j=1;
		for( ; j<=10; j++)
		{
			System.out.println(j);
		}
		
		// Third Way
		for(int i=1, k=1 ; i<=10 & k<=10; i++, k++) {
			System.out.println(i + " " + k);
		}
	}
}
