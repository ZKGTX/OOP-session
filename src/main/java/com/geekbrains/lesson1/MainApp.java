package com.geekbrains.lesson1;

import com.geekbrains.lesson1.animals.Animal;
import com.geekbrains.lesson1.animals.Cat;
import com.geekbrains.lesson1.animals.Dog;
import com.geekbrains.lesson1.animals.Tiger;

public class MainApp {
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat("Барсик", "черный", 3);
		
		Cat cat2 = new Cat("Мурзик", "белый", 2);
		
		Dog dog = new Dog("Спайк", "коричневый", 4);
		
		Animal tiger = new Tiger("Шерхан", "полосатый", 3); 
		
		cat1.info();
		cat2.info();
		
		Cat[] cats = new Cat[2];
		cats[0] = cat1;
		cats[1] = cat2;
		
		for (Cat cat: cats) {
			cat.voice();
		}
		
		Animal[] pets = {cat1, dog, tiger};
		for (Animal pet: pets) {
			pet.voice();
			pet.run(300);
			pet.swim(5);
		}
		
		
		System.out.println("Всего котов: " + Cat.getCatCount());
		System.out.println("Всего собак: " + Dog.getDogCount());
		System.out.println("Всего тигров: " + Tiger.getTigerCount());
		System.out.println("Всего животных: " + Animal.getAnimalCount());

		


		
		
		dog.voice();
		
		System.out.println(dog);
		
		Box box1 = new Box ("Green", 2);
		Box box2 = new Box ("Blue", 2);
		System.out.println(box1.equals(box2));
		
		

		
	}
}
