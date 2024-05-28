package infinite.java7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI_104 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(4,54,23,22,12,11,5,6,7,2);

		//stream -> stream gives you object of stream
		Stream<Integer> s1 = nums.stream();
//		s1.forEach(n -> System.out.println(n));
		
		Stream<Integer> s2 = s1.filter(n -> n%2==0); //even numbers
		Stream<Integer> s3 = s2.map(n -> n*2); //doubling the value
		int result = s3.reduce(0, (c,e) -> c+e);
		
		int result1 = nums.stream().filter(n -> n%2==0).map(n -> n*2).reduce(0, (c,e)->c+e);
		System.out.println( "result is " + result1);
		
		
		System.out.println(result);
		//once you use the stream you can't reuse it
		//you will get error
		//you can only use once
		
		//benefit
		//stream provides lots of methods to work on which you can perform operations
		//stream makes your work easy with the functions like filter,map , reduce
		
		
		
	}

}
