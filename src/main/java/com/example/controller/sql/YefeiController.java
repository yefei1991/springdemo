package com.example.controller.sql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Yefei;
import com.example.service.YefeiService;

@RequestMapping("/yefei")
@Controller
public class YefeiController {
	
	@Autowired
	private YefeiService yefeiService;
	
    @RequestMapping("/test")
    public String test() {
    	System.out.println(yefeiService.findAll().size()+"");
    	List<Yefei> yefeiList=yefeiService.findWithCondition();
    	for(Yefei yefei:yefeiList){
    		System.out.println(yefei.getId());
    	}
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
    
}
