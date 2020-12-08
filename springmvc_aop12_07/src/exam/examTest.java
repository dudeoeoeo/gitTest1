package exam;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.GenericXmlApplicationContext;

import pojo.Dao;

public class examTest {
	
	public static void main(String[] args) {
		ApplicationContext context
		 = new GenericXmlApplicationContext("exam/exam.xml");
		BizService dao = context.getBean("bean", BizService.class);
		dao.securityMethod();
	}
	
}
