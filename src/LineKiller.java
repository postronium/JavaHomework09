/**
 * ############################## Pg0903 ##############################
 * 		This is the original code (not the solution)
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineKiller {
	
	public static void readFirstLine(BufferedReader br) {
		String s;
		try {
			s = br.readLine();
			if (!s.startsWith("/*")) println(s); 
		} catch (IOException e) {
			println("erreur... " + e);
			System.exit(-1);
		}
	}
	
	public static void readOtherLines(BufferedReader br) {
		String s;
		try {
			s = br.readLine();
			while (s != null) {
				 println(s);
				 s = br.readLine();
			}
		} catch (IOException e) {
			println("erreur... " + e);
			System.exit(-1);
		}
	}
	
	public static void processFile(String filename) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(
					new FileReader(filename));
			
			readFirstLine(br);
			readOtherLines(br);
			
			br.close();
		} catch (IOException e) {
			println("erreur... " + e);
			System.exit(-1);
		}
		
		try {
			br.close();
		} catch (IOException e) {
			println("erreur... " + e);
			System.exit(-1);
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
