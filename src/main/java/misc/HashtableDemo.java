package misc;import java.util.Hashtable;
import java.util.Map;


public class HashtableDemo {

	
	public static void main(String[] args) {
		
		Map<String,String> h = new Hashtable<String, String>(); 
		
		h.put("a", "A");
		h.put("b","B");
		
		
		
		System.out.println(h);
	}
}
