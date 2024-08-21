package my.pkg.abstraction;

public class AnimalAct {

	public static void main(String[] args) {
		
		
		
		Dog dog = new Dog("돌돌", "도베르만", "갈색");
		dog.act();
		
		System.out.println();
		
		Cat cat = new Cat("용용", "페르시안", "검은색");
		cat.act();
		
		System.out.println();
		
		animalAct(new Bird("컹컹", "앵무새", "무지개"));
		
		System.out.println();
		
		animalAct(new Snake("얍얍", "도마", "주황색"));
	}
		
		public static void animalAct(Animal animal) {
			animal.act();
		}
	}


