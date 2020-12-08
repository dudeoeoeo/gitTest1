package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MsgDecorator implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invok) throws Throwable { 
		System.out.print("안녕하세요 "); // 안녕하세요 가 출력되고  공통사항
		Object rVal = invok.proceed(); // 실제 메서드가 호출되고
		System.out.println("!"); // 느낌표가 출력된다.  공통사항
		return rVal; 
	}
	 
	
}
