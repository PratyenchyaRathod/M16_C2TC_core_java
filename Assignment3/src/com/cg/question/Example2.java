// A Robot wants to move through a cave grid of size M*N. (M-Rows,N-Columns). It can Start from(0,0)and destination is(M-1,N-1).It can only move right or down. Calculate the total number of ways robot can reach the destination.

package com.cg.question;
class Robot
{
	static int numberOfPaths(int m, int n)
	{
	if(m==1 || n ==1)
		return 1;
	return numberOfPaths(m-1 , n)+numberOfPaths(m,n-1);
	}

	public static void main(String[] args) 
	{
		System.out.println(numberOfPaths(2,3));
		
	}

}
