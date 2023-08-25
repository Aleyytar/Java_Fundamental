
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * BaseLogger[] loggers = new BaseLogger[] {new FileLogger() , new
		 * EmailLogger(), new DataBaseLogger()
		 * 
		 * };
		 * 
		 * for (BaseLogger baseLogger : loggers ) { baseLogger.Log("Log Mesajı");
		 * 
		 * }
		 */
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.Add();	

	}

}
