package baitapthem.service;

import java.util.List;

public interface VehicleService<E>{
    List<E> findAll();
    void creat(E e);
    boolean findByDriverPlate(String driverPlate);
    void delete(String driverPlate);
    List<E> search(String driverPlate);
}
