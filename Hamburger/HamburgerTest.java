package Oops;

public class HamburgerTest{

	public static void main(String[] args) {
		
		Hamburger hamburger = new Hamburger("Basic","beef",3.56,"white");
		double price = hamburger.finalPrice();

		//addons

		hamburger.addHamburgerAddOn1("Tomato",0.50);
		hamburger.addHamburgerAddOn2("Cheese",0.50);
		hamburger.addHamburgerAddOn3("Lettuce",0.50);
		hamburger.addHamburgerAddOn4("pickle",0.50);

		System.out.println("Total : "+hamburger.finalPrice());
		






	}
}