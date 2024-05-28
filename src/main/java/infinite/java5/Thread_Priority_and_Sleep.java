package infinite.java5;

//i want to execute hi and hello one after the other

class C extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("hi"+ "-" +i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class D extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello" + "-"+ i );
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Thread_Priority_and_Sleep {
	
	public static void main(String[] args) {
		
		C obj1 = new C();
		D obj2 = new D();
		
		System.out.println(obj1.getPriority()); //5
		//range goes from 1 to 10
		//5 is default , 10 is max, 1 in min
		
//		obj2.setPriority(10);
		
		obj1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
	}

}
