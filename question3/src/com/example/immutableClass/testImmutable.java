package com.example.immutableClass;

public class testImmutable {
    public static void main(String[] args) {
        Animal tuffy = new Animal("dog", 4, true);
        System.out.println(tuffy.type);
        System.out.println(tuffy.numOfLegs);
        System.out.println(tuffy.ispet);
        int legs = tuffy.getNumOfLegs();
        System.out.println(legs);
    }
}
