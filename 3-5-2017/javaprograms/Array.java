package first.java;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myintarray = {100,71,86,97,56};
		
		/*int[] myIntarray = {100,71,86,97,56};
		int[] myIntarray = new [100,71,86,97,56];
		int[] myIntarray = new int[]{100,71,86,97,56};
	*/
		int index = 0;
		while(index < 6){
			System.out.println(myintarray[index]);
			index++;
		}
	}

}
