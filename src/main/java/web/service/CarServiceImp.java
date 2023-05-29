package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Opel", "Astra", "Red"));
        cars.add(new Car("VW", "Golf", "Blue"));
        cars.add(new Car("Lada", "2101", "Green"));
        cars.add(new Car("Reno", "Logan", "White"));
        cars.add(new Car("HAVAL", "F7", "Red"));

    }

    @Override
    public List<Car> limit(int a) {
        return cars.stream()
                .limit(a)
                .collect(Collectors.toList());
    }
}
