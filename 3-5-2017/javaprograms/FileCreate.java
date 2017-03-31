package first.java;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreate {

	public static void main(String[] args) {
		try {
		File file =new File("filename.txt");
		
		if(!file.exists()) {
		
				file.createNewFile();
			} 
		
		PrintWriter pw =new PrintWriter(file);
		pw.println("this is my file content");
		pw.print(100000);
		pw.close();
			System.out.println("done");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		

	}

	}
}

