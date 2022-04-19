package com.cg.polymorphism;
class Renault
{
	String color;
	int speed;
	Renault()
	{
		System.out.println("Renaul-RXE");
	}
	Renault(String str, int s)
	{
	   color=str;
	   speed=s;
	   System.out.println("color is "+str + " "+"speed is "+s);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Renault r = new Renault();
		Renault r1 = new Renault("yellow",50);
		
	}

}
