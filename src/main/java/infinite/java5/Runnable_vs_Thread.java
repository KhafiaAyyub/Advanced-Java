package infinite.java5;

class E implements Runnable{

	@Override
	public void run() {

		for(int i =1;i<=5;i++) {
			System.out.println("hi"+"-"+i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}


class F implements Runnable{

	@Override
	public void run() {

		for(int i =1;i<=5;i++) {
			System.out.println("hello"+"-"+i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class Runnable_vs_Thread {

	public static void main(String[] args) {
		
		Runnable obj1 = new E();
		Runnable obj2 = new F();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		//start method start to thread
		t1.start();
		t2.start();
	}
}

//whenever you create a thread you have to:-
//1. Extend thread class
//2.implement runnable class
