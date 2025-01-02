package model.impl;

import model.VehicleComponent;

public class BackDoor implements VehicleComponent {
    String name;
    int price;

    public BackDoor(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
