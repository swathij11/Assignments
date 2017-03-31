package first.java;

public class Myclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 mark =new Class1();//mark ->object or instance
	
/*mark.id = 1;
mark.name = "mark";
mark.age =16;
System.out.println(mark.name + " is "+ mark.age + "years old");


Class1 tom =new Class1();//mark ->object or instance

tom.id = 1;
tom.name = "tom";
tom.age =17;
System.out.println(tom.name +  " is "+ tom.age + "years old");

	}
*/
		mark.setId(1);
		mark.setName("mark");
		mark.setAge(16); 
		System.out.println(mark.getName() + " is "+ mark.getAge() + "years old");


		Class1 tom =new Class1();//mark ->object or instance

		tom.setId(2);
		tom.setName("tom");
		tom.setAge(17);
		System.out.println(tom.getName() +  " is "+ tom.getAge() + "years old");

			}
		
}
	
	
