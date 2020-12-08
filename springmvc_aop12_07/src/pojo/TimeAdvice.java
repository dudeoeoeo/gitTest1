package pojo;

import org.aspectj.lang.ProceedingJoinPoint;

// 
public class TimeAdvice {
	
	public void timeCheck(ProceedingJoinPoint pjp) throws Throwable{
		
		//메서드 실행 전 수행
		long start = System.currentTimeMillis();
		
		//비즈니스 메소드 실행
		pjp.proceed(); // ** 생략 불가능 **
		
		//메서드 실행 후 수행
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) + "밀리초");
	}
	
	// 비포와 에프터는 어드바이스 메서드를 정의할 때 joinpoint를 생략 가능
	// arround는 joinpoint 생략 불가능
	public void mybefore() {
		System.out.println("전처리!");
	}
}