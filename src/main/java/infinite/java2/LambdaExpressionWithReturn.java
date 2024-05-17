package infinite.java2;

interface Book{

	int add(int i,int j);

}


public class LambdaExpressionWithReturn {

	public static void main(String[] args) {

//		Book obj = (int i, int j) -> return i+j;  //we have one statement no need to write the curly bracket
//you cannot just write return
		
		Book obj = (i,j) -> i+j;
		int result = obj.add(5, 4);
		System.out.println(result + " is result");
	}
}

//lambda expression only works with functional interface
//if have multiple method - that's the confusion
//we cannot use lambda expression with other interface
