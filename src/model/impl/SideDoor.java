package model.impl;

import model.VehicleComponent;

public class SideDoor implements VehicleComponent {
    public String name;
    public int price = 0;

    public SideDoor(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
