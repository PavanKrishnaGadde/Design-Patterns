package com.behavioural.state;

import java.util.Scanner;

public class StateMain {
    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine(1000000);
        System.out.println("Welcome to ATM");
        System.out.println("Enter an instruction from below");
        System.out.println("1 --> Enter Card");
        System.out.println("2 --> Eject Card");
        System.out.println("3 --> Enter PIN");
        System.out.println("4 --> Withdraw Money");
        System.out.println("5 --> QUIT");
        Scanner scanner = new Scanner(System.in);
        boolean closeApp = false;
        while (true) {
            if(closeApp) break;
            System.out.println("Enter an option:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    atmMachine.insertCard();
                    break;
                case 2:
                    atmMachine.ejectCard();
                    break;
                case 3:
                    System.out.println("Enter 4 digit PIN number:");
                    int pin = scanner.nextInt();
                    atmMachine.enterPIN(pin);
                    break;
                case 4:
                    System.out.println("Enter the amount:");
                    double amount = scanner.nextDouble();
                    atmMachine.withdrawAmount(amount);
                    break;
                case 5:
                    System.out.println("Closing the application...!");
                    closeApp=true;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}
