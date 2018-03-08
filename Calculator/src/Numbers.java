import java.util.ArrayList;

public class Numbers {
	int a;
	int b;
	int c;
	static ArrayList<String> relations = new ArrayList<String>();
	
	public static ArrayList<String> addition(int number1, int number2, int number3){
		if (number1 + number2 == number3) {
			relations.add(number1 + " + " + number2 + " = " + number3);
		}
		return relations;
	}
	
	public static ArrayList<String> multiply(int number1, int number2, int number3){
		if (number1 * number2 == number3) {
			relations.add(number1 + " * " + number2 + " = " + number3);
		}
		return relations;
	}
	
	public static ArrayList<String> subtract(int number1, int number2, int number3){
		if (number1 - number2 == number3) {
			relations.add(number1 + " - " + number2 + " = " + number3);
		}
		return relations;
	}
	
	public static ArrayList<String> division(int number1, int number2, int number3){
		if (number1 / number2 == number3) {
			relations.add(number1 + " / " + number2 + " = " + number3);
		}
		return relations;
	}
		
	public static ArrayList<String> addNumbers(int number1, int number2, int number3) {
		relations.clear();
		addition(number1,number2,number3);
		addition(number2,number3,number1);
		addition(number3,number1,number2);
		return relations;
	}
	
	public static ArrayList<String> multNumbers(int number1, int number2, int number3){
		multiply(number1,number2,number3);
		multiply(number2,number3,number1);
		multiply(number3,number1,number2);
		return relations;
	}
	
	public static ArrayList<String> subNumbers(int number1, int number2, int number3){
		subtract(number1,number2,number3);
		subtract(number1,number3,number2);
		subtract(number2,number1,number3);
		subtract(number2,number3,number1);
		subtract(number3,number2,number1);
		subtract(number3,number1,number2);
		return relations;
	}
		
	public static ArrayList<String> divNumbers(int number1, int number2, int number3){
		division(number1,number2,number3);
		division(number1,number3,number2);
		division(number2,number1,number3);
		division(number2,number3,number1);
		division(number3,number2,number1);
		division(number3,number1,number2);
		return relations;
	}
	
	public static ArrayList<String> runCalculations(int number1, int number2, int number3){
		addNumbers(number1,number2,number3);
		subNumbers(number1,number2,number3);
		multNumbers(number1,number2,number3);
		divNumbers(number1,number2,number3);
		return relations;
	}
	
	public static int[] stringToInt(String string) {
		String[] arrayString = string.split(", ");
		int [] arrayNumbers = new int[arrayString.length];
		for (int n = 0; n < arrayString.length; n++) {
			arrayNumbers[n] = Integer.parseInt(arrayString[n]);
		}
		return arrayNumbers;
	}

	public Numbers(String input) {
		int[] numbers = stringToInt(input);
		this.a = numbers[0];
		this.b = numbers[1];
		this.c = numbers[2];
	}
}
