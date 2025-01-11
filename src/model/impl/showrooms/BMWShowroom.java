package model.impl.showrooms;

import model.VehicleShowroom;

public class BMWShowroom implements VehicleShowroom {
    @Override
    public void getAvailableCars() {
        System.out.println("BMW X1");
        System.out.println("BMW X2");
        System.out.println("BMW 7 Series");
    }
}
