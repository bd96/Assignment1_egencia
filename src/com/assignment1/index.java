package com.assignment1;

public class index {
    public static void main(String[] args) {
        // Savings
        Accounts acc1 = new Savings(1,10000.0,"Anurag","7840857048");
        System.out.println(acc1.getAccountNum());
        System.out.println(acc1.getAmount());
        System.out.println(acc1.getMobNo());
        System.out.println(acc1.getName());
        System.out.println(acc1.getType());
        System.out.println(acc1.getClass());

        // Credit amount
        acc1.creditAmnt(10.0);
        System.out.println("updated amount " + acc1.getAmount());

        //debit amount
        try {
            acc1.debitAmnt(1000000.0);
            System.out.println("updated amount " + acc1.getAmount());
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }

        //change name

        //acc1.changeName(""); this is not working ?
        acc1.changeName("BD");
        System.out.println(acc1.getName());

        // Interest
        System.out.println(acc1.calculateInterest());

        // Current Account
        Accounts acc2 = new Current(2,10000.0,"Anurag","7840857048");
        System.out.println(acc2.getAccountNum());
        System.out.println(acc2.getAmount());
        System.out.println(acc2.getMobNo());
        System.out.println(acc2.getName());
        System.out.println(acc2.getType());
        System.out.println(acc2.getClass());

        // Credit amount
        acc2.creditAmnt(10.0);
        System.out.println("updated amount " + acc2.getAmount());

        //debit amount
        try {
            acc2.debitAmnt(10.0);
            System.out.println("updated amount " + acc2.getAmount());
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }

        //change name

        //acc1.changeName(""); this is not working ?
        acc2.changeName("BD");
        System.out.println(acc2.getName());

        // Interest
        System.out.println(acc2.calculateInterest());

    }
}
