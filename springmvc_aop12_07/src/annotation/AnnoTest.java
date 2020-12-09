package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import annotation.BizService;

public class AnnoTest {

	public static void main(String[] args) {
		ApplicationContext context
		 = new GenericXmlApplicationContext("annotation/annotation.xml");
		BizService dao = context.getBean("bizService", BizService.class);
		dao.method2();
	}

}