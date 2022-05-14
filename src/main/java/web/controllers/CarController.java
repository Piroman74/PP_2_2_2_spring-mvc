package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;

@Controller
public class CarController {
    @Autowired
    private CarService carService;


    @GetMapping(value = "/cars")
    public String printCarsCount(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count != null) {
            if (count >= 5) {
                model.addAttribute("getCars", carService.getCars());
            } else {
                model.addAttribute("getCars", carService.getCarsIndex(count));
            }
        } else {
            model.addAttribute("getCars", carService.getCars());
        }
        return "cars";
    }

}
