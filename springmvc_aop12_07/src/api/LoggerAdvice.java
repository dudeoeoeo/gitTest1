package api;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggerAdvice implements MethodBeforeAdvice {
	
	@Override
	public void before(Method method, Object[] args, Object target)
	throws Throwable {
		System.out.println(method.getName() + "메서드 수행됨");
	}
	
}
