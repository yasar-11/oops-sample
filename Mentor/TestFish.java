package oops;

class TestFish {
	public static void main(String[] args) {
		Animal myFish = new Fish();

		myFish.print();
		myFish.move();
		myFish.eat();
	}
}