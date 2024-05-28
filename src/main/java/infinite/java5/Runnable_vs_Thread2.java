package infinite.java5;

//class E implements Runnable{
//
//	@Override
//	public void run() {
//
//		for(int i =1;i<=5;i++) {
//			System.out.println("hi"+"-"+i);
//			
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	
//}


class G implements Runnable{

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

public class Runnable_vs_Thread2 {

	public static void main(String[] args) {
		
		//lambda expression
		//whenever you have functional interface
		//instantiate a interface with help of anonymous class
		Runnable obj1 = ()  ->
		{
				for(int i =1;i<=5;i++) {
					System.out.println("hi"+"-"+i);
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
		};
		Runnable obj2= ()  ->
		{
			for(int i =1;i<=5;i++) {
				System.out.println("hello"+"-"+i);
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	};
	
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		//start method start to thread
		t1.start();
		t2.start();
	}
}
