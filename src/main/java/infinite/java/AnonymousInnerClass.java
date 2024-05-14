package infinite.java;


class C{
	
	public void show() {
		System.out.println("in C show");
	}
}

//class D extends C{  //method overriding
//	
//	//to extend class and override
//	public void show() {
//		System.out.println("in D show");
//	}
	
//}

public class AnonymousInnerClass {
	
	//Anonymous - something does'nt have name
	
	public static void main(String[] args) {
		
		C obj = new C()
		{
			public void show(){
				System.out.println("in new show");
			}	
		};
		obj.show();  //in new show

	}

}
