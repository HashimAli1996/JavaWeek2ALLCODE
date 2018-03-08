package Intro;

public class LevelOneBasic {
	
	public static void main(String[] args){
		//helloWorld();
		//System.out.println(helloWorld());
		
		//add(7, 99);
		
		//addMulti(5, 9, false);
		
		//addIfZero(9, 9);

		//iterateAddIfZero();
		
		//arrayZ();
		
		//printArray();
		
		//arrayIterateAddZeroIf();
		
		nestArrayTing();
	}
	
	public static String helloWorld() {
		String var = "Hello World!";
		
		return var;
	}
	
	//exercise parameters/operators
	public static void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	//conditionals
	public static void addMulti(int a, int b, Boolean c) {
		if(c == true) {
			int add = a + b;
			System.out.println(add);
		} else if(c == false) {
			int multiply = a * b;
			System.out.println(multiply);
		} else {
			System.out.println("Neither True or False was entered");
		}
	}
	
	
	//conditionals 2
 	public static int addIfZero(int a, int b) {
 		
		if(a == 0 || b == 0){
			if(a == 0) {
				//System.out.println(b);
				return b;
			} else {
				//System.out.println(a);
				return b;
			}
		} else {
			int add = a + b;
			//System.out.println(add);
			return add;
		}
	}
	
 	
 	//iteration
	public static void iterateAddIfZero() {
		for (int i = 0; i < 10; i++) {
			addIfZero(i, 5);
		}
	}
	
	//arrays
	public static void arrayZ() {
		int[] hold = {12, 1, 4, 6, 2, 9, 22, 777, 0, 90};
		
		for (int i = 0; i < 10; i++) {
			System.out.println(addIfZero(hold[i], 99));
		}
	}
	
	//incorrect
	public static void arrayIterateAddZeroIf() {
		//add values into hold array with add zero output
		int[] hold = new int[10];

		for (int i = 0; i < 10; i++) {
			hold[i] = addIfZero(i, 5);
			System.out.println("hold " + i + " contains : " + hold[i]);
		}
	}
	
	//iterate array
	public static void printArray() {
		int hold[] = {12, 1, 4, 6, 2, 9, 22, 777, 0, 90};
		
		for (int i = 0; i < hold.length; i++) {
			System.out.println("Number: " + hold[i]);
		}
	}
	
	
	//iterate arrays 2
	public static void nestArrayTing() {
		
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (i + 5) * 6;
			System.out.println("array " + i + " contains : " + array[i]);
		}
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array " + i + " multiplied by 10 = " + array[i] * 10);
		}
	}
	
}
