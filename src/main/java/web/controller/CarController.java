package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.models.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarDAO carDAO;

    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


//    @GetMapping(value = "/cars")
//    public String printCars(HttpServletRequest request) {
//        List<Car> cars = new ArrayList<>();
//        Car car1 = new Car(1,"vaz","v6");
//        String count = request.getParameter("count");
//        System.out.println(count);
//        return "cars";
//    }

    //    @GetMapping(value = "/cars")
//    public String printCars(@RequestParam(value = "count", required = false) String count, Model model) {
//        model.addAttribute("cars", carDAO.getCars(Integer.parseInt(count)));
//        return "cars";
//    }
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count != null) {
            if (count >= 5) {
                model.addAttribute("getAllCars", carDAO.getCars());
            } else {
                model.addAttribute("getAllCars", carDAO.getCars(count));
            }
        } else {
            model.addAttribute("getAllCars", carDAO.getCars());
        }
        return "cars";
    }
}
