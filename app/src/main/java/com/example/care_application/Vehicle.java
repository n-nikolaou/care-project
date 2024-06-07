package com.example.care_application;

import java.util.UUID;
public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private String licensePlates;
    private VehicleMaintenance vehicleMaintenance;
    private final String carId;

    public Vehicle(String brand, String model, int year, String licensePlates) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.licensePlates = licensePlates;
        this.vehicleMaintenance = new VehicleMaintenance();
        this.carId = UUID.randomUUID().toString();
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public String getLicensePlates(){
        return licensePlates;
    }

    public VehicleMaintenance getVehicleMaintenance(){
        return vehicleMaintenance;
    }

    public String getCarId(){
        return carId;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setYear(int year){
        this.year=year;
    }

    public void setLicensePlates(String licensePlates){
        this.licensePlates=licensePlates;
    }

    public void setVehicleMaintenance(VehicleMaintenance vehicleMaintenance){
        this.vehicleMaintenance=vehicleMaintenance;
    }
}