package model.impl;

import model.VehicleComponent;

import java.util.ArrayList;
import java.util.List;

public class VehicleDoor implements VehicleComponent {
    String name;
    List<VehicleComponent> doors;

    public VehicleDoor() {
        doors = new ArrayList<>();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public void addDoor(VehicleComponent door) {
        doors.add(door);
    }
    @Override
    public int getPrice() {
        int price = 0;
        for (VehicleComponent component: doors) {
            price += component.getPrice();
        }
        return price;
    }
}
