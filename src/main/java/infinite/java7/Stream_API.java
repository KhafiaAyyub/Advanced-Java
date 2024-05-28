package infinite.java7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API {

	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,54,23,22,12,11,5,6,7,2);
		
		//stream API -> 
		
		//normal forLoop
//		for(int i=0;i<nums.size();i++) {
//			System.out.println(nums.get(i));
//		}
		
		//enhanced for loop
//		for(int n : nums) {
//			System.out.println(n);
//		}
//		
		
		//forEach method
		//i need to get object of consumer
		//consumer is a interface- functional interface
		nums.forEach(n -> System.out.println(n));
		
//		int sum =0;
//		for(int n: nums) {
//			
//			if(n%2 == 0) {
//				 n = n *2;
//				 sum = sum + n;
//			}
//		}
		
		System.out.println(nums);
	}
}
