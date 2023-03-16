package sample03;

public class Main {

	public static void main(String[] args) {
		
		
		Student student1 = new Student("김철수" , 18);
		Student student2 = new Student("홍길동" , 20 , 80, 180, 130, "10330");
		
		System.out.println(student1);
		
		student2.study(30);
		System.out.println(student2);

	}

	
}

