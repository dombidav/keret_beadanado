package uni.esterhazy.hl5u4v.dao.relational;

import com.mysql.cj.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import uni.eszterhazy.hl5u4v.dao.CarDAO;
import uni.eszterhazy.hl5u4v.model.Car;

import java.util.Collection;

public class CarDAORelational implements CarDAO {
    private static SessionFactory factory;

    public CarDAORelational() {
        factory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public Collection<Car> getAllCar() {
        return null;
    }

    @Override
    public Car GetCar(String licensePlate) {
        return null;
    }

    @Override
    public void updateCar(Car car) {

    }

    @Override
    public void storeCar(Car car) {

    }

    @Override
    public void purgeCar(Car car) {

    }

    @Override
    public Collection<Car> getAvailableCars() {
        return null;
    }
}
