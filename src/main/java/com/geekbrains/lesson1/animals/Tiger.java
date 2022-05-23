package com.geekbrains.lesson1.animals;

public class Tiger extends Animal {
	static int tigerCount = 0;
	
	
	public Tiger (String name, String color, int age) {
		super (name, color, age);
		tigerCount++;
	}
	
	

	public static int getTigerCount() {
		return tigerCount;
	}



	@Override
	public void voice() {
		System.out.println("Roooooaaar");
	}

	@Override
	public void run(int range) {
		System.out.println(name + " не собирается никуда бежать");
	}

	@Override
	public void swim(int range) {
		System.out.println(name + " не собирается никуда плыть");

	}
	
	
}
