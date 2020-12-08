package api;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AOPTest {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("api/api.xml");
		// APIBean bean = (APIBean)context.getBean("apiBean");
		// bean.bizMethod1();
		APIBean bean = (APIBean)context.getBean("aopBean");
		bean.bizMethod1();
		bean.bizMethod2();

	}

}
