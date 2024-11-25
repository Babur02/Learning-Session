package com.babar.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("user") 
    public ModelAndView getUser(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("id", 101);
        mav.addObject("name", "Tony Stark");
        mav.addObject("role", "Avenger");
        mav.setViewName("user");
        return mav;
    }
}
