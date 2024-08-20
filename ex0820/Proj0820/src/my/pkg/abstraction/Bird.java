package my.pkg.abstraction;

public class Bird extends Animal {
	
	public String name = "종달새";
	
	
	@Override
	public void act() {
		System.out.println("새가 날아갑니다");
	}
}
