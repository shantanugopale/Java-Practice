package ClassPrograms;
import java.util.*;
class ATM_Assignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int openingBal;
        System.out.println("Insert your card");
        char insert = sc.next().charAt(0);
        System.out.println("Enter your Pin :");
        int pin = sc.nextInt();
        if (pin == 9090) {
            System.out.println("Enter your Account Type : Current-->1/Saving-->2");
            int type = sc.nextInt();
            if (type == 1)// for current
            {
                openingBal = 1000;
                int balance = openingBal;
                System.out.println(
                        "What Operation You want to Perform : Withdraw-->0 || Deposite-->1 || CheckBalance-->");
                int opr = sc.nextInt();
                if (opr == 0) {
                    System.out.println("Enter the Withdraw Amount..?");
                    int withdrawAmount = sc.nextInt();
                    if (balance > withdrawAmount) {
                        balance = balance - withdrawAmount;
                        System.out.println(withdrawAmount + "Amount Withdrawed SuccessFully!!!");
                    } else {
                        System.out.println("Entered Amount is Greater than Your Current Balance");
                    }
                } else if (opr == 1) {
                    System.out.println("Enter the Amount you want to Deposite :");
                    int depositeAmount = sc.nextInt();
                    balance = balance + depositeAmount;
                    System.out.println(depositeAmount + "Amount SuccessFully Deposited");
                } else if (opr == 2) {
                    System.out.println("Your Balance is :" + balance);
                } else {
                    System.out.println("Invalid Operation");
                }
            } else if (type == 2) {
                openingBal = 5000;
                int balance = openingBal;
                System.out.println(
                        "What Operation You want to Perform : Withdraw-->0 || Deposite-->1 || CheckBalance-->2");
                int opr = sc.nextInt();
                if (opr == 0) {
                    System.out.println("Enter the Withdraw Amount..?");
                    int withdrawAmount = sc.nextInt();
                    if (balance > withdrawAmount) {
                        balance = balance - withdrawAmount;
                        System.out.println(withdrawAmount + "Amount Withdrawed SuccessFully!!!");
                        System.out.println("Your Total Balance is :"+balance);
                    } else {
                        System.out.println("Entered Amount is Greater than Your Current Balance");
                    }
                } else if (opr == 1) {
                    System.out.println("Enter the Amount you want to Deposite :");
                    int depositeAmount = sc.nextInt();
                    balance = balance + depositeAmount;
                    System.out.println(depositeAmount + "Amount SuccessFully Deposited");
                    System.out.println("Your Total Balance is :"+balance);
                } else if (opr == 2) {
                    System.out.println("Your Balance is :" + balance);
                } else {
                    System.out.println("Invalid Operation");
                }
            } else {
                System.out.println("Invalid Operation !!! Please Enter Valid Operation");
            }
        }
        else
        {
        	System.out.println("Invalid PIN !!! Please Enter Valid PIN");
        }
        sc.close();
    }
}