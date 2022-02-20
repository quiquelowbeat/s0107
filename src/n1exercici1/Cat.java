package n1exercici1;

public class Cat extends Animal {

	private String name;
	private String animalClass;
	private boolean canJump;
	
	public Cat(String name, String animalClass, boolean canJump) {
		
		super(name, animalClass, canJump);
		
	}
	
	@Override
	public void makeSound() {
		
		System.out.println("Miau miau miauuu!");
		
	}

}
