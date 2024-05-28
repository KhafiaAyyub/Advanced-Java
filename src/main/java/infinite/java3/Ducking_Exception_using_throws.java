package infinite.java3;


//critical - you can use try catch
//e(){}  //critical statement
//d(){}  //critical statement
//c(){ d();e(); }
//d and e have same exception 
//when we are calling those methods we can call those methods together and write inside try catch

//sometimes just ducking the exception when we are not handling it, just calling it

//b(){ C(){ try-catch } }
//ducking exception is done with the help of throws keyword


class myException extends RuntimeException{
	
	public myException(String string) {
		super(string);
	}
}


public class Ducking_Exception_using_throws {
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("Calc");
		}
		Class.forName("Demo");
		
		int i=20;
		int j =0;
		
		
		try {
			j=18/i;
			if(j==0)
				throw new myException("I don't want any exception");
		}
		
	}

}
