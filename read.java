import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter file name and/or path: ");
		String fileName = input.nextLine();
		
		try {
			File file = new File(fileName);
			Scanner reader = new Scanner(file);
			
			while (reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("read: No such file or directory: " + fileName);
		}
		input.close();
		}
	}