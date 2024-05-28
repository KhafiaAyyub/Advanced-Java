package infinite.java3;

public class Exception_throw_keyword {

	public static void main(String[] args) {
	
		//throw keyword
		//you can call catch block with the help of throw keyword
		//throw keyword is used to throw the exception
		
		
	int i=20;
	int j= 0;

	try {
		j=18/i;
		if(j==0) {
			throw new ArithmeticException("I don't want to print zero");
		}
//		System.out.println(j);
	} catch(ArithmeticException e) {
		j=18/1;
		System.out.println("that's the default output... "+ e);
	} catch(Exception e) {
		System.out.println("Something Went Wrong...");
	}
	
	System.out.println(j); //if i=20,then j = 0
	System.out.println("Bye");

	}
}
