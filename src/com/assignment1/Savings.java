package com.assignment1;

public class Savings extends Accounts {
    private static double rate = 4;

    public Savings(Integer accountNum, Double amount, String name, String mobNo) {
        super(accountNum,amount,name,mobNo,1);
    }

    @Override
    public Double calculateInterest() {
        return rate*getAmount()/100;
    }
}
