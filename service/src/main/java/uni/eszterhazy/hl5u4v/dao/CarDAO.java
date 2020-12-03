package uni.eszterhazy.hl5u4v.dao;

import uni.eszterhazy.hl5u4v.model.Car;

import java.util.Collection;

public interface CarDAO {
    Collection<Car> getAllCar();
    Car GetCar(String licensePlate);
    void updateCar(Car car);
    void storeCar(Car car);
    void purgeCar(Car car);
    Collection<Car> getAvailableCars();
}
