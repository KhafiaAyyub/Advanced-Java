package infinite.java;

//A having three things
class A{

	int age;
	
	public void show() {
		System.out.println("in show");
	}
	
	 class B{
//		static class B{
		//in static class you don't need object 
		//you can't create outer class static
		
		public void config() {
			System.out.println("In config");
		}
	}
	
}



public class InnerClass {

	public static void main(String[] args) {
		
		A obj2 = new A();
		obj2.show();
		
//		B obj1 = new B(); //B is not openly available
		//B belongs to A
		A.B obj1 = obj2.new B(); //if you want to call you need the object of A
		obj1.config();  //B belongs to A you cann methods
		
		
	}
}
