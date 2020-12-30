package oops;
abstract class Animal{

	abstract void move();
	abstract void eat();

	//Abstract methods contain only the method signature
	//Abstract classes are defined with the abstract keyword
	//process of hiding the implementation details and showing only functionality to the user
	//it can not insantiated have to create a instance in the class which extends this abstract class (child class)

	void print(){
		System.out.println("Animal's info :");
	}
}