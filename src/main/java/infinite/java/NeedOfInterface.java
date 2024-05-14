package infinite.java;

class Computer {
	
	public void code() {
		System.out.println();
	}
}
class Laptop extends Computer{
	
	public void code() {
		System.out.println("code,compile,run");
	}
}

class Desktop extends Computer{
	
	public void code() {
		System.out.println("code,compile,run : Faster");

	}
}
class Developer{
	
	public void devApp(Computer lap) {
		System.out.println("Coding...");
		lap.code();
	}
}

public class NeedOfInterface {

	public static void main(String[] args) {
		Developer navin = new Developer();
//		Laptop lap = new Laptop();
//		Desktop desk = new Desktop();
		//reference of parent of a sub class and object of subclass
		
		Computer lap = new Laptop();
		Computer desk = new Desktop();
		
		navin.devApp(desk); //code,compile,run : Faster
		navin.devApp(lap); //code,compile,run

//		navin.devApp(desk); //tight coupling here
	}
}
