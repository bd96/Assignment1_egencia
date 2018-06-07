package com.assignment1;

public class Current extends Accounts {
    public static double rate = 1;

    public Current(Integer accountNum, Double amount, String name, String mobNo) {
        super(accountNum,amount,name,mobNo,2);
    }

    @Override
    public Double calculateInterest() {
        return rate*getAmount()/100;
    }
}
