package infinite.java2;

//functional interface - SAM Single Abstract method

@FunctionalInterface
interface Ab{
	
	void show();
//	void run();
}

//class B implements A{
//	
//	public void show() {
//		System.out.println("in B show ");
//	}
//}

public class FunctionalInterface {

	public static void main(String[] args) {
		Ab obj = new Ab() 
		{
			public void show() {
				System.out.println("in AB show");
			}
		};
		obj.show();	
	}
}
//java 8 Features- java no more Os -> means is specifying everything, making a detailed code.
//java 8 features called Lambda expressions -> to reduce bugs,shorten the code, reduce number of lines

