package com.railworld;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		  String name = sc.nextLine();
		
		
		System.out.println("Enter the age");
		 int age = sc.nextInt();
		 sc.nextLine();
		
		System.out.println("Enter the color");
		  String color = sc.nextLine();
		
		
		System.out.println("Enter the legs");
		  int legs = sc.nextInt(); 
		  
		  Animal s1 = new Animal();
		   s1.setName(name);
		   s1.setAge(age); 
		   s1.setColor(color);
		   s1.setLegs(legs);
		   
		   System.out.println(s1);
		
		
		
	} 

}
