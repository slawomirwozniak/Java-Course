package org.example.model;


public class MainPakietowy {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 1d);
        Car vw = new Car("Audi", 1d);

        System.out.println(audi == vw);

        vw.setName("Audi");
        System.out.println(audi == vw);

        System.out.println("Po zaimplementowaniu metody equals: " + audi.equals(vw));

        System.out.println(audi);
    }
}