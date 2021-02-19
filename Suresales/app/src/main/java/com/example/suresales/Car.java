package com.example.suresales;

public class Car {
    private int id;
    private String name;
    private double stoke;
    private double vin;
    private String color;
    private float mileage;
    private boolean isPassed;
    private double date;
    private String imageUrl;

    public Car(int id, String name, double stoke, double vin, String color, float mileage, boolean isPassed, double date, String imageUrl) {
        this.id = id;
        this.name = name;
        this.stoke = stoke;
        this.vin = vin;
        this.color = color;
        this.mileage = mileage;
        this.isPassed = isPassed;
        this.date = date;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStoke() {
        return stoke;
    }

    public void setStoke(double stoke) {
        this.stoke = stoke;
    }

    public double getVin() {
        return vin;
    }

    public void setVin(double vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stoke=" + stoke +
                ", vin=" + vin +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", isPassed=" + isPassed +
                ", date=" + date +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
