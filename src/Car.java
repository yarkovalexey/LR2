/*
 * Created by Alexey Yarkov on 27.09.17
 * Copyright © 2017 Alexey Yarkov. All rights reserved.
 */

public class Car {
    private int ID, Year, V, Price;
    private String Model, Country;

    public Car() {
        this.ID = 0;
        Year = 0;
        V = 0;
        Price = 0;
        Model = " ";
        Country = " ";
    }

    public Car(int id, String model, String country, int year, int v, int price) {
        ID = id;
        Year = year;
        V = v;
        Price = price;
        Model = model;
        Country = country;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getV() {
        return V;
    }

    public void setV(int v) {
        V = v;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + getID() +
                ", Year=" + getYear() +
                ", V=" + getV() +
                ", Price=" + getPrice() +
                ", Model='" + getModel() + '\'' +
                ", Country='" + getCountry() + '\'' +
                '}';
    }
}
