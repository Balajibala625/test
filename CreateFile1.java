import java.io.File;
import java.io.IOException;

public class CreateFile1 {
  public static void main(String[] args) throws IOException {
      File myObj1 = new File("filename1.txt");
      boolean b1 = myObj1.createNewFile();
	  System.out.println(b1);
	  File myObj2 = new File("C:\\Users\\SONY\\documents\\inter\\filename1.txt");
	  boolean b2=myObj2.mkdirs();
	  System.out.println(b2);
	  long b3 = myObj1.length();
	  System.out.println(b3);
	  String b4 = myObj1.toString();
	  System.out.println(b4);
	  File myObj3 = new File("fileName3.txt");
	  myObj3.createNewFile();
	  boolean b5 = myObj3.delete();
	  System.out.println(b5);
	  
  }
}