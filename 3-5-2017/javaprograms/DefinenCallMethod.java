package first.java;

public class DefinenCallMethod {

	public static void main(String[] args) {
		//define a method and call it.
	       int a = 11;
	       int b = 6;
	       int c = maxFunction(a, b);
	      System.out.println("Maximum Value = " + c);
	  }

		//to get the minimum of two numbers
		   public static int maxFunction(int a, int b) {
		      int max;
		      if (a > b)
		         max = a;
		      else
		         max = b;

		      return max; 
	   }
	
}
