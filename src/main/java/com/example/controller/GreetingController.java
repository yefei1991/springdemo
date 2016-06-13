package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Yefei;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @RequestMapping("/haha")
    public ModelAndView haha(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        ModelAndView mav=new ModelAndView();
        Yefei yefei=new Yefei();
        yefei.setName("yefei");
        mav.addObject("name",yefei.getName());
        mav.setViewName("greeting");
        return mav;
    }
    
   /* @RequestMapping("/jqueryTest")
    public ModelAndView jqueryTest() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("jqueryTest");
        return mav;
    }*/

}
