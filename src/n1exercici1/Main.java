package n1exercici1;

public class Main {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("Feline", "Mammalia", true);
		
		Cat cat1 = new Cat("Domestic cat", "Mammalia", true);
		
		Dog dog1 = new Dog("Can", "Mammalia", true);
		
		animal1.makeSound();
		
		cat1.makeSound();
		
		dog1.makeSound();

	}

}
