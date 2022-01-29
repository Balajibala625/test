import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileLineRead 
{
	public static void main(String[] args) throws IOException
	{
		
		FileReader fr=new FileReader("filename1.txt");
		BufferedReader br=new BufferedReader(fr);
		int x=0;
		while(true)
		{
			String s=br.readLine();
			if(s==null)
			{
				break;
			}
			x++;
		}	
	    System.out.println(x);
	}
}