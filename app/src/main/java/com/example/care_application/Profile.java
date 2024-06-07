package com.example.care_application;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
public class Profile {
    private final String id;
    private ArrayList<Vehicle> vehicles;
    private EditCreateVehicle editCreateVehicle;

    public Profile(String id,ArrayList<Vehicle> vehicles,EditCreateVehicle editCreateVehicle){
        this.id=UUID.randomUUID().toString();
        this.vehicles=new ArrayList<>();
        this.editCreateVehicle=new EditCreateVehicle();
    }

    public String getId(){
        return id;
    }

    public ArrayList<Vehicle> getVehicles(){
        return vehicles;
    }

    public EditCreateVehicle getEditCreateVehicle(){
        return editCreateVehicle;
    }

    public void setEditCreateVehicle(EditCreateVehicle editCreateVehicle) {
        this.editCreateVehicle = editCreateVehicle;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles){
        this.vehicles=vehicles;
    }
}
