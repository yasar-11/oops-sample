package Oops;

public class Hamburger{

	private String name;
	private String meat;
	private double price;
	private String breadType;

	private String addOn1Name;
	private double addOn1price;

	private String addOn2Name;
	private double addOn2price;

	private String addOn3Name;
	private double addOn3price;

	private String addOn4Name;
	private double addOn4price;

	public Hamburger(String name,String meat,double price,String breadType){
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadType = breadType;
	}

	public void addHamburgerAddOn1(String name,double price){
		this.addOn1Name = name;
		this.addOn1price = price;
	}

	public void addHamburgerAddOn2(String name,double price){
		this.addOn2Name = name;
		this.addOn2price = price;
	}

	public void addHamburgerAddOn3(String name,double price){
		this.addOn3Name = name;
		this.addOn3price = price;
	}

	public void addHamburgerAddOn4(String name,double price){
		this.addOn4Name = name;
		this.addOn4price = price;
	}

	public double finalPrice(){
		double hamburgerPrice = this.price;
		System.out.println(this.name+" hamburger with "+this.meat+" stuff on "+this.breadType+" bread roll price is "+this.price);
		if(this.addOn1Name != null){
			hamburgerPrice += this.addOn1price;
			System.out.println(" Added "+this.addOn1Name+" for an extra "+this.addOn1price);
		}
		if(this.addOn2Name != null){
			hamburgerPrice += this.addOn2price;
			System.out.println(" Added "+this.addOn2Name+" for an extra "+this.addOn2price);
		}
		if(this.addOn3Name != null){
			hamburgerPrice += this.addOn3price;
			System.out.println(" Added "+this.addOn3Name+" for an extra "+this.addOn3price);
		}
		if(this.addOn4Name != null){
			hamburgerPrice += this.addOn4price;
			System.out.println(" Added "+this.addOn4Name+" for an extra "+this.addOn4price);
		}
		return hamburgerPrice;
	}









}