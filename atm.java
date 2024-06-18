import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){

        int pin = 3256;
        int balance = 10000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your pin : ");

        int password = scanner.nextInt();

        if (password==pin)
        {
            //System.out.println("Enter your name");
            //name = scanner.next();
            //System.out.println("Welcome" + name);

            while (true)
            {
                System.out.println(" ");
                System.out.println("-------------------------------");
                System.out.println("Press 1 to know your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to withdraw amount");
                System.out.println("Press 4 to get receipt");
                System.out.println("Press 5 to exit");
                System.out.println("-------------------------------");
                System.out.println(" ");

                int opt = scanner.nextInt();
                switch(opt)
                {
                    case 1: 
                        System.out.println("Your current balance is : " + balance);
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to add");
                        AddAmount = scanner.nextInt();
                        balance = AddAmount + balance;
                        System.out.println("Amount successfully credited");
                        break;
                    case 3:
                        System.out.println("Enter the amount you want to take");
                        TakeAmount = scanner.nextInt();
                        if(TakeAmount>balance)
                        {
                            System.out.println("You don't have enough money");
                        }
                        else{

                            balance = balance - TakeAmount;
                            System.out.println("Amount is successfully debitted");
                        }
                        break;
                    case 4:
                        System.out.println("ATM mini statement");
                        System.out.println("Your current available balance is " + balance);
                        System.out.println("Amount credited : " + AddAmount);
                        System.out.println("Amount debited : " + TakeAmount);
                        System.out.println("Thank you!");        
                        break;
                            default:
                                System.out.println("Press 5 to exit");
                                break;       
                }
                if (opt==5)
                {
                    System.out.println("Thank You");
                    break;
                }

            }
        }
        else
        {
            System.out.println("Wrong Pin!");
        }
    }
} 