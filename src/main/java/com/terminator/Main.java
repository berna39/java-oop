package com.terminator;

import com.terminator.basics.Person;
import com.terminator.basics.Player;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Shango", "DRC", 20);
        p.speak(); // hey there

        Player player = new Player("Cunha", "Brazil", 21);
        /*
         * Polymorphism : he ability to appear in many forms, this is done by Java with the help 
         * of the signature and declaration of these entities
         * Polymorphism in Java is mainly of 2 types: 
         *      - overriding
         *      - overloading 
         */
        player.speak(); // the same method but with another behavor
        player.speak("Santiago"); // the same method but with another signature
    }
}