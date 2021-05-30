import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainService {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String filePaths ="c://Work//ProjectFiles//";
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to EDataService Company : Ankita Ugalmugale");		
		String c ="";
		try {
			do
			{
				System.out.println("\n\nPlease find below services");
				System.out.println("\nSelect your option");
				System.out.println("\n1 : Add new file");
				System.out.println("\n2 : Search file");
				System.out.println("\n3 : Delete file");
				System.out.println("\n4 : Display all the files");


				int choice = input.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter file name");
					String filename = input.next();
					String FilePath = filePaths + filename + ".txt";
					FileRecords.addFile(FilePath);
					break;
					
				case 2:
					System.out.println("Enter filename need to be search");
					String searchFile = input.next();
					String searchFilePath = filePaths + searchFile + ".txt";
					FileRecords.searchFile(searchFilePath); 				
					break;
					
				case 3:
					System.out.println("Enter filename need to be deleted");
					String DeleteFile = input.next();
					String deleteFilePath = filePaths + DeleteFile + ".txt";
					Path pathOfFile = Paths.get(deleteFilePath);
					FileRecords.deleteFile(pathOfFile);
					 
					 break;
					 
				case 4:
					File fileDir = new File(filePaths);
					if(fileDir.isDirectory())
					{
						List<String> listFile = Arrays.asList(fileDir.list());
						System.out.println("Sorting by filename in ascending order");
						Collections.sort(listFile);
						for(String s: listFile){
							System.out.println(s);
						}
					}
					break;
					
				}
				 System.out.println("Do you want to continue with other services : y or n");
				 c = input.next();

			}while(c.equalsIgnoreCase("Y"));

		
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
}
	
