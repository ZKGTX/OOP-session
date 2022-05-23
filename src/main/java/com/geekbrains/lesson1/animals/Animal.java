package com.geekbrains.lesson1.animals;

public abstract class Animal {
	
	 String name;
	 String color;
	 int age; 
	 
	 static int animalCount = 0;
	 
	 
	 
	 
	 public static int getAnimalCount() {
		return animalCount;
	}

	public Animal() {
		 animalCount++;
	 }
	 
	 public Animal(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
		animalCount++;
	}

	public abstract void voice ();
	
	public void run (int range) {
		System.out.println(name + " running");
	}
	
	public void swim (int range) {
		System.out.println(name +  " swimming");
	}
		
		public final void info () {
			System.out.println(name + " " + color + " " + age);
		}
		
		public static void doSomething() {
			System.out.println("I FART VERY LOUD");
		}

}
