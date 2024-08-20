package myPkgInheritance;

public class Pet {

	public static void main(String[] args) {
		Pets dog = new Pets("도베르만", "황색", "맹구");
		Pets cat = new Pets("페르시안", "검은색", "몰리");
		Pets Bird = new Pets("앵무새", "무지개", "쨱짹이");
		Pets snake = new Pets("보아", "갈색", "덩이");
		
		System.out.println("우리강아지는 " + dog.model + "이고 색상은 " + dog.color + "이고 이름은 " + dog.name + "입니다.");
		
		dog.asd = new Dog();
		dog.act();
		
		System.out.println();
		
		System.out.println("우리고양이는 " + cat.model + "이고 색상은 " + cat.color + "이고 이름은 " + cat.name + "입니다.");
		
		cat.asd = new Cat();
		cat.act();
		
		System.out.println();
		
		System.out.println("우리새는 " + Bird.model + "이고 색상은 " + Bird.color + "이고 이름은 " + Bird.name + "입니다.");
		
		Bird.asd = new Bird();
		Bird.act();
		
		System.out.println();
		
		System.out.println("우리뱀은 " + snake.model + "이고 색상은 " + snake.color + "이고 이름은 " + snake.name + "입니다.");
		
		snake.asd = new Snake();
		snake.act();
	}

}
