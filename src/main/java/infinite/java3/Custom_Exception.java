package infinite.java3;

//custom Exception - my own exception
//by creating a class

//even exception has a constructor which take string
//we are getting all the features from exception

//for this you need:-
//class named exception which should extend Exception or Runtime Exception
class myException extends Exception{
	public myException(String string) {
	
		super(string);
		
	}
}


public class Custom_Exception {

	public static void main(String[] args) {
		int i=20;
		int j=0;
		
		try {
			j=18/i;
			if(j==0) {
				throw new myException("I don't want to print zero");
			}
			} catch(myException e) {
				j=18/i;
				System.out.println("that's the default output... "+e);
			} catch(Exception e) {
				System.out.println("Something went wrong... "+e);
			}
		}
	}

