package com.geekbrains.lesson1.animals; 



public class Cat extends Animal {
	int clawsLength;
	static int catCount = 0;

	
	public Cat(String name, String color, int age) {
		super(name, color, age);
		catCount++;
	}	
	
	
	public Cat(String name, String color, int age, int clawsLength) {
		super(name, color, age);
		this.clawsLength = clawsLength;
		catCount++;
	}	
	
	
	
	public static int getCatCount() {
		return catCount;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public void voice() {
		System.out.println(name + " Meow");
	}


	@Override
	public void run(int range) {
		if (range <= 200) {
			System.out.println(name + " пробежал " + range + " m");
		}
		
		else {
			System.out.println(name + " не может столько бежать");
		}
	}


	@Override
	public void swim(int range) {
		System.out.println(name + " не умеет плавать");
	}
	
	 
	


	
	
	

	
	
	
}
