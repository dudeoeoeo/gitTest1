package pojo;

public class DaoImp implements Dao {

	@Override
	public void insert() {
		try{
			Class.forName("oracle.jdbc.OracleDriver");
		}catch(Exception e){
			e.printStackTrace();
		}
		//비즈니스 로직.... 
		System.out.println("비즈니스 로직 수행");
	}

	

}
