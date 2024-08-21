package my.pkg.abstraction;

public abstract class Animal {
	
	public static String name;
	public static String model;
	public static String color;
	
	public Animal(String name, String model, String color) {
		this.name = name;
		this.model = model;
		this.color = color;
	}
	
	public abstract void act();
}
