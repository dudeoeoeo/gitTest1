package kr.co.kosmo.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.dao.MemberAopInter;
import kr.co.kosmo.mvc.dto.MemberVO;

@Controller
public class DefaultController {
	
	// HandlerMapping
	@RequestMapping(value = {"/","/index"})
	public ModelAndView myindex() {
		System.out.println("우선매핑");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("msg", "하이");
		return mv;
	}
	
}