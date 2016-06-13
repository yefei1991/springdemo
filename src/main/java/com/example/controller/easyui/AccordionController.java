package com.example.controller.easyui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/easyui/accordion")
public class AccordionController {

    @RequestMapping("/content")
    public ModelAndView haha(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/accordion/_content");
        return mav;
    }
    
    @RequestMapping("/actions")
    public ModelAndView actions(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/accordion/actions");
        return mav;
    }
    
    @RequestMapping("/ajax")
    public ModelAndView ajax(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/accordion/ajax");
        return mav;
    }
    
    @RequestMapping("/basic")
    public ModelAndView ajax() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/accordion/basic");
        return mav;
    }
    
    @RequestMapping("/expandable")
    public ModelAndView expandable() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/accordion/expandable");
        return mav;
    }
    
    @RequestMapping("/fluid")
    public ModelAndView fluid() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/accordion/fluid");
        return mav;
    }
    
    @RequestMapping("/multiple")
    public ModelAndView multiple() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/accordion/multiple");
        return mav;
    }
    
    @RequestMapping("/tools")
    public ModelAndView tools() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/accordion/tools");
        return mav;
    }
    
}
