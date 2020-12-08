package api;

public class APIBeanImp implements APIBean {

	@Override
	public void bizMethod1() {
		System.out.println("첫번째 비즈니스 로직 수행");
	}

	@Override
	public void bizMethod2() {
		System.out.println("두번째 비즈니스 로직 수행");
	}

}
