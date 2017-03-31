package first.java;

public class ForFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for (init ; expression ; increment)
		int[] myintarray = {100,89,65,35,87};
		/*	for (int index=0 ; index < 5 ; index++)
		{
			System.out.println(myintarray[index]);
		}*/
		for (int element : myintarray)
		{
			System.out.println(element);
	}

}}
