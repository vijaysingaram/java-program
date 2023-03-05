import java.util.Scanner;
import java.io.File;
public class ReadFile {
	public static void main(String args[]) {
		try {
			File f = new File("Example1.txt");
			Scanner reader = new Scanner(f);
			while(reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
		}
		catch(Exception e) {
			System.out.println(e);
	}
	}

}
