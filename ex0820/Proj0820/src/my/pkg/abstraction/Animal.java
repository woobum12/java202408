package my.pkg.abstraction;

public abstract class Animal {
	public String model;
	public String color;
	public String name;
	
	public Animal () {
		this.model = model;
		this.color = color;
		this.name = name;
	}
	public abstract void act();
}
