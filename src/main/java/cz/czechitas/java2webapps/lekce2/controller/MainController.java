package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class MainController {

    @GetMapping("/datum")
    public ModelAndView date() {
        ModelAndView modelAndView = new ModelAndView("datum");
        modelAndView.addObject("datum",  LocalDate.now());
        return modelAndView;
    }

    @GetMapping("/cas")
    public ModelAndView time() {
        ModelAndView modelAndView = new ModelAndView("cas");
        modelAndView.addObject("cas",  LocalTime.now());
        return modelAndView;
    }
}
