package infinite.java5;

//extend with class Thread
class A extends Thread{
	public void run() {  //run() method
		for(int i=1;i<=100;i++) {
			System.out.println("hi" + i);  //execute "hi" 10 times
		}
	}
}

//extend with Thread
class B extends Thread{
	
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("hello");  //execute "hi" 10 times
		}
	}

}

public class Multiple_Threads {

	public static void main(String[] args) {
		
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.start(); //start is methods belongs to thread class
		System.out.println("-------------------");
		obj2.start();
		//if i want to execute both the things at the same times -> we can use threads
		//since methods are behaviour
		
	}
}

//main() -> A - show() and B - show() with different threads.
//In Every thread, you need to have run method

//behind the scene there is concept of scheduler
//Scheduler -> is responsible to basically allow a thread to execute
//multiple cores -> execute multiple at same time



