package com.company;

public class Cadillac extends Car {
    public int year = 2020;
    public String model = "Q7";
    public double volume = 3.5;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setName(String name) {
        this.model = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("\t\tCadillac");
        System.out.println("Год: " + year + "\n " + "Модель: " + model + "\n" + "ОбЪем" + volume);
    }
}