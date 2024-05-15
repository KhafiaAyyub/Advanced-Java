package infinite.java1;

enum Laptop {
	Macbook(2000), XPS(2200), Surface,ThinkPad(3000);

	//enum is class
	//enum cannot extend enum with other class
	//enum in Java extends a enum class by default
	//every class in java extends object
	//
	private int price;
	
	
	private Laptop() {
		price = 500;
	}
	//paramterized
	private Laptop(int price) {
		this.price = price;
		System.out.println("in Laptop");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

}


public class EnumClass {
	
	public static void main(String[] args) {
		
		Laptop lap = Laptop.Macbook;
		System.out.println(lap);
		
		System.out.println(lap + " : "+ lap.getPrice());
		
		System.out.println("----------------------------");
		
		for (Laptop laps : Laptop.values()) {
		System.out.println(laps + " : " + laps.getPrice());	
		}
		
		System.out.println(Laptop.Surface + " "+ lap.getPrice());
		
		
		
		
	}

}
