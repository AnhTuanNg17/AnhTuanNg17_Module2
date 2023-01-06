package baitapthem.service;

import baitapthem.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService implements VehicleService<Car> {
    public ArrayList<Car> cars = new ArrayList<>();


    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void creat(Car car) {


    }

    @Override
    public boolean findByDriverPlate(String driverPlate) {
        return false;
    }

    @Override
    public void delete(String driverPlate) {

    }

    @Override
    public List<Car> search(String driverPlate) {
        return null;
    }
}
