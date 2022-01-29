import java.io.FileReader;

class FilesWordRead {
  public static void main(String args[]) throws Exception {
    int words = 0;
    int lines = 0;
    int chars = 0;

    FileReader fr = new FileReader("filename1.txt");
    int c = 0;
    boolean lastWhite = true;
    String whiteSpace = " \t\n\r";

    while ((c = fr.read()) != -1) {
      chars++;
      if (c == '\n') {
        lines++;
      }
      int index = whiteSpace.indexOf(c);
      if (index == -1) {
        if (lastWhite == true) {
          ++words;
        }
        lastWhite = false;
      } else {
        lastWhite = true;
      }
	 
    }
	 System.out.println(words);
    if (chars != 0) {
      ++lines;
    }
  }
}
