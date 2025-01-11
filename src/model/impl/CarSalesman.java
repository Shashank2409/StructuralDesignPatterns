package model.impl;

import model.VehicleShowroom;
import model.impl.showrooms.AudiShowroom;
import model.impl.showrooms.BMWShowroom;

public class CarSalesman {
    public void getBMWAvailableCars() {
        VehicleShowroom bmwShowroom = new BMWShowroom();
        bmwShowroom.getAvailableCars();
    }

    public void getAudiAvailableCars() {
        VehicleShowroom audiShowroom = new AudiShowroom();
        audiShowroom.getAvailableCars();
    }
}
