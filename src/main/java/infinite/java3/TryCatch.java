package infinite.java3;

// normal statement and critical statement


public class TryCatch {
	
	public static void main(String[] args) {
//		int i = 9; 
//		int j = 18/i; //normal statement
		int i= 4; 
		int j = 0;
		try {
		 j=18/i;
		} 
		catch (Exception e) {  //exception is class
			// TODO: handle exception
			System.out.println("Something went wrong");
		}
		
		System.out.println("bye");
		
		System.out.println(j); 
		
		
		//you put normal statement in try as well but it's better to keep critical statement
		
		
		//Arithmetic Exception
		//it stops the execution 
		//to stop this you can put in separate block
//		System.out.println("bye");
	
		//catch block will be executed only in case of exception
		//other wise catch block will be skipped.
		
	}

}
