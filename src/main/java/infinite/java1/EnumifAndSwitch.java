package infinite.java1;


enum Status {
	Running, Failed, Pending , Success;
	
}
public class EnumifAndSwitch {
	
	public static void main(String[] args) {
		
		Status s = Status.Success;
		
		//using switch case
		switch(s) {
		case Running :
			System.out.println("All good");
			break;
		case Failed :
			System.out.println("Try Again");
			break;
		case Pending :
			System.out.println("Please Wait");
			 break;
		default :
			System.out.println("None");
			break;
		}

		//if - else if
		if(s == Status.Running) {
			System.out.println("All Good");
		} else if(s == Status.Failed) {
			System.out.println("Try Again");
		} else if(s == Status.Pending) {
			System.out.println("Please wait");
		} else {
			System.out.println("Done");
		}
	}

}
