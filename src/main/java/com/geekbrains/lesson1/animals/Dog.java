package com.geekbrains.lesson1.animals;

public class Dog extends Animal {
	static int dogCount = 0;
	 
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
		dogCount++;
	}
	
	
	

	public static int getDogCount() {
		return dogCount;
	}




	@Override
	public void voice() {
		System.out.println(name + " Woof Woof");
	}

	@Override
	public String toString() {
		return "I AM A DOG";
	}

	@Override
	public void run(int range) {
		if (range <= 500) {
			System.out.println(name + " пробежал " + range + " m");
		}
		else {
			System.out.println(name +  " не может пробежать " + range + " m");
		}
	}

	@Override
	public void swim(int range) {
		if (range <= 10) {
			System.out.println(name + " проплыл " + range + " m");
		}
		else {
			System.out.println(name +  " не может роплыть " + range + " m");
		}
	}
	
	
	
	
}
