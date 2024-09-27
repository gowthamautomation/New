import java.util.HashMap;
import java.util.Map;

public class Sam {
	public static void main(String[]args) {
		String s ="Gowtham"; 
	
		Map<Character, Integer> map= new HashMap<>();
		
		char[] ch = s.toCharArray();
		
		for (char c : ch) {
			
			if (map.containsKey(c)) {
				Integer in = map.get(c);
				map.put(c, in+1);
				
			}
			else {
				map.put(c, 1);
			}
			
		}
System.out.println(map);
				
			
		
		
		
		
		
		
		
		
	}

}
