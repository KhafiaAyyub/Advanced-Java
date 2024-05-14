package infinite.java;

//Instead of creating abstract class, we can create interface
//interface is not class
//interface are by default 'public abstract'
// we cannot instantiate it -> we cannot create object
// tell the methods but you have to implement it.
//class extends another class
//but interface implements
//all the variables in interface are by default static, final
// interface don't have their own memory in the heap

interface Art{
	
	int age = 33;  //by default static and final
	String area = "Mumbai";
	
	
	void show();  //by default public abstract
	void config();
}

class Bat implements Art{

	@Override
	public void show() {
		System.out.println("in show");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("in config");
	}
	
	
}

public class Interface {
	
	public static void main(String[] args) {
		
		Bat obj = new Bat();  //we can create object of Bat class
		obj.show();
		obj.config();
		System.out.println("Age is" + Art.age);
		System.out.println("Area is "+Art.area);
		
//		Art.area = "Jalandhar"; //area is final
		//we cannot change it
	}
	

}
