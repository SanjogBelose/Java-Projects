import java.util.Scanner;

public class BankingApplication {
    
    public void start(String name, String ID) {
        System.out.println("Welcome "+ name);
        System.out.println("Your ID is "+ ID + "\n");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Previous Transaction");
        System.out.println("5. Exit");

    }

    public void loop() {
        int balance = 1000;
        int option;
        int lastBalance_D = balance;
        int lastBalance_W = balance;
        int deposit = 0;
        int withdraw = 0;
        do {
            System.out.println("---------------------------------------------------");
        System.out.println("Enter an option");
        System.out.println("---------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        switch(option) {
            case 1:
            System.out.println("Balance= "+ balance);
            break;

            case 2:
            lastBalance_D = balance;
            System.out.println("Enter Amount: ");
            deposit = sc.nextInt();
            balance = balance + deposit;
            System.out.println("------------Deposit Successful------------\n");
            System.out.println("New Balance: "+ balance);
            break;

            case 3:
            lastBalance_W = balance;
            System.out.println("Enter the Withdrawal Amount: ");
            withdraw = sc.nextInt();
            balance = balance - withdraw;
            System.out.println("--------------Withdrawal Successful---------\n");
            System.out.println("New Balance: "+ balance);
            break;

            case 4:
            if(balance > lastBalance_D) {
                System.out.println("Deposit of Rs: "+ deposit);
            }
            else if (balance < lastBalance_W) {
                System.out.println("Withdrawal of Rs: "+ withdraw);
            }
            else {
                System.out.println("No Previous Transaction");
            }
            break;

            case 5:
            System.out.println("----------------------------------------------");
            break;

            default:
            System.out.println("Invalid input, Try again");



        }
        } while(option != 5);
        System.out.println("Thank u for visiting");

    }
    public static void main(String args[]) {
         BankingApplication obj = new BankingApplication();
         obj.start("Sanjog", "SJ005");
         obj.loop();
    }
}