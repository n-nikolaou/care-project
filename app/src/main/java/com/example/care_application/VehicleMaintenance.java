package com.example.care_application;

import java.util.HashMap;
import java.util.Map;

public class VehicleMaintenance {
    private Map<String, Integer> maintenanceSchedule;

    public VehicleMaintenance() {
        maintenanceSchedule = new HashMap<>();
        maintenanceSchedule.put("Αέρας", 1);
        maintenanceSchedule.put("Φώτα", 1);
        maintenanceSchedule.put("Υγρό υαλοκαθαριστήρων", 1);
        maintenanceSchedule.put("Λάδι", 3);
        maintenanceSchedule.put("Γενικά υγρά", 3);
        maintenanceSchedule.put("Μπαταρία", 3);
        maintenanceSchedule.put("Φρένα", 6);
        maintenanceSchedule.put("Υαλοκαθαριστήρες", 6);
        maintenanceSchedule.put("Μηχανή", 12);
        maintenanceSchedule.put("Λάστιχα", 12);
        maintenanceSchedule.put("Ασφάλεια", 12);
        maintenanceSchedule.put("ΚΤΕΟ", 12);
    }

    public Map<String, Integer> getMaintenanceSchedule() {
        return maintenanceSchedule;
    }
}