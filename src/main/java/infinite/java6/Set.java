package infinite.java6;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
	
	public static void main(String[] args) {
		
		//set supports unique values 
		//hashset - set
		
		//set will not give you in sorted order
		//it does'nt have index value
		//set is basically a collection of unique values
		
		//TreeSet - extends abstract set 
		//sorted set -> TreeSet
		
		//Iterable ->Collection Class
		
		
		Set<Integer> nums = new HashSet()<Integer>();
		nums.add(43);
		nums.add(56);
		nums.add(12);
		nums.add(32);
		
		
		Iterator<Integer> values = nums.iterator();
		
		
		
		
		for(int n : nums) {
			System.out.println(n);
		}
	}

}
