package my;

public class Puppy {
	String name;
	String model;
	String color;
	
	public Puppy (String name, String model, String color) {
		this.name = name;
		this.model = model;
		this.color = color;
	}
		
		public void setName(String name1) {
			this.name = name1;
		}
		public void getName() {
			System.out.println("강아지 이름은: " + name );
		}
}
	

