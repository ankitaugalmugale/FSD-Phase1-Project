import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileRecords {

	public static void addFile(String Filepath) throws IOException {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		File file = new File(Filepath);
		if (file.createNewFile())
		{
		    System.out.println("Want to write anything in the file? \n If yes then y or n ");
		    String Yes = input.next();
		    if(Yes.equalsIgnoreCase("Y"))
		    {
		    	System.out.println("Enter Data");
		    	String fileContent = input.next();
		    	 BufferedWriter writer = new BufferedWriter(new FileWriter(Filepath));
		    	 writer.write(fileContent);
		    	 writer.close();
				 System.out.println("File is created!");

		    }
		    else
		    {
			    System.out.println("Empty file is created!");

		    }
		} 
		else 
		{
		    System.out.println("File already exists.");
	    }

	}
	public static void searchFile(String searchFilePath) {
		 File f = new File(searchFilePath);
	     if (f.exists())
	     {
	    	 
	         System.out.println("File Exists : Data as follow \n");
	         try (BufferedReader br = new BufferedReader(new FileReader(searchFilePath)))
	         {
	             String sCurrentLine;
	             while ((sCurrentLine = br.readLine()) != null) 
	             {
	                 System.out.println(sCurrentLine);
	             }
	         } 
	         
	         catch (IOException e) 
	         {
	             e.printStackTrace();
	         }   
	     }
	     else
	     {
	    	 System.out.println("Does not Exists");
	     }
	         
		
	}
	public static void deleteFile(Path pathOfFile) {
		try 
		 {
			  
	        boolean result = Files.deleteIfExists(pathOfFile);
	        if (result)
	        {
	            System.out.println("File is deleted");
	        }
	        else
	        {
	            System.out.println("File does not exists");
	        }
	     }
	     catch (IOException e) 
		 {
	         e.printStackTrace();
	     }
		
	}
	
}


