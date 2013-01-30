package pbf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAdapter {
	public String importFile(String fileName) {
	
		try {	
			File file = new File("src/pbf/pi/pi.txt");
			Scanner scanner = new Scanner(file);
			String megaString = scanner.next();
			scanner.close();
			return megaString;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}

	}
}
