package com.assignment1;

import java.util.*;

abstract class Accounts {
    // All the variables are declared as protected because they can only be accessed in the same package
    private Integer accountNum;
    private Double amount;
    private String name;
    private final String mobNo; // It is final because it can't be changed
    private Integer type; // 1-> Savings, 2-> Current

    public Accounts(Integer accountNum, Double amount, String name, String mobNo, Integer type) {
        Objects.requireNonNull(accountNum);
        this.accountNum = accountNum;

        Objects.requireNonNull(amount) ;
        this.amount = amount;

        Objects.requireNonNull(name) ;
        this.name = name;

        Objects.requireNonNull(mobNo);
        this.mobNo = mobNo;

        Objects.requireNonNull(type);
        this.type = type;

    }

    public Double getAmount() {
        return amount;
    }

    public Integer getAccountNum() {
        return accountNum;
    }

    public String getName() {
        return name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public Integer getType() {
        return type;
    }

    public void setAccountNum(Integer accountNum) {
        this.accountNum = accountNum;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    protected final void creditAmnt(Double balance) {
        Objects.requireNonNull(balance);
        this.amount+= balance;
    }
    protected final void debitAmnt (Double balance) throws NegativeBalanceException  {
        Objects.requireNonNull(balance);
        if (balance < this.amount) {
            this.amount-=balance;
        } else {
            throw new NegativeBalanceException("You can't debit this much amount");
        }
    }
    protected final void changeName(String newName) {
        Objects.requireNonNull(newName);
        this.name = newName;
    }
    public abstract Double calculateInterest();
}
