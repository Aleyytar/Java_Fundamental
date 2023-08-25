package abstractDemo;

public class CustomManager {
	private BaseDatabaseManager baseDatabaseManager;
	
	public void getCustomer() {
		baseDatabaseManager.getData();
		
	}

	public CustomManager(BaseDatabaseManager baseDatabaseManager) {
		this.baseDatabaseManager = baseDatabaseManager;
	}

}
