package MORSEcODE;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Alphabet {
	
	
	private static HashMap<Character, String> mcMAP = new HashMap<Character, String>();
		
	
	public Alphabet() {
		
	}
	
	public String initializeProgramme() {
		
		fill();
		
		System.out.println("Welcome to my Morse Code Encryptor and Translator!");
		System.out.print("Would you like to Morse to English (Enter true) or English to Morse? (Enter false) >");
		Scanner sc = new Scanner(System.in);
		boolean chooseFunction = sc.hasNext();
		
		
		while(chooseFunction != true && chooseFunction != false){
			System.out.println("Please re-enter valid choice!: 0 for morse to english or 1 for english to morse!");
			chooseFunction = sc.hasNext();
			sc.close();
		}
		
		System.out.println("Please enter the String you'd like to convert: ");
		Scanner sc2 = new Scanner(System.in);
			String input = sc2.nextLine();
			
		if(chooseFunction == true) {
			
			
			String output = convertMorseToEnglish(input);
			sc2.close();
			return output;
		} else {
			sc2.close();
			return convertEnglishToMorse(input);
		}
	}

	private String convertEnglishToMorse(String english) {
		
		String converted = "";
		
		for (int i = 0; i < english.length(); i++) {
			char c = english.charAt(i);
			
			converted += mcMAP.get(c);//getting key and adding to string
		}
		
		return converted;
	}
	
	private String convertMorseToEnglish(String morseCode) {
	    String converted = "";
	    
		String[] morseSplit = morseCode.split(" ");
		
		for (int i = 0; i < morseSplit.length; i++) {	
			converted += getKeyFromValue(mcMAP, morseSplit[i]);
		}
	    return converted;
	}
	
	private static Object getKeyFromValue(HashMap hm, Object value) {
	for (Object o : hm.keySet()) {
		if (hm.get(o).equals(value)) {
			return o;
		}
	}
	return value;
	}

	private void fill() {
		
		mcMAP.put(' ', "/");
		mcMAP.put('a', ".-");
		mcMAP.put('b', "-...");
		mcMAP.put('c', "-.-.");
		mcMAP.put('d', "-..");
		mcMAP.put('e', ".");
		mcMAP.put('f', "..-.");
		mcMAP.put('g', "--.");
		mcMAP.put('h', "....");
		mcMAP.put('i', "..");
		mcMAP.put('j', ".---");
		mcMAP.put('k', "-.-");
		mcMAP.put('l', ".-..");
		mcMAP.put('m', "--");
		mcMAP.put('n', "-.");
		mcMAP.put('o', "---");
		mcMAP.put('p', ".--.");
		mcMAP.put('q', "--.-");
		mcMAP.put('r', ".-.");
		mcMAP.put('s', "...");
		mcMAP.put('t', "-");
		mcMAP.put('u', "..-");
		mcMAP.put('v', "...-");
		mcMAP.put('w', ".--");
		mcMAP.put('x', "-..-");
		mcMAP.put('y', "-.--");
		mcMAP.put('z', "--..");
	}

}