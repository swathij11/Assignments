package first.java;

import java.util.Scanner;

public class UserInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner (System.in);
		System.out.println("enter some stirng");
		String user_input_string = scan.nextLine();
		System.out.println("the entered stirng is");
		System.out.print(user_input_string);
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("enter some double");
		double user_input_double = scan1.nextDouble();
		System.out.println("the entered stirng is");
		System.out.print(user_input_double);
		 */
		
		Scanner scan2 = new Scanner (System.in);
		System.out.println("enter some integer");
		int user_input_integer = scan2.nextInt();
		System.out.println("the entered integer is");
		System.out.print(user_input_integer);
		
				
	}

}
