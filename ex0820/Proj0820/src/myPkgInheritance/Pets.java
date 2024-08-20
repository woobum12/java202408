package myPkgInheritance;

public class Pets {
	public String model;
	public String color;
	public String name;
	public PetAct asd;
	
	public Pets (String model, String color, String name) {
		this.model = model;
		this.color = color;
		this.name = name;
	}
	
	public void act() {
		asd.act();
	}
}
