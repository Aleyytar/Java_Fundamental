package staticDemo;

public class ProductManager {
	
	private ProductValidator productValidator;
	
	
	
	public ProductManager(ProductValidator productValidator) {
		this.productValidator = productValidator;
	}



	public void add(Product product) {	
		if(productValidator.isValid(product)) {
		    System.out.println("Eklendi");
		}else {
			System.out.println("urun bilgisi gecersizdir.");
		}
		
	}

}
