public class BakeryDriver {

	public void runBakery() {
		Bakery bakery = new Bakery();
		
		Cake carrotCake = bakery.orderCake("carrot cake");
		System.out.println("\n-----------------------------------\n");
		
		Cake blackForestCake = bakery.orderCake("black forest cake");
		System.out.println("\n-----------------------------------\n");
		
		Cake birthdayCake = bakery.orderCake("birthday cake");
		System.out.println("\n-----------------------------------\n");
	}
	public static void main(String[] args) {
		BakeryDriver driver = new BakeryDriver();
		driver.runBakery();
	}

}
