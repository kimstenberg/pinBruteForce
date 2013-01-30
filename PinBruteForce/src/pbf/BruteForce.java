package pbf;

import java.util.ArrayList;

public class BruteForce {


	private String megaString;
	private String[] list;
	private ArrayList<Character> newPin = new ArrayList<Character>();

	
	public BruteForce(String megaString, int pin) {
		this.megaString = megaString;
		int length = (int)(Math.log10(pin)+1);
		list = new String[length];
		
		for(int i = length-1;i >= 0;i--) {
		    list[i] = String.valueOf((pin % 10 ));
		    pin = pin / 10;
		}
		
		pinBruteForce();
	}
	
	private void pinBruteForce() {
		
		int counter = 0;
		int n = 0;
		
			while(list.length != newPin.size()) {
			
				if(list[n].charAt(0) == megaString.charAt(counter)) {
					newPin.add(megaString.charAt(counter));
					n++;
				} else {
					newPin.clear();
					n = 0;
				}
			
				counter++;
				if(counter == 1000000)
					break;
			}
		
		if(newPin.isEmpty()) {
			System.out.println("No pin found!");
		
		} else {
			System.out.print("\nPin is: ");
			for(int i = 0; i < newPin.size();i++) {
				System.out.print(newPin.get(i));
			}
			System.out.println("\nNumber of attempts: " + counter);
		}
		
	}	
}