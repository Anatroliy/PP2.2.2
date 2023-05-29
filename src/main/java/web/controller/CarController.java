package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;


@Controller
public class CarController {
    private final CarServiceImp CarService;

    public CarController(CarServiceImp carService) {
        CarService = carService;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("car", CarService.limit(count));
        return "car";
    }
}
