package com.terminator.basics;

/*
 * Inheritance is an important pillar of OOP (Object Oriented Programming). 
 * It is the mechanism in Java by which one class is allowed to inherit the features
 * (fields and methods) of another class. We are achieving inheritance by using extends keyword.
 * Inheritance is also known as “is-a” relationship.
 */
public class Player extends Person {

    public Player(String name, String country, int age) {
        super(name, country, age);
    }

    // I define with the same signature as the metho speak() of Person class
    // overriding
    public void speak() {
        System.out.println("Ready to play");
    }

    // overloading
    public void speak(String person) {
        System.out.println(String.format("Ready to play with %s", person));
    }
}
 