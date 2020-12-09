package kr.co.kosmo.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.dao.MemberAopInter;
import kr.co.kosmo.mvc.dto.MemberVO;

@Controller
public class DefaultController {
	
	// HandlerMapping
	@RequestMapping(value = {"/","/index"})
	public ModelAndView myindex() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("msg", "하이");
		return mv;
	}
	
	// MVC에서 AOP를 사용할 때는 반드시 패턴으로 잘 검사 되도록
	// 클래스, 메서드, 인자값을 설계할 필요가 있다.
	@RequestMapping(value = "/mytoday1")
	public String todayDemo(Model m) {
		// set 은 단수
		// add는 list 나 복수의 값을 넣는 경우가 일반
		m.addAttribute("msg", "hello");
		return "today";
	}
	
	// MVC에서 AOP를 사용할 때는 반드시 패턴으로 잘 검사 되도록
		// 클래스, 메서드, 인자값을 설계할 필요가 있다.
		@RequestMapping(value = "/mytoday2")
		public String todayTest(Model m) {
			// set 은 단수
			// add는 list 나 복수의 값을 넣는 경우가 일반
			m.addAttribute("msg", "하위하위");
			return "today";
		}
}