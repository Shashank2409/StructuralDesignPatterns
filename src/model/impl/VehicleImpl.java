package model.impl;

import model.Vehicle;

public class VehicleImpl implements Vehicle {
    String name;
    String specs;
    int price;

    public VehicleImpl(String name, int price, String specs) {
        this.name = name;
        this.price  = price;
        this.specs = specs;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public String getSpecs() {
        return specs;
    }
}
