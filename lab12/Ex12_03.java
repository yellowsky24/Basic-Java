package lab12;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex12_03{
	public static void main(String[] args) throws IOException {
		String str="Hello, my name is Harry Potter\n I am a student in the Java Language class.\n I am trying to write this text to a file.\n Thank you.";
		FileOutputStream output=new FileOutputStream("src/lab12/abc.txt");
		byte [] b=str.getBytes();
		output.write(b);
		output.close();
		
		FileWriter output2=new FileWriter("src/lab12/abc2.txt");
		output2.write(str);
		output2.close();
		
		PrintWriter output3= new PrintWriter("src/lab12/abc3.txt");
		output3.println(str);
		output3.close();
		
		//Append Mode
		FileWriter output5=new FileWriter("src/lab12/abc3.txt", true);
		output5.write(str);
		output5.close();
		
		PrintWriter output4= new PrintWriter(new FileWriter("src/lab12/abc2.txt", true));
		output4.println(str);
		output4.close();
		
		
		
		
	}
}