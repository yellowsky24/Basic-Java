package lab12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex12_04 {

	public static void main(String[] args) throws IOException {
		byte[] b=new byte[100];
		int rv;
		FileInputStream input= new FileInputStream("src/lab12/abc.txt");
		while(true)
		{
			rv=input.read(b);
			if(rv==-1) break;
			 System.out.print(new String(b).substring(0, rv));
		}
		input.close();
		BufferedReader input2=new BufferedReader(new FileReader("src/lab12/abc.txt"));
		while(true)
		{
			String line=input2.readLine();
			if(line==null) break;
			System.out.println(line);
		}
		input2.close();
	}
}
