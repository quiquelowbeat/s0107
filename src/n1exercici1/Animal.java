package n1exercici1;

public class Animal {

	private String name;
	private String animalClass;
	private boolean canJump;
	
	public Animal(String name, String animalClass, boolean canJump) {
		
		this.name = name;
		this.animalClass = animalClass;
		this.canJump = canJump;
		
	}
	
	public void makeSound() {
		
		System.out.println("Generic animal sound.");
		
	}
	
	
}
