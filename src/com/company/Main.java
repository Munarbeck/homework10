package com.company;

public class Main {


    public static void main(String[] args) {
        Printable[] Car = {createObject("Benz"), createObject("BMW"),createObject("Audi"),createObject("Toyota")};
        for (int i = 0; i < Car.length; i++) {
            Car[i].print();
        }
    }

    public static Printable createObject(String Car) {
        Printable printable = null;
        switch (Car) {
            case "Benz":
                printable = new Lexus();
                break;
            case "BMW":
                printable = new Bmw();
                break;
            case "Audi":
                printable = new Cadillac();
                break;
            case "Toyota":
                printable = new Toyota();
                break;
        }
        return printable;

    }
}