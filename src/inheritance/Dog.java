package inheritance;

class Animal {

	String name = "동물";
	
	
	void display() {

		System.out.println("이름: " + name);
	}

}

public class Dog extends Animal { // 다중 상속 불가능

	String name = "몽몽";

	@Override // 부모값 재정의 
	void display() {//부모의 있는 display 값이다. 틀은 그대로 두면 {바디} 내용만 수정하는 것 

		System.out.println("이름: " + name);
		System.out.println(" super 이름 :" + super.name);
		super.display();

	}
	public Dog() {
		super();
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		//dog.display();
		
		Animal an=new Animal();
		an.display();
		
		Animal ani = new Dog();
		//ani.display();
		
	}

}
