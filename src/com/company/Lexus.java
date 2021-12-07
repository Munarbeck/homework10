package com.company;

public class Lexus extends Car{
    public int year = 1888;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
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

    public String model = "SClass";
    public double volume = 1.8;
    public void print() {
        System.out.println("\tBENZ");
        System.out.println("Год: " + year + "\n " + "Модель: " + model + "\n" + "Объем" + volume);
    }
}