package infinite.java3;

//you can print exception as well
//Arithmetic exception
//Array index out of bound

public class TryWithMultipleCatch {
	public static void main(String[] args) {
	
		int i=0;
		int j =0;
		int nums[] = new int[5];
		
		String str = null;  //null pointer exception  
		
		try {
			j=18/i;
			System.out.println(str.length());
			System.out.println(nums[0]); 
			System.out.println(nums[5]);
//			System.out.println(str.length());
		} catch(ArithmeticException e){
			System.out.println("Cannot divide by zero " + e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bound " + e);
		}catch(Exception e) {
			//exception is the parent class
			System.out.println("something went wrong..."+ e);
		}
		
		
		System.out.println(j);
		System.out.println("bye");
		
	}
	

}
