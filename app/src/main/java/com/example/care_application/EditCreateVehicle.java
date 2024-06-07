package com.example.care_application;

public class EditCreateVehicle {

    public Vehicle createVehicle(String brand, String model, int year, String licensePlates) {
        return new Vehicle(brand, model, year, licensePlates);
    }

    public void editVehicle(Vehicle vehicle, String newBrand, String newModel, int newYear, String newLicensePlates, VehicleMaintenance newMaintenance) {
        vehicle.setBrand(newBrand);
        vehicle.setModel(newModel);
        vehicle.setYear(newYear);
        vehicle.setLicensePlates(newLicensePlates);
        vehicle.setVehicleMaintenance(newMaintenance);
    }

    public void deleteVehicle(Profile profile, Vehicle vehicle) {
        profile.getVehicles().remove(vehicle);
    }

    public void editMaintenance(Vehicle vehicle, VehicleMaintenance newMaintenance) {
        vehicle.setVehicleMaintenance(newMaintenance);
    }
}