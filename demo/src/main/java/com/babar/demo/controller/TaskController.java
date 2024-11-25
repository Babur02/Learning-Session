package com.babar.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.babar.demo.entity.Task;


@Controller
public class TaskController {
 private List<Task> tasks = new ArrayList<>();

    // @GetMapping("/")
    // public String index(Model model) {
    //     model.addAttribute("tasks", tasks);
    //     model.addAttribute("newTask", new Task());
    //     return "index";
    // }

    @GetMapping("/")
    public ModelAndView getIndexPage(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "Happy Diwaliiiiiii");
        mav.addObject("msg2", "Welcome to the learning session");
        mav.setViewName("index");
        return mav;
    }


    // @GetMapping("/date")
    // public ModelAndView getDate(){
    //     ModelAndView mav = new ModelAndView();
    //     mav.addObject("date", new Date());
    //     mav.setViewName("index");
    //     return mav;
    // }

    @GetMapping("/date")
    public String getDate(Model model){
        model.addAttribute("date", new Date());
        return "index";
    }

    @PostMapping("/add")
    public String addTask( Task task) {
        tasks.add(task);
        System.out.println(task);
        return "redirect:/";
    }
}
