package ie.atu.week10;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Person_Instance Dave=new Person_Instance("Dave", "Mervue", "12345");
        System.out.println(Dave.toString());
        Customer peter = new Customer("Dave", "Mervue", "12345", "8985", true);
        System.out.println(peter.toString());
    }
}
