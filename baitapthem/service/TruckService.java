package baitapthem.service;

import baitapthem.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckService implements VehicleService {
    public ArrayList<Truck> truckArrayList = new ArrayList<>();

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void creat(Object o) {

    }

    @Override
    public boolean findByDriverPlate(String driverPlate) {
        return false;
    }

    @Override
    public void delete(String driverPlate) {

    }

    @Override
    public List search(String driverPlate) {
        return null;
    }
}


