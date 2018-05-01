package com.nithya;

public class App {

	public static void main(String[] args) {

		AnimalService as = new AnimalService();
		
		Animal animal = new Animal();
		as.displayAnimal(animal);
		
		Dog dog = new Dog();
		as.displayAnimal(dog);
		
		Animal dogAnimal = new Dog();
		as.displayAnimal(dogAnimal);
		
		Cat cat = new Cat();
		as.displayAnimal(cat);
		
		Animal catAnimal = new Cat();
		as.displayAnimal(catAnimal);
	}
}
