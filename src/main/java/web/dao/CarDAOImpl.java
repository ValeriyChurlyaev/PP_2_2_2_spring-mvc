package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {


    @Override
    public List<Car> CarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(137, "White", "Tesla"));
        cars.add(new Car(164, "Red", "Mustang"));
        cars.add(new Car(337, "Black", "Porsche"));
        cars.add(new Car(820, "Nightblue", "Cadillac"));
        cars.add(new Car(954, "Green", "Fiat"));
        return cars;
    }


}
