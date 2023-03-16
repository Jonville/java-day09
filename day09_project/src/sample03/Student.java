package sample03;

import java.util.Scanner;

public class Student extends Human {

	private String hakNum;

	Student(String name, int age) {
		super(name, age);
	}

	Student(String name, int age, double weight, double height, int iq, String hakNum) {
		super(name, age, weight, height, iq);
		this.hakNum = hakNum;
	}

	@Override
	void study(int iq) {
		int parIq = getIq();
		parIq += iq;
		setIq(parIq);
		
		super.study(parIq);

	}

}
