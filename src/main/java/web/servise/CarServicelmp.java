package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
@Repository
public class CarServicelmp implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("reno", 5, "Rick Dalton"));
        cars.add(new Car("lada", 10, "Nick M"));
        cars.add(new Car("mersedes", 600, "Oliver Stick"));
        cars.add(new Car("reno", 5, "Rick Dalton"));
        cars.add(new Car("bmv", 6, "rokky balboa"));
        cars.add(new Car("vaz", 5, "NNNN"));
    }


    @Transactional()
    @Override
    public List<Car> index(int count) {

        if (count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).toList();
        }
    }

}
