package com.antteam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**   
* @Package com.antteam.controller 
* @Description: 初始页面
* @author niceling
* @date 2016年6月6日 下午2:25:21   
*/

@Controller
public class IndexController {
	
	@RequestMapping(value="/index",method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView mv =new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
		
}
