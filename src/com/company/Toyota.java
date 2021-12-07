package com.company;

public class Toyota extends Car{
    public int year = 2019;
    public String model = "Camry";

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double volume = 1.5;

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

    @Override
    public void print() {
        System.out.println("            TOYOTA");
        System.out.println("Год: " + year + "\n " + "Модель: " + model + "\n" + "Объем" + volume);
    }
}