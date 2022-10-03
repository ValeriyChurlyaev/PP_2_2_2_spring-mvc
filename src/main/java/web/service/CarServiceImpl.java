package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {


    @Override
    public List<Car> carList(int num) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(137, "White", "Tesla"));
        cars.add(new Car(164, "Red", "Mustang"));
        cars.add(new Car(337, "Black", "Porsche"));
        cars.add(new Car(820, "Nightblue", "Cadillac"));
        cars.add(new Car(954, "Green", "Fiat"));

        return cars.stream().limit(num).toList();
    }
}
