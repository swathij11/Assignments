package first.java;

public class Polymorph_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 abc = new Bank1_ABC();
		Bank1 def = new Bank1_DEF();
		Bank1 xyz = new Bank1_XYZ();
		
		System.out.println(abc.getInterestRate());
		System.out.println(def.getInterestRate());
		System.out.println(xyz.getInterestRate());
	}

}
