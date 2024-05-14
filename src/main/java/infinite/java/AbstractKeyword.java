package infinite.java;

abstract class Car {
	
	
	//you cannot create object of abstract class
	//you can restrict the creatu=ion ob object
	public abstract void drive();
	public abstract void fly();
	
	public void playMusic() {
		System.out.println("play music");
	}
}

abstract class WagonR extends Car {
	
	public void drive() {
		System.out.println("Driving...");
	}
	
	public void fly() {
		System.out.println("Flying...");
	}	
}

class UpdatedWagnoR extends WagonR{
	
	public void fly() {
		System.out.println("flying...");
	}
}

public class AbstractKeyword {
	
	public static void main(String[] args) {
//		Car obj = new Car();
//		Car obj = new WagonR();
		Car obj = new UpdatedWagnoR();
		
		
		obj.drive();
		obj.playMusic();
		obj.fly();
		obj.fly();
	}

}
