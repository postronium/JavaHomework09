/**
 * ############################## Pg0903 ##############################
 * 		This is the solution
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pg0903 {
	
	public static void readFirstLine(BufferedReader br) throws IOException {
		String s;
		s = br.readLine();
		if (!s.startsWith("/*")) println(s); 
	}
	
	public static void readOtherLines(BufferedReader br) throws IOException {
		String s;
		s = br.readLine();
		while (s != null) {
			 println(s);
			 s = br.readLine();
		}
	}
	
	public static void processFile(String filename) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(
					new FileReader(filename));
			
			readFirstLine(br);
			readOtherLines(br);
		} catch (IOException e) {
			println("erreur... " + e);
			System.exit(-1);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				println("erreur... " + e);
				System.exit(-1);
			}
		}
	}
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		String filename = "LineKiller.java";
		processFile(filename);
	}

}
