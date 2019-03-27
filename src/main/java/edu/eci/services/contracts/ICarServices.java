package edu.eci.services.contracts;

import java.util.List;
import java.util.UUID;

import edu.eci.models.Car;
import edu.eci.models.User;

public interface ICarServices {
	List<Car> list();
    Car create(Car car);
    Car get(String licencePlate);
    Car update(Car carr);
    void delete(String licencePlate);
}
