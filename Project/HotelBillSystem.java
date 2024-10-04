package Project;

import java.util.Scanner;

public class HotelBillSystem {

	public static void main(String[] args) {
		int choice,tq,cq,pq,bq,total=0,tp,cp,pp,bp;
		Scanner sc = new Scanner(System.in);
		System.out.println("**********WELCOME********");
		do {
			System.out.println("Enter Your Choice :\n1-Tea\n2-Coffee\n3-Pizzaa\n4-Burger\n5-Print the Total Bill\n6-Closed the Order");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1 : 
				System.out.println("Your Select a Tea :\n Plz Select the Variaties\n1-Normal Tea @Rs-10\n2-Black Tea @Rs-20\n3-Lemon Tea @Rs-30\n4-Green Tea @Rs-40\n5-Go to Main Menu");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter the Quantity :");
					tq = sc.nextInt();
					tp = 10;
					total = total + (tp * tq);
					System.out.println(tq +"Normal Tea Order Placed");
					break;
				case 2:
					System.out.println("Enter the Quantity :");
					tq = sc.nextInt();
					tp = 20;
					total = total + (tp * tq);
					System.out.println(tq +"Black Tea Order Placed");
					break;
				case 3:
					System.out.println("Enter the Quantity :");
					tq = sc.nextInt();
					tp = 30;
					total = total + (tp * tq);
					System.out.println(tq +"Lemon Tea Order Placed");
					break;
				case 4:
					System.out.println("Enter the Quantity :");
					tq = sc.nextInt();
					tp = 40;
					total = total + (tp * tq);
					System.out.println(tq +"Green Tea Order Placed");
					break;
				default:
					System.out.println("");
				}
				
				break;
			case 2 : 
				System.out.println("Your Select a Coffee :\n Plz Select the Variaties\nNormal Coffee @Rs-40\nBlack Coffee @Rs-70\nChocolate Coffee @Rs-100\nFiltered Coffee @Rs-90");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter the Quantity :");
					cq = sc.nextInt();
					cp = 40;
					total = total + (cp * cq);
					System.out.println(cq +"Normal Coffee Order Placed");
					break;
				case 2:
					System.out.println("Enter the Quantity :");
					cq = sc.nextInt();
					cp = 70;
					total = total + (cp * cq);
					System.out.println(cq +"Black Coffee Order Placed");
					break;
				case 3:
					System.out.println("Enter the Quantity :");
					cq = sc.nextInt();
					cp = 100;
					total = total + (cp * cq);
					System.out.println(cq +"Chocolate Coffee Order Placed");
					break;
				case 4:
					System.out.println("Enter the Quantity :");
					cq = sc.nextInt();
					cp = 90;
					total = total + (cp * cq);
					System.out.println(cq +"Filtered Coffee Order Placed");
					break;
				default:
					System.out.println("Enter Valid Choice....");
				}
				
				break;
			case 3 : 
				System.out.println("Your Select a Pizzaa :\n Plz Select the Variaties\nNormal Pizza @Rs-120\nPaneer Pizza @Rs-220\nMushroom Pizza @Rs-380\nOnion Pizza @Rs-280");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter the Quantity :");
					pq = sc.nextInt();
					pp = 120;
					total = total + (pp * pq);
					System.out.println(pq +"Normal Pizza Order Placed");
					break;
				case 2:
					System.out.println("Enter the Quantity :");
					pq = sc.nextInt();
					pp = 220;
					total = total + (pp * pq);
					System.out.println(pq +"Paneer Pizza Order Placed");
					break;
				case 3:
					System.out.println("Enter the Quantity :");
					pq = sc.nextInt();
					pp = 380;
					total = total + (pp * pq);
					System.out.println(pq +"Mushroom Pizza Order Placed");
					break;
				case 4:
					System.out.println("Enter the Quantity :");
					pq = sc.nextInt();
					pp = 280;
					total = total + (pp * pq);
					System.out.println(pq +"Onion Pizza Order Placed");
					break;
				default:
					System.out.println("Enter Valid Choice.....");
				}
				
				break;
			case 4 : 
	     		System.out.println("Your Select a Burger :\n Plz Select the Variaties\nIndian Burger @Rs-15\nCheese Burger @Rs-80\nCheese Garlic Burger @Rs-100\nSpicy Burger @Rs-200");
	     		choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter the Quantity :");
					bq = sc.nextInt();
					bp = 15;
					total = total + (bp *bq);
					System.out.println(bq +"Indian Burger Order Placed");
					break;
				case 2:
					System.out.println("Enter the Quantity :");
					bq = sc.nextInt();
					bp = 80;
					total = total + (bp *bq);
					System.out.println(bq +"Cheese Burger Order Placed");
					break;
				case 3:
					System.out.println("Enter the Quantity :");
					bq = sc.nextInt();
					bp = 100;
					total = total + (bp *bq);
					System.out.println(bq +"Cheese Garlic Burger Order Placed");
					break;
				case 4:
					System.out.println("Enter the Quantity :");
					bq = sc.nextInt();
					bp = 200;
					total = total + (bp *bq);
					System.out.println(bq +"Spicy Burger Order Placed");
					break;
				default:
					System.out.println("Enter Valid Choice");
				}
				break;
			case 5:
				System.out.println("Total Bill is :"+total);
				break;
			case 6:
				System.out.println("Closing...!!!\t Visit Again....!!!!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice...");
			}
		}while(choice!=6);
		sc.close();;
	}

}
