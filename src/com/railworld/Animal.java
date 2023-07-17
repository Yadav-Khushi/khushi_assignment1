package com.railworld;

public class Animal {
	
	public String name;
	
	public int age;
	
	public String color;
	
	public int legs;
	
	
	public Animal() {
		
	}


	public Animal(String name, int age, String color, int legs) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.legs = legs;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getLegs() {
		return legs;
	}


	public void setLegs(int legs) {
		this.legs = legs;
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", color=" + color + ", legs=" + legs + "]";
	}
	
	
	
	

}
