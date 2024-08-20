package my.pkg.abstraction;

public class AnimalAct {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.act();
		
		Cat cat = new Cat();
		cat.act();
		
		animalAct(new Bird());
		animalAct(new Snake());
	}
		
		public static void animalAct(Animal animal) {
			animal.act();
		}
	}


