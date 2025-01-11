package model.impl.showrooms;

import model.VehicleShowroom;

public class AudiShowroom implements VehicleShowroom {
    @Override
    public void getAvailableCars() {
        System.out.println("Audi A4");
        System.out.println("Audi A6");
        System.out.println("Audi Q3");
    }
}
