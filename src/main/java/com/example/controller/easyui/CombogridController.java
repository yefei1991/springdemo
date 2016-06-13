package com.example.controller.easyui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/easyui/combogrid")
public class CombogridController {

	@RequestMapping("/actions")
    public ModelAndView actions() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combogrid/actions");
        return mav;
    }
	
    @RequestMapping("/basic")
    public ModelAndView basic() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combogrid/basic");
        return mav;
    }
    
    @RequestMapping("/fluid")
    public ModelAndView fluid() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combogrid/fluid");
        return mav;
    }
    
    @RequestMapping("/initvalue")
    public ModelAndView initvalue() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combogrid/initvalue");
        return mav;
    }
    
    @RequestMapping("/multiple")
    public ModelAndView multiple() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combogrid/multiple");
        return mav;
    }
    
    @RequestMapping("/navigation")
    public ModelAndView navigation() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combogrid/navigation");
        return mav;
    }
    
    @RequestMapping("/setvalue")
    public ModelAndView setvalue() {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("easyui/demo/combogrid/setvalue");
        return mav;
    }
}
