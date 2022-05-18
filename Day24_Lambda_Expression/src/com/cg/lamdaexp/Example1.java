package com.cg.lamdaexp;
interface A
{
	void show();
}
/*class B implements A
{
	public void show()
	{
		System.out.println("Functional Interface");
	}
}
*/

public class Example1 {
//Lambda Expression with No Parameter
	public static void main(String[] args) 
	{
		A obj = ()->
		{
			System.out.println("Functional Interface");
		};
		obj.show();

	}

}
