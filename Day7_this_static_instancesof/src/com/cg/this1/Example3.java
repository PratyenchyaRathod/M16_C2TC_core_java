package com.cg.this1;

public class Example3 {
	void accept(Example3 obj)
	{
		System.out.println("Wlecome to C2TC Program");
	}
    void print()
    {
    	accept(this);
    }
	public static void main(String[] args) {
		Example3 e = new Example3();
		e.print();
	}

}