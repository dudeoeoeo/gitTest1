package kr.co.kosmo.mvc.controller;

import java.util.Collection;  
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import kr.co.kosmo.mvc.dao.MemberAopInter;
import kr.co.kosmo.mvc.dto.MemberVO;

@Controller
public class LoginCheckController {
	
	@Autowired
	private MemberAopInter dao;
	
	@RequestMapping(value = "/login")
	public String loginForm() {
		return "login";
	}
	
	// 사용자가 로그인 버튼을 입력해서 데이터 베이스에서 조회한 값을 가지고
	// 맞으면 세션을 심고 index로 이동 
	// 틀리면 error.jsp로 이동
	@RequestMapping(value = "/loginProcess")
	public String loginfProcess(HttpSession session, HttpServletRequest request, 
			@RequestHeader("User-Agent") String userAgent, MemberVO vo) {
		
		System.out.println("id : " + vo.getId());
		System.out.println("pwd : " + vo.getPwd());
		System.out.println("userAgent : " + userAgent);
		ModelAndView mv = new ModelAndView();
		MemberVO vv = dao.loginCheck(vo);
		try {
			if(vv.getName() != null) {
				session.setAttribute("uid", vv.getId());
				session.setAttribute("userName", vv.getName());
			}
		} catch (Exception e) {
			
		}
		return "index";
	}
	
	@RequestMapping(value = "/logout")
	public String loginfoutProcess(HttpSession session, HttpServletRequest request, 
			@RequestHeader("User-Agent") String userAgent) {
		session.removeAttribute("uid");
		session.removeAttribute("userName");
		return "redirect:index";
	}
}
