package com.company;

public class Bmw extends Car {
    public int year = 2022;
    public String model = "x";
    public double volume = 2.5;

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

    @Override
    public void print() {
        System.out.println("\t\tBMW");
        System.out.println("Год: " + year + "\n " + "Модель: " + model + "\n" + "Объем" + volume);
    }
}