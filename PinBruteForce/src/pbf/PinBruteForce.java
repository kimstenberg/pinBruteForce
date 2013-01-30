package pbf;

import java.util.Scanner;


public class PinBruteForce {
	
	public static void main(String[] args) {
		
		String filename = new String();
		int pin = 1234;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Pin: ");	
		pin = in.nextInt();
		in.close();
		
		FileAdapter fd = new FileAdapter();
		String megaString = fd.importFile(filename);
		
		if( megaString != null) {
			System.out.println("\nStarting pin bruseforce using pi");
			BruteForce bf = new BruteForce(megaString, pin);
		} else {
			System.out.println("Error: Pi file error!");
		}
		
		

	}

}
