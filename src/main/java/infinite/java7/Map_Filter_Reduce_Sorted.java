package infinite.java7;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Predicate;

public class Map_Filter_Reduce_Sorted {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(4,5,6,7,2);

		//Predicate is  interface
		Predicate<Integer> p= new Predicate<Integer>() {
		
			public boolean test(Integer n) {
				if(n%2 == 0)
					return true;
				else
					return false;	
			}
		};
		
		
		
	}

}
