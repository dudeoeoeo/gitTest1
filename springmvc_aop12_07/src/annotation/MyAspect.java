package annotation;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.Signature;

@Aspect
public class MyAspect {

	@Before("execution(public void annotation.BizService*.*())")
	public void beforeMethod(JoinPoint jp){
		Signature signature = jp.getSignature();
		String methodName = signature.getName();
		Date date = new Date();
		System.out.println("["+methodName+"]" + date);
	}
}
