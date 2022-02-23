package com.example.test;

class BankAccount{
    private String name;
    private long totalAccount;

    private static BankAccount bankAccount = null;

    private BankAccount(){
        name = "";
        totalAccount = 0;
    }

    public static BankAccount getBankAccount(){
        if(bankAccount == null){
            bankAccount = new BankAccount();
        }
        return bankAccount;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getTotalAccount(){
        return this.totalAccount;
    }

    public void setTotalAccount(){
        this.totalAccount = totalAccount;
    }
}

public class Main{
    public static void main(String[] args){
        BankAccount bankAccount1 = BankAccount.getBankAccount();
        BankAccount bankAccount2 = BankAccount.getBankAccount();

        bankAccount1.setName("New name");

        System.out.println(bankAccount1.getName().equals(bankAccount2.getName()));
        System.out.println(bankAccount1 == bankAccount2);
    }
}