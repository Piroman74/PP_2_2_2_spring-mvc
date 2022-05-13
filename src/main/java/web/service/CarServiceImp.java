package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

public class CarServiceImp implements CarService {
    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> getCars( int count) {
        return carDAO.getCars(count);
    }
}
