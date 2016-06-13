package com.example.controller.easyui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/easyui/combo")
public class ComboboxController {

    @RequestMapping("/animation")
    public ModelAndView animation() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combo/animation");
        return mav;
    }
    
    @RequestMapping("/basic")
    public ModelAndView basic() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combo/basic");
        return mav;
    }
    
}
