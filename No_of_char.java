import java.io.File;
import java.io.IOException;

public class No_of_char {
	public static void main(String args[])  {
		File myObj1 = new File("filename1.txt");
		long b3 = myObj1.length();
	    System.out.println(b3);
	}
}