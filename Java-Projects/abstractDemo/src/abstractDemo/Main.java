package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomManager customManager  = new CustomManager(new MySqlDataManager());
		customManager.getCustomer();

	}

}
