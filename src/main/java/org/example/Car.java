package org.example;

public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car() {
        this.model = "Unknown";
        this.make = "Unknown";
        this.year = 2000;
        this.price = 0.0;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 0.0);
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year <= 1886) {
            this.year = 1886;
        }
        else if (year >= 2024) {
            this.year = 2024;
        }
        else {
            this.year = year;
        }
    }

    public double calculateDepreciation() {
        if (this.year == 2025) {
            return this.price;
        }
        else {
            return this.price * Math.pow(0.85, 5);
        }
    }

    public void print() {
        System.out.println(this);
    }

}
