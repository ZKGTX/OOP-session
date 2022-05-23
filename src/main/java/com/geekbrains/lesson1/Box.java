package com.geekbrains.lesson1;

public class Box {
	String color;
	int size;
	
	public Box(String color, int size) {
		super();
		this.color = color;
		this.size = size;
	}
	
		
	@Override 
		public boolean equals (Object object) {
			if (this == object) {
				return true;
			}
			
			if (!(object instanceof Box)) {
				return false;
			}
			
			Box anotherBox = (Box) object;
			return this.color.equals(anotherBox.color) && this.size == anotherBox.size;
		}
		
	@Override 
	public int hashCode () {
		return color.length() * 13 + size * 71;
	}
}
