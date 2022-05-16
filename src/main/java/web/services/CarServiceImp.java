package web.services;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "mazda", "2010"));
        cars.add(new Car(2, "honda", "2002"));
        cars.add(new Car(3, "vaz", "2000"));
        cars.add(new Car(4, "audi", "2005"));
        cars.add(new Car(5, "toyota", "2000"));
    }

    @Override
    public List<Car> getCarsIndex(Integer count) {
        if (count != null) {
            if (count >= 5) {
                return cars;
            } else {
                return cars.subList(0, count);
            }
        } else {
            return cars;
        }
    }
}
