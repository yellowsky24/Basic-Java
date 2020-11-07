package lab13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex13_04 {
	public static void main(String[] args) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("src/cse3040ex1304/myFile1.txt"));
			while (true) {
				try {
				String line = br.readLine();
				if (line == null)
					break;
				System.out.println(line);
				}catch(IOException e) {
					e.printStackTrace();
					System.out.println("Exception! : "+e.getMessage());
				}
			}
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Exception! : "+e.getMessage());
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("FileInput Error!");
			
		}
		
	}
}
