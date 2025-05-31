package org.example.model;

import java.util.Objects;


public class Car {

    private String name;
    private Double price;

    Car(String name, Double price) {
        this.price = price;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Car car)) {
            return false;
        }
        return this.name.equals(car.name) && this.price.equals(car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "{" + "Name: " + name + ", " + "Price: " + price + "}";
    }
}