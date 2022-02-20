package n1exercici2;

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
	
	/**
	 * @deprecated
	 * 
	 * This method will disappear in the next version. So useless...
	 * 
	 **/
	
	@Deprecated
	public void makePurr() {
		
		System.out.println("Urrr urrrrrr!");
		
	}

}
