package com.example.immutableClass;

public final class Animal {
    final String type;
    final int numOfLegs;
    final boolean ispet;

    public Animal(String type, int numOfLegs, boolean ispet) {
        this.type = type;
        this.numOfLegs = numOfLegs;
        this.ispet = ispet;
    }

    public String getType() {
        return type;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public boolean isIspet() {
        return ispet;
    }
}
