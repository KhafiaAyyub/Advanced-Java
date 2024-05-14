package infinite.java;


abstract class Q{
	
	public void show() {
		
	}
}

class B extends Q{
	
	public void show() {
		System.out.println("in B Show");
	}
}

public class AbstractAndAnonymousInnerClass {

	public static void main(String[] args) {
		
		Q obj = new Q() {
			
			public void show() {
				System.out.println("In new show");
			}			
		};
		
		obj.show();
	}
}
