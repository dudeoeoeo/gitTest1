package kr.co.kosmo.mvc.dao;

import kr.co.kosmo.mvc.dto.MemberVO; 
import kr.co.kosmo.mvc.dto.MyLoginLoggerDTO;

public interface MemberAopInter {
	
	public void addMem(MemberVO vo);
	public int idchk(String id);
	public MemberVO loginCheck(MemberVO vo);
	public void addLoginLogging(MyLoginLoggerDTO vo);
}
