package infinite.java;


//In interface,you can have a class implementing multiple interfaces.

//class - class -> extends
//class - interface -> implements
//interface - interface ->extends


interface Abc{
	
	void show();
	void config();
}

interface Bcd{
	
	void run();
}

interface Cde extends Bcd{
	
	
}
class T implements Abc,Bcd {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("in run");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("in show");
	}

	@Override
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("in config");
	}
	
}



public class MoreOnInterface {

	public static void main(String[] args) {
		T obj = new T();
		obj.config();
		obj.run();
		obj.show();
		
		Bcd obj1 = new T();
		obj1.run(); //run
	}
}
