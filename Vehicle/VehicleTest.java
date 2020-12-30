package Oops;

interface Vehicle{
	String startEngine();
	String move();
	String brake();
}
interface ManualGear{
	String ChangeGear();
}
class Car{
	private boolean engine;
	private String name;
	private int wheels;
	private int cylinders;

	public Car(String name,int cylinders){
		this.engine = true;
		this.wheels = 4;
		this.name = name;
		this.cylinders = cylinders;
	}
	public String getName(){
		return this.name;
	}
	public int getCylinders(){
		return this.cylinders;
	}
	public String startEngine(){
		return "Car -> startEngine()";
	}
	public String move(){
		return "Car -> move()";
	}
	public String brake(){
		return "Car -> brake()";
	}
}
class FourRing extends Car{
	public FourRing(String name,int cylinders){
		super(name,cylinders);
	}
	public String startEngine(){
		return getClass().getSimpleName()+" -> startEngine() ";
	}
	public String move(){
		return getClass().getSimpleName()+" -> move() ";
	}
	public String brake(){
		return getClass().getSimpleName()+" -> brake() ";
	}
}
class Bike implements Vehicle{
	public String startEngine(){
		return getClass().getSimpleName()+" -> startBikeEngine() ";
	}
	public String move(){
		return getClass().getSimpleName()+" -> move() ";
	}
	public String brake(){
		return getClass().getSimpleName()+" -> brake() ";
	}
}
class BMW implements Vehicle,ManualGear{
	public String startEngine(){
		return getClass().getSimpleName()+" -> StartBMWEngine() ";
	}
	public String move(){
		return getClass().getSimpleName()+" -> move() ";
	}
	public String brake(){
		return getClass().getSimpleName()+" -> brake() ";
	}
	public String ChangeGear(){
		return getClass().getSimpleName()+" -> ChangedGear() ";
	}
}
public class VehicleTest{
	public static void main(String[] args) {
		//class,object,inheritance,constructors,encapsulation,polymorphism,interface implemented .
		//not implemented interface working on it .finished
		Car car=new Car("base car",4);
		System.out.println("Model "+car.getName());
		System.out.println(car.startEngine()) ;
		System.out.println(car.move()) ;
		System.out.println(car.brake()) ;

		FourRing fourRing =new FourRing("Audi 200",4);
		System.out.println("Model "+fourRing.getName());
		System.out.println(fourRing.startEngine()) ;
		System.out.println(fourRing.move()) ;
		System.out.println(fourRing.brake()) ;

		Vehicle vehicle =new Bike();
		System.out.println(vehicle.startEngine()) ;
		System.out.println(vehicle.move()) ;
		System.out.println(vehicle.brake()) ;

		// vehicle = new BMW();
		// System.out.println(vehicle.startEngine()) ;
		// System.out.println(vehicle.move()) ;
		// System.out.println(vehicle.brake()) ;

		// ManualGear mg = new BMW();
		// System.out.println(mg.ChangeGear()) ;
		BMW bmw = new BMW();
		System.out.println(bmw.startEngine()) ;
		System.out.println(bmw.move()) ;
		System.out.println(bmw.brake()) ;
		System.out.println(bmw.ChangeGear()) ;
	}
}