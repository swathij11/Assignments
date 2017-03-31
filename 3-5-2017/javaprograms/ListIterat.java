package first.java;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("naveen");
		names.add("nandu");
		names.add("pavan");
		names.add("pranv");
		names.add("patrik");
		
		ListIterator<String> itr = names.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("");System.out.println("");
		
		while(itr.hasPrevious())
			System.out.println(itr.previous());
		
 
	}

}
