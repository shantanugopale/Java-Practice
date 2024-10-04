package ClassPrograms;

import java.util.Scanner;

public class WeekDaysProgramBySwitch {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("Enter your Choice :");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 :
					System.out.println("It's Sunday");
					break;
			
				case 2 :
					System.out.println("It's Monday");
					break;
	
				case 3 :
					System.out.println("It's Tuesday");
					break;	
				case 4 :
					System.out.println("It's Wednesday");
					break;	
				case 5 :
					System.out.println("It's Thursday");
					break;	
				case 6 :
					System.out.println("It's Friday");
					break;
					
				case 7 :
					System.out.println("It's Saturday");
					break;
					
				case 8 :
					System.exit(0);
					
				default :
					System.out.println("Invalid Choice....!!!!");
			}
		}while(choice!=8);
			
		}

}
