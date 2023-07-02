package misc;import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListIteratingDel {

	
	public static void main(String[] args) {
		
		
		List<String> ll = new ArrayList<String>();
		List<String> l = new LinkedList<String>();
		l.add("i");
		l.add("am");
		l.add("ANiruddha");
		
		ll.add("i");
		ll.add("am");
		ll.add("ANiruddha");
		
		
		System.out.println(l);
		System.out.println(ll);
		for(String s: l){
			if(s.equals("am")){
				l.remove(s);
			}
		}
		
		Iterator<String> it = ll.iterator();
		
		while(it.hasNext()){
			if(it.next().equals("am")){
				it.remove();
			}
		}
		System.out.println(l);

		System.out.println(ll);
	}
}
