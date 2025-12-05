package com.atmmachine;

import java.util.*;
public class MainClass{
    
    public static void main(String[] args) {
      ATMoperationInterf op = new ATMoperationimp();
        int atmnumber = 12345;
        int atmpin = 123;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        System.out.println("Enter your ATM number: ");
        int atmno = in.nextInt();
        System.out.println("Enter your pin: ");
        int pin= in.nextInt();

        if ((atmnumber==atmno) && (atmpin==pin)) {
        while (true) {
             System.out.println("1.View Available Balance\n 2.Withdraw Amount \n 3.Deposit Amount \n 4.View Ministatement\n 5.Exit");
             System.out.println("Enter Choice:");
             int choic = in.nextInt();

             if (choic==1) {
                op.viewBalance();
             }
             else if (choic==2) {
                System.out.println("Enter amount to withdraw");
                double withdrawAmount = in.nextDouble();
                op.withdrawAmount(withdrawAmount);
             }
             else if (choic==3) {
                System.out.println("Enter Amount to deposit:");
                double depositAmount=in.nextDouble();
                op.depositAmount(depositAmount);
             }
             else if (choic==4) {
                op.viewMinistatement();
             }
             else if (choic==5) {
                System.out.println("Collect your ATM card\n Thank you");
                System.exit(0);
             }
             else{
                System.out.println("Please Enter Correct choice");
             }
        }

        }
        else{
            System.out.println("Incorrect ATM number or pin");
            System.exit(0);
        }
    }
}
