package sample03;

public class Human {

	private String name;
	private int age;
	private double weight;
	private double height;
	private int iq;
	
	Human(){}

	Human(String name, int age) {
		this(name, age, 60, 170, 100);

	}

	Human(String name, int age, double weight, double height, int iq) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.iq = iq;
	}

	void eat() {
		weight++;
	}

	void running() {
		weight--;
	}

	void study(int iq) {
		System.out.println(name + " 님께서 책을 읽었습니다.");
	}
	
	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	@Override
	public String toString() {
		return "이름은 " + name + ", 나이는 " + age + ", 몸무게는 " + weight + ", 키는 " + height + ", IQ 는" + iq + " 입니다. ";
	}
	
	
}
