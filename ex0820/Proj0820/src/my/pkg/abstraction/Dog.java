package my.pkg.abstraction;

public class Dog extends Animal {
	//추상메소드 재정의
	@Override
	public void act() {
		System.out.println("개가 집으로 들어갑니다.");
	}
}
