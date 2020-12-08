package pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class POJOTest {

	public static void main(String[] args) {
		ApplicationContext context
		 = new GenericXmlApplicationContext("pojo/pojo.xml");
		Dao dao = context.getBean("dao1", Dao.class);
		dao.insert();
		//((Dao)context.getBean("dao")).insert();
	}
	
}
