package infinite.java2;

//  ->  arrow -lambda expression
// when multiple statement - {}
//when one statement - no need
//it's just that syntactically, the code is getting reduced.
//Where you are reducing the code.

@FunctionalInterface
interface App{
	
	void show(int i); //passing parameters
						
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		App obj = (int i)  -> System.out.println("in A show " + i);
				
				obj.show(5);
	}

}
