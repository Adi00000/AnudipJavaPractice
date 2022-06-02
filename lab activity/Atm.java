import java.util.Scanner;

public class Atm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double balance = 100;                         // Initial default balance
        double deposit = 0;
        double withdraw = 0;
        System.out.println("Enter Action you want ");
        String Action = input.nextLine();                // Enter Action such as deposit, withdraw, balance

        switch(Action){
            
            case "deposit":                                        // deposit case
                System.out.println("Enter deposit amount");
                deposit = input.nextDouble();
                balance = balance + deposit;
                System.out.println("money Deposited successfully");
                System.out.println("Balance after deposit "+balance);
                break;
            
            case "withdraw":                                      //withdraw case
                System.out.println("Enter withdrawal amount");
                withdraw = input.nextDouble();
                if(balance<withdraw){
                    System.out.println("Insufficient balance");
                }
                else{

                    balance = balance - withdraw;
                    System.out.println("Balance after withdraw "+balance);
                }
                break;
            
            case "balance":                                               //balance check case
                System.out.println("Your balance status are "+balance);
                break;
            default:                                                    //Default for invalid input
                System.out.println(" invalid input ");
                System.out.println("Exit successfully");
                break;
        }
    }
}
