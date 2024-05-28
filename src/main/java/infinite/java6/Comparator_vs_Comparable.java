package infinite.java6;

import java.util.Collections;

public class Comparator_vs_Comparable {

public static void main(String[] args) {

//	List<Integer> nums = new ArrayList();
	ArrayList<Integer> nums =  new ArrayList<Integer>();
	
	nums.add(44);
	nums.add(5);
	nums.add(34);
	nums.add(98);
	
	Collections.sort(nums);
	System.out.println(nums);
	
	
}
	
}
