package first.java;

public class OverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(9,99));
		System.out.println(Add(6.567,7.89));
		System.out.println(Add("Hello", " World"));
	}
	public static int Add (int a, int b) {
		return(a+b);
	}
	public static double Add (double a , double b){
	    return(a+b);
	}
	
	public static String Add (String a, String b){
		return(a+b);			
			
	}}


