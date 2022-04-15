package com.cg.inheritance;
class Vehicle
{
	void print()
	{
		System.out.println("Vehicle types");
	}
}
class Car extends Vehicle
{
	void display()
	{
		System.out.println("Mercedes Benz");
	}
}
class Bike extends Vehicle
{
	void display()
	{
		System.out.println("R15");
	}
}

public class Hierachicalinheritance {

	public static void main(String[] args) 
	{
		Bike b = new Bike();
		Car c = new Car();
		b.display();
		c.display();
		b.print();
	}

}
