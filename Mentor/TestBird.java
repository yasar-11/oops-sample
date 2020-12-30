package oops;

class TestBird {
	public static void main(String[] args) {
		Animal myBird = new Bird();

		myBird.print();
		myBird.move();
		myBird.eat();
	}
}