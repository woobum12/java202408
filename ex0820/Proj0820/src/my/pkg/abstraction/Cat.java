package my.pkg.abstraction;

public class Cat extends Animal {
	
		public Cat(String name, String model, String color) {
			super(name, model, color);
			
			System.out.println("고양이 이름: " + super.name);
			System.out.println("종류: " + super.model);
			System.out.println("색깔: " + super.color);
		}
		
		
		@Override
		public void act() {
			System.out.println(super.name + "가 뛰어갑니다");
		}
}
