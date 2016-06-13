package com.example.controller.easyui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/easyui/combobox")
public class ComboController {

    @RequestMapping("/actions")
    public ModelAndView actions() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/actions");
        return mav;
    }
    
    @RequestMapping("/basic")
    public ModelAndView basic() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/basic");
        return mav;
    }
    
    @RequestMapping("/customformat")
    public ModelAndView customformat() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/customformat");
        return mav;
    }
    
    @RequestMapping("/dynamicdata")
    public ModelAndView dynamicdata() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/dynamicdata");
        return mav;
    }
    
    @RequestMapping("/fluid")
    public ModelAndView fluid() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/fluid");
        return mav;
    }
    
    @RequestMapping("/group")
    public ModelAndView group() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/group");
        return mav;
    }
    
    @RequestMapping("/icons")
    public ModelAndView icons() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/icons");
        return mav;
    }
    
    @RequestMapping("/itemicon")
    public ModelAndView itemicon() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/itemicon");
        return mav;
    }
    
    @RequestMapping("/multiline")
    public ModelAndView multiline() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/multiline");
        return mav;
    }
    
    @RequestMapping("/multiple")
    public ModelAndView multiple() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/multiple");
        return mav;
    }
    
    @RequestMapping("/navigation")
    public ModelAndView navigation() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/navigation");
        return mav;
    }
    
    @RequestMapping("/remotedata")
    public ModelAndView remotedata() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/remotedata");
        return mav;
    }
    
    @RequestMapping("/remotejsonp")
    public ModelAndView remotejsonp() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combobox/remotejsonp");
        return mav;
    }
}
