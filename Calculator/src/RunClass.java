import java.util.ArrayList;

public class RunClass {
	
	public static int[] stringToInt(String string) {
		String[] arrayString = string.split(", ");
		int [] arrayNumbers = new int[arrayString.length];
		for (int n = 0; n < arrayString.length; n++) {
			arrayNumbers[n] = Integer.parseInt(arrayString[n]);
		}
		return arrayNumbers;
	}
	
	public static void main(String[] args) {
		ArrayList<Numbers> sets = new ArrayList<Numbers>();
		
		Numbers set1 = new Numbers("4, 2, 8");
		sets.add(set1);
		Numbers set2 = new Numbers("6, 2, 12");
		sets.add(set2);
		Numbers set3 = new Numbers("6, 2, 3");
		sets.add(set3);
		Numbers set4 = new Numbers("9, 12, 108");
		sets.add(set4);
		Numbers set5 = new Numbers("4, 16, 64");
		sets.add(set5);
		
		for (Numbers set : sets) {
			System.out.println("For: " + set.a + " " + set.b + " " + set.c + " ");
			
			for (String relation : Numbers.runCalculations(set.a,set.b,set.c)) {
				System.out.println(relation);
			}
			
			System.out.println("");
		}
	}
}
