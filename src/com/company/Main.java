package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	// write your code her
        System.out.println("hello world");
        System.out.println("something else");
        System.out.println("Another change as this programme is freaking awesome");

        Person p1 = new Person("Kazik", "Warszawa", 56);
        Person p2 = new Person("Maryla", "Zza Stodoły", 23);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Person p3 = new Person("Włodek", "Petersburg", 67);
        System.out.println(p3.toString());

        Car c1 = new Car("Alfa Romeo", 5);


    }



}
