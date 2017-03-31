package first.java;

public class TrynCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = new int[2];
		try{
			System.out.println("value of b =" + b[3]);
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
		}catch (Exception e) {
			System.out.println(e);
				}
		System.out.println("----------");	
	}

}
