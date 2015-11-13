import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main 
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("My Reader");
		
		try 
		{
			FileReader fileReader = new FileReader("/Users/Earthbound/Documents/OOP_week15.rtf");
			String fileContents = "";
			int i;
			while ((i = fileReader.read()) != -1)
			{
				char ch = (char)i;
				fileContents = fileContents +ch;
			}
			fileReader.close();
			System.out.println(fileContents);
			String tmpStr = replaceMyString(fileContents);
			writeItBack(tmpStr);
		} 
		catch (FileNotFoundException fnfe) 
		{
			System.out.println("File not found.");
			fnfe.printStackTrace();
		}
		catch (IOException ioe)
		{
			System.out.println("IO Exception.");
			ioe.printStackTrace();
		}
	}

	private static void writeItBack(String tmpStr) throws IOException 
	{
		FileWriter fileWriter = new FileWriter("/Users/Earthbound/Documents/OOP_week15.rtf");
		fileWriter.write(tmpStr);
		fileWriter.close();
	}

	private static String replaceMyString(String fileContents) 
	{
		String tmp = fileContents.replace("dolor", "hedon");
		System.out.println(tmp);
		return tmp;
	}

}
