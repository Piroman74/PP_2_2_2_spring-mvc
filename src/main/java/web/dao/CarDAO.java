package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "mazda", "2010"));
        cars.add(new Car(2, "honda", "2002"));
        cars.add(new Car(3, "vaz", "2000"));
        cars.add(new Car(4, "audi", "2005"));
        cars.add(new Car(5, "toyota", "2000"));
    }

    public List<Car> getCarsIndex(int count) {
        return cars.subList(0, count);
    }

    public List<Car> getCars() {
        return cars;
    }
}
