package oops;
public class TestAnimalChar {
	public static void main(String[] args) {
		AnimalChar myAnimal = new AnimalChar();

		myAnimal.setName("Lion");
		myAnimal.setAverageWeight(190.0);
		myAnimal.setNumberOfLegs(4);

		System.out.println("Name: " + myAnimal.getName());
		System.out.println("Average weight: " + myAnimal.getAverageWeight() + "kg");
		System.out.println("Number of legs: " + myAnimal.getNumberOfLegs());
	}
}