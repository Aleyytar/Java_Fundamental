package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager(new ProductValidator());
		Product product = new Product();
		Product product2= new Product(1, "BAG");
		Product product3 = new Product(2, "Iphone", 1000);
		manager.add(product);
		manager.add(product2);
		manager.add(product3);
		

	}

}
