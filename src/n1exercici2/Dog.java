package n1exercici2;

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

	/**
	 * @deprecated
	 * 
	 * This method will disappear in the next version. Don't use it!
	 * 
	 **/
	
	@Deprecated
	public String wannaPlay(boolean playOrder) {
		
		return (playOrder) ? "Wanna play with you, human!" : "Get out!";
		
	}
	
}
