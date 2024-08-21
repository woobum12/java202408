package my.pkg.abstraction;

public class Bird extends Animal {
	
	public Bird(String name, String model, String color) {
		super(name, model, color);
		
		System.out.println("새 이름: " + super.name);
		System.out.println("종류: " + super.model);
		System.out.println("색깔: " + super.color);
	}
	
	@Override
	public void act() {
		System.out.println(super.name + "이가 날아갑니다");
	}
}
