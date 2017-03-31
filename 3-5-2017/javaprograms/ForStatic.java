package first.java;

public class ForStatic {

	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	static int NoOfStudents = 0;
	
	ForStatic (){
		NoOfStudents++;
		
	}
		public static int getNoOfStudents(){
			return NoOfStudents;
			
		}
}
