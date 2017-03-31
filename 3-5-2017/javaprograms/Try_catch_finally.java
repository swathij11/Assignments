package first.java;

public class Try_catch_finally {

	public static int retInt() {
		int a = 100;
		try {
			return a;
			
		} catch (ArithmeticException e) {
			
			System.out.println("Catch Called");
			System.out.println(e);
			return a;
		}finally {
			a = 5000;
			System.out.println(("Finally called"));
			return a;
		}
		}
		public static void main(String[] args) {
			System.out.println(retInt());
}
}
