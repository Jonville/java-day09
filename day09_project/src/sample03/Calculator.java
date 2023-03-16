package sample03;

public class Calculator {

	int sum(int a, int b) {
		return a + b;
	}

	double sum(int a, double b) {
		return a + b;
	}

	double sum(double a, double b) {
		return a + b;
	}
	
	int sum(int a, int b, int c) {
		return a + b + c;
	}

	void refTest(int[] arr) {
		arr[1] = 20;
	}
	
	void refTest(int a) {
		a = 20;
	}
}
