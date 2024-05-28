package infinite.java7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
	
//forEach method
		//i need to get object of consumer
		//consumer is a interface- functional interface
public class forEach {
	
	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(4,5,6,78,6);
		
		//consumer object - con
//		Consumer<Integer> con = new Consumer<Integer>() {
//			
//			public void accept(Integer n) {
//				System.out.println(n);
//			}
//		};
		
		
		//using Lambda expression
		Consumer<Integer> con = n -> System.out.println(n);
		nums.forEach(con);	

//		nums.forEach(n -> System.out.println(n););
		
	}

}
