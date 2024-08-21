package my.pkg.abstraction;

public class Dog extends Animal {
	
	public Dog(String name, String model, String color) {
		super(name, model, color);
		
		System.out.println("강아지 이름 :" + super.name);
		System.out.println("모델: " + super.model);
		System.out.println("색깔: " + super.color);
	}
	
	//추상메소드 재정의
	@Override
	public void act() {
		System.out.println(super.name + "가 행동합니다.");
	}
}
