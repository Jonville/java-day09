package sample03;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		
		System.out.println(c.sum(3, 6));
		System.out.println(c.sum(3, 6.5));
		System.out.println(c.sum(1.5, 3.5));
		System.out.println(c.sum(3, 6, 9));
		
		
		
	}

}
