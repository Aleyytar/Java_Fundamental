package abstractClasses;

public class Main {

	public static void main(String[] args) {
		GameCalculator[] calculator =new GameCalculator[] {new KidsCalculator(),new ManGameCalculator(), new WomanCalculator()};
		for (GameCalculator gameCalculator : calculator) {
			gameCalculator.hesapla();
			
		}
		
		

	}

}
