package com.cg.exception;

public class Program4 {

	public static void main(String[] args)
	{
		String[] s = {"abc", "123", null, "xyz" } ;
		for (int i = 0 ; i<5 ; i++)
		{
			try
			{
				int a = s[i].length() + Integer.parseInt(s[i]);
			}
			catch (NumberFormatException e)
			{
				System.out.println("Handled above mentioned three exception");
			}
			catch (NullPointerException e1)
			{
				System.out.println("Handled above mentioned three Exception");
			}
			catch (ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("Handled above mentioned three Exception");
			}
		}
		}
	}


