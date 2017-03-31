package first.java;

public class Inher1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inher1Rect rec = new Inher1Rect();
		Inher1Tri tri = new Inher1Tri();
		
		rec.set_values(10, 10);
		tri.set_values(10, 10);
		System.out.println("Area of rectagle ="+rec.area());
		System.out.println("Area of triangle ="+tri.area());
	}

}
