package web;

import web.servise.CarService;
import web.servise.CarServicelmp;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarServicelmp();
        System.out.println(carService.index(3));
    }
}
