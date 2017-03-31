package first.java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("filename.txt"));
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
