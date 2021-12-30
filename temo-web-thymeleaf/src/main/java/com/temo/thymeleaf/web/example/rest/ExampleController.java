package com.temo.thymeleaf.web.example.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/view")
    public ModelAndView view(ModelAndView modelAndView) {

        modelAndView.setViewName("example/example");

        return modelAndView;
    }
}
