package infinite.java1;


enum Status {
	Running, Failed, Pending, Success;
	//you numbering also
}
public class EnumDemo {
	
	public static void main(String[] args) {
		
		int i=5;
		Status s = Status.Running;
		Status f = Status.Failed;
		System.out.println(s);
		System.out.println(s.ordinal());//says the order //0
		System.out.println(f);
		System.out.println(Status.Pending.ordinal());
		
		Status[] ss = Status.values();
		
		System.out.println(ss[1]);
		
		for (Status s1 : ss) {
			System.out.println(s1 + " : " + s1.ordinal());
		}
		
		System.out.println(s.getClass().getSuperclass()); //class java.lang.Enum
	}

}
