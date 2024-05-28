package infinite.java6;

import java.util.Collection;
import java.util.List;

public class ArrayList {
	
	//all these classes extends object class
	//generics
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		//In
		nums.add(6);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		
		for (int n : nums) {
			
			int num = n;
			System.out.println(num+2);
		}
		
	}

}
