package Intro;

public class LevelTwoIntermediate {

	public static void main(String[] args) {
		System.out.println(blackJack(5, 0));
		System.out.println(uniqueSum(1, 2, 3));
		System.out.println(tooHot(100, true));
	}

	public static int blackJack(int a, int b) {
		if (a > 21 && b > 21 || a == 0 && b == 0) {
			return 0;
		} else {
			if (a > b) {
				return a;
			} else {
				return b;
			}
		}
	}

	public static int uniqueSum(int a, int b, int c) {
		int sum = 0;

		if ((a == b) && (a == c)) {
			return 0;
		} else if (a == b) {
			sum = b + c;
			return sum;
		} else if (a == c) {
			sum = b + c;
			return sum;
		} else if (b == c) {
			sum = a + c;
			return sum;
		} else {
			sum = a + b + c;
			return sum;
		}
	}

	public static boolean tooHot(int temp, boolean isSummer) {
		if (isSummer == true) {
			if (temp >= 60 && temp <= 100) {
				return true;
			} else {
				return false;
			}
		} else {
			if (temp >= 60 && temp <= 90) {
				return true;
			} else {
				return false;
			}
		}
	}

}
