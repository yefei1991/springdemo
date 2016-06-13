package com.example.controller.easyui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/easyui/calendar")
public class CalendarController {

    @RequestMapping("/basic")
    public ModelAndView ajax() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/calendar/basic");
        return mav;
    }
    
    @RequestMapping("/custom")
    public ModelAndView expandable() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/calendar/custom");
        return mav;
    }
    
    @RequestMapping("/disabledate")
    public ModelAndView fluid() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/calendar/disabledate");
        return mav;
    }
    
    @RequestMapping("/firstday")
    public ModelAndView multiple() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/calendar/firstday");
        return mav;
    }
    
    @RequestMapping("/fluid")
    public ModelAndView tools() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/calendar/fluid");
        return mav;
    }
    
}
