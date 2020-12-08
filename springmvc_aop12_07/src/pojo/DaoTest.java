package pojo;

public class DaoTest implements Dao {

	@Override
	public void insert() {
		for (int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
