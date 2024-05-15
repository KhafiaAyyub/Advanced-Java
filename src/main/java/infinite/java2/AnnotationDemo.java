package infinite.java2;

//Annotations-simply means a supplement to compiler or to the runtime 
//we also called it metadata


class A{

	public void showTheDataWhichBelongsToThisClass() {
		System.out.println("in A show");
	}
}

class B extends A{  //overriding
	
	//inbuilt annotation in java - override
	//you can create your own annotation
	//there are some which works on methods, variables, class level
	//@Depercated - youcan use or not
	//by default it will give  you override
	@Override
	public void showTheDataWhichBelongToThisClass() {
		System.out.println("in B show");
	}
}


public class AnnotationDemo {
	
	public static void main(String[] args) {
		B obj = new B();
		obj.showTheDataWhichBelongsToThisClass(); 
	}

}
