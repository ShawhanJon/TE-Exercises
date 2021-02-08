package com.techelevator;

public class TriangleWall extends Wall {
	
	private int base;
	private int height;

	public TriangleWall(String name, String color, int base, int height) {
		super(name, color);
	}

	@Override
	public int getArea() {
		return (base * height) / 2;
	}
	
	public String toString() {
		
		return super.getName() + " " + ((base * height) / 2) + " triangle";
	
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}
	
	

}
