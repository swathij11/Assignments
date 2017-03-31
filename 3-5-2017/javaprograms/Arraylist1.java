package first.java;
import java.util.ArrayList;
public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int simple_array[] = new int[5];
		ArrayList<Integer> MyList = new ArrayList<Integer>(5);
		MyList.add(1);
		MyList.add(7);
		MyList.add(9);
		MyList.add(987);
		MyList.add(98);
		 for (Integer x : MyList)
			 System.out.println(x);
			 
		 System.out.println("size = "+MyList.size());
		 //to remove some index
		 //MyList.remove(3);
		// System.out.println("size = "+MyList.size());
		//to clear the value
		// MyList.clear();
		// System.out.println("size = "+MyList.size());
		 //to change the value at one index
		 MyList.set(3,255);
		 System.out.println("size = "+MyList.size());
		 //to Trim-cutting size of elements
		 MyList.trimToSize();
		 System.out.println("size = "+MyList.size());
	}

}
