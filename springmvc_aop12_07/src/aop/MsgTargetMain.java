package aop;

import org.springframework.aop.framework.ProxyFactory;

// 외부 조립기를 수행하는 메서드를 가진 클래스
public class MsgTargetMain {
	public static void main(String[] args) { 
		
		MsgWriter target = new MsgWriter();
		
		// 프록시 만들기 : ProxyFactory를 사용해서 타겟객체의 프록시를 생성하면서동시에
		// 어드바이스를 위빙했다.
		
		ProxyFactory pf = new ProxyFactory(); 
		// addAdvice()를 사용해서 MsgDecorator 어드바이스를 ProxyFactory에게 넘겨줬고, 
		pf.addAdvice(new MsgDecorator()); 
		// setTarget으로 위빙할 타겟 객체를 설정 했다. 
		pf.setTarget(target);

		// 타겟 객체를 설정하고 어드바이스를 ProxyFactory에 추가 한 뒤에
		// getProxy()를 호출해서 프록시를 생성 했다.
		MsgWriter proxy = (MsgWriter) pf.getProxy();
		
		//메세지 출력 : 최종적으로 비교를 위해서 타겟 객체와 어라운드를 어드바이스로 위빙한 객체의 결과이다. 
		target.writeMsg(); 
		System.out.println(""); 
		proxy.writeMsg(); 
		
	}

}
