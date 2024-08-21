package my.pkg.abstraction;

public class Snake extends Animal {
	
	public Snake(String name, String model, String color) {
		super(name, model, color);
		
		System.out.println("뱀의 이름: " + super.name);
		System.out.println("종류: " + super.name );
		System.out.println("색깔: " + super.model);
	}
	
	@Override
	public void act() {
		System.out.println(super.name + "뱀이 물었습니다.");
	}
}
