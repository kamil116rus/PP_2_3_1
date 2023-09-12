package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.servise.CarService;
import web.servise.CarServicelmp;


@Controller
//@RequestMapping("/cars")
public class CarsController {
    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService= carService;

    }


    @GetMapping("/cars")
    public String index(@RequestParam(value = "count", defaultValue = "5") int count, Model model, CarServicelmp carServicelmp) {

        model.addAttribute("cars", carServicelmp.index(count));

        return "cars";
    }

//    @GetMapping("/show")
//    public String show(@RequestParam("count") int count, Model model) {
//        // получим список людей до числа count
//
//        return "show";
//    }
}
