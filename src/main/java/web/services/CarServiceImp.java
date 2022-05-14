package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {
    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> getCars() {
        return carDAO.getCars();
    }

    @Override
    public List<Car> getCarsIndex(int count) {
        return carDAO.getCarsIndex(count);
    }
}
