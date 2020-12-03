package uni.eszterhazy.hl5u4v.service;

import uni.eszterhazy.hl5u4v.model.Car;

import java.util.Collection;

public interface CarService {
    Collection<Car> browse();
    Car read(String licensePlate);
    void edit(Car car);
    void add(Car car);
    void delete(Car car);
    Collection<Car> browseAvailable();
}
