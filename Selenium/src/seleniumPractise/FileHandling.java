package seleniumPractise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileHandling {

	static String filePath = "./src/doc";

	public static void main(String[] args) throws IOException {
		// simpleReader();
		// simpleWriter();
		//bufferReader();
		bufferWriter();

	}

	public static void simpleReader() throws IOException {

		FileReader fr = new FileReader(filePath);
		// System.out.println((char)fr.read());
		int i = 0;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);

		}
	}

	public static void simpleWriter() throws IOException {

		FileWriter wr = new FileWriter(filePath);
		wr.write("Hello");
		wr.close();

	}

	public static void bufferReader() throws IOException {
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.print(line);
		}
	}
	
	public static void bufferWriter() throws IOException
	{
		FileWriter writer = new FileWriter(filePath);
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write("Welcome to Handling");
		bw.close();
		
	}
}
