package n1exercici1;

public class Dog extends Animal {

	private String name;
	private String animalClass;
	private boolean canJump;
	
	public Dog(String name, String animalClass, boolean canJump) {
		
		super(name, animalClass, canJump);
		
	}
	
	@Override
	public void makeSound() {
		
		System.out.println("Woof, woof woof!");
		
	}
	
}
