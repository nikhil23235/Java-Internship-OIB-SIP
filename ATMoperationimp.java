package com.atmmachine;

import java.util.*;


public class ATMoperationimp implements ATMoperationInterf{

   ATM atm = new ATM();
   
   Map<Double,String> ministmnt= new HashMap<>();

    @Override   
    public void viewBalance(){
    System.out.println("Available balance is:"+ atm.getbalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
    if(withdrawAmount%500==0){
    if(withdrawAmount<=atm.getbalance()){  
    ministmnt.put(withdrawAmount, "Amount withdrawn");
    System.out.println("Collect the Cash" +withdrawAmount);
    atm.setbalance(atm.getbalance()-withdrawAmount);
    viewBalance();
    }
    else{
        System.out.println("Insufficient Balance !!");
    }
    }  else{
    System.out.println("Please Enter the Amount in multiple of 500");
    }
    }

    @Override
    public void depositAmount(double depositAmount){
    ministmnt.put(depositAmount, "Amount deposited");
    System.out.println(depositAmount +"deposited successfully !!");
    atm.setbalance(atm.getbalance() + depositAmount);
    viewBalance();

    }

    @Override
    public void viewMinistatement(){
    for(Map.Entry<Double,String> m:ministmnt.entrySet()){
     System.out.println(m.getKey()+""+m.getValue());
    }
    }
}
