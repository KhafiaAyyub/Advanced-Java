package infinite.java6;

public class Map {
	
	public static void main(String[] args) {
		
		//Map - name and number
		//index value -> key and value
		//map- collection and value pair
		
		Map<String, Integer> m = new HashMap<>();
		m.put("navin", 23);
		m.put("Harsh", 54);
		m.put("sushil",67);
		
		System.out.println(m.get(56));
	}

}
